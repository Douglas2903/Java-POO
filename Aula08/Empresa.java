package Aula08;

public class Empresa {
    private String nome;
    private Funcionario[] funcionarios;
    private int quantidadeFuncionarios;

    public Empresa(String nome){
        this.nome = nome;
        this.funcionarios = new Funcionario[10];
        this.quantidadeFuncionarios = 0;
    }

    public String getNome(){
        return this.nome;
    }

    public Funcionario[] getFuncionarios(){
        return this.funcionarios;
    }

    public int getQuantidadeFuncionarios(){
        return this.quantidadeFuncionarios;
    }

    public void contratarFuncionarios(Funcionario f){
        if (f.getAtivo()) {
            if (this.quantidadeFuncionarios < this.funcionarios.length) {
                funcionarios[quantidadeFuncionarios] = f;
                this.quantidadeFuncionarios++;
            }else{
                System.out.println("Não estamos contratando. Estamos lotados!");
            }
        }else{
            System.out.println("Erro ao contratar!");
        }
    }

    public void listarFuncionarios(){
        if (this.quantidadeFuncionarios == 0) {
            System.out.println("Não há funcionários na empresa " + this.getNome());
        }else{
            for(int i = 0; i < this.quantidadeFuncionarios; i++){
                if (this.funcionarios[i].getAtivo()) {
                    this.funcionarios[i].apresentar();
                }
            }
        }
    }

    public double calcularFolhaPagamento(){
        double total = 0;
        for(int j = 0; j < this.quantidadeFuncionarios; j++){
            if (funcionarios[j].getAtivo()) {
                total += funcionarios[j].getSalario();
            }
        }
        return total;
    }

    public void demitirFuncionario(Funcionario f){
        if (f.getAtivo()) {
            for(int k = 0; k < this.quantidadeFuncionarios; k++){
                if (this.funcionarios[k] == f) {
                    int aux = k + 1;
                    for(int l = k; l < quantidadeFuncionarios - 1; l++){
                        this.funcionarios[l] = funcionarios[aux];
                        aux++;
                    }
                    f.demitir();
                    this.funcionarios[this.quantidadeFuncionarios - 1] = null;
                    this.quantidadeFuncionarios--;
                    break;
                }
            }
        }else{
            System.out.println("Funcionário " + f.getNome() + " já está inativado da empresa.");
        }
    }

}
