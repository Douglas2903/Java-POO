package Aula07;

public class Leitor {
    private String nome;
    private int idade;
    private Livro[] livrosEmprestados;
    private int quantidadeLivros;

    public Leitor(String nome, int idade){
        this.nome = nome;
        this.idade = idade;
        this.livrosEmprestados = new Livro[3];
        this.quantidadeLivros = 0;
    }

    public String getNome(){
        return this.nome;
    }

    public int getIdade(){
        return this.idade;
    }

    public void pegarLivro(Livro livro){
        if (this.quantidadeLivros < this.livrosEmprestados.length) {
            if (livro.isEmprestado()) {
                System.out.println("O livro já está alugado!");
            }else{
                this.livrosEmprestados[quantidadeLivros] = livro;
                this.quantidadeLivros++;
                System.out.println("Livro adicionado com sucesso.");
                livro.emprestar();
            }
        }else{
            System.out.println("Você não pode alugar mais livros!");
        }
    }

    public void devolverLivro(Livro livro){
        if (this.quantidadeLivros <= 0) {
            System.out.println("Não há livros para serem devolvidos.");
        }else{
            for(int i = 0; i < this.quantidadeLivros; i++){
                if (this.livrosEmprestados[i] == livro){
                    livro.devolver();
                    for(int j = i; j < this.quantidadeLivros - 1; j++){
                        int aux = j + 1;
                        this.livrosEmprestados[j] = this.livrosEmprestados[aux];
                    }
                    this.livrosEmprestados[quantidadeLivros - 1] = null;
                    this.quantidadeLivros--;
                    System.out.printf("Livro '%s' devolvido.", livro.getTitulo());
                    break;
                }
            }
        }
    }

    public void listarLivros(){
        if (quantidadeLivros == 0) {
            System.out.printf("%s não alugou nenhum livro.", this.getNome());
        }else{
            System.out.println("Livros alugados por " + this.getNome() + ":");
            for(int i = 0; i < quantidadeLivros; i++){
                System.out.printf("Livro %d: %s\n", i + 1, this.livrosEmprestados[i].getTitulo());
            }
        }
    }
}
