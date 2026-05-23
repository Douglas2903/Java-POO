package Aula07;

public class Biblioteca {
    private String nome;
    private Livro[] livros;
    private Leitor[] leitores;
    private int quantidadeLivros;
    private int quantidadeLeitores;

    public Biblioteca(String nome){
        this.nome = nome;
        this.livros = new Livro[10];
        this.leitores = new Leitor[10];
        this.quantidadeLivros = 0;
        this.quantidadeLeitores = 0;
    }

    public String getNome(){
        return this.nome;
    }

    public Livro[] getLivros(){
        return this.livros;
    }

    public Leitor[] getLeitores(){
        return this.leitores;
    }

    private void setQuantidadeLivros(int qtde){
        this.quantidadeLivros = qtde;
    }

    public int getQuantidadeLivros(){
        return this.quantidadeLivros;
    }

    private void setQuantidadeLeitores(int qtde){
        this.quantidadeLeitores = qtde;
    }

    public int getQuantidadeLeitores(){
        return this.quantidadeLeitores;
    }

    public void adicionarLivro(Livro l){
        if (this.getQuantidadeLivros() >= this.livros.length) {
            System.out.println("Não é possível adicionar mais livros - Capacidade MÁX atingida (" + this.getQuantidadeLivros() + ")!");
        }else{
            this.livros[this.getQuantidadeLivros()] = l;
            this.setQuantidadeLivros(this.getQuantidadeLivros() + 1);
        }
    }

    public void cadastrarLeitor(Leitor l){
        if(this.getQuantidadeLeitores() >= this.leitores.length){
            System.out.println("Não é possível adicionar mais leitores - Capacidade MÁX atingida (" + this.getQuantidadeLeitores() + ")!");
        }else{
            this.leitores[this.getQuantidadeLeitores()] = l;
            this.setQuantidadeLeitores(this.getQuantidadeLeitores() + 1);
        }
    }

    public void listarLivros(){
        if (this.getQuantidadeLivros() == 0) {
            System.out.println("Ainda não há livros cadastrados!");
        }else{
            System.out.println("Na biblioteca " + this.getNome() + " temos " + this.getQuantidadeLivros() + " livros cadastrados! Sendo eles:");
            for(int i = 0; i < this.getQuantidadeLivros(); i++){
                System.out.printf("Livro %d: '%s'\n", i + 1, this.livros[i].getTitulo());
            }
        }
    }

    public void listarLeitores(){
        if (this.getQuantidadeLeitores() == 0) {
            System.out.println("Ainda não há leitores cadastrados!");
        }else{
            System.out.println("Na biblioteca " + this.getNome() + " temos " + this.getQuantidadeLeitores() + " leitores cadastrados! Sendo eles:");
            for(int i = 0; i < this.getQuantidadeLeitores(); i++){
                System.out.printf("Leitor %d: '%s'\n", i + 1, this.leitores[i].getNome());
            }
        }
    }

    public void realizarEmprestimo(Leitor leitor, Livro livro){
        if (!livro.isEmprestado()) {
            leitor.pegarLivro(livro);
            System.out.printf("Livro '%s' alugado por %s\n", livro.getTitulo(), leitor.getNome());
        }else{
            System.out.println("O livro " + livro.getTitulo() + " já foi alugado! Por favor aguarde...");
        }
    }

    public void realizarDevolucao(Leitor leitor, Livro livro){
        
    }
}
