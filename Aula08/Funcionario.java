package Aula08;

public class Funcionario {
    private String nome;
    private int idade;
    private String cargo;
    private double salario;
    private boolean ativo;

    public Funcionario(String nome, int idade, String cargo, double salario){
        this.setNome(nome);
        this.setIdade(idade);
        this.setCargo(cargo);
        this.setSalario(salario);
        if (this.nome != null && this.idade != 0 && this.cargo != null && this.salario != 0) {
            this.ativo = true;
        }else{
            this.ativo = false;
        }
    }

    private void setNome(String nome){
        if (nome == null || nome.trim().isEmpty()) {
            System.out.println("O campo 'Nome' precisa ser preenchido.");
            this.nome = null;
        }else{
            this.nome = nome;
        }
    }

    public String getNome(){
        return this.nome;
    }

    private void setIdade(int idade){
        if (idade < 18) {
            System.out.println("Menores de idade não podem trabalhar aqui!");
            this.idade = 0;
        }else{
            this.idade = idade;
        }
    }

    public int getIdade(){
        return this.idade;
    }

    private void setCargo(String cargo){
        switch (cargo) {
            case "Gerente":
                this.cargo = "Gerente";
                break;
            
            case "Vendedor":
                this.cargo = "Vendedor";
                break;

            case "Programador":
                this.cargo = "Programador";
                break;

            default:
                System.out.println("Cargo inválido!");
                this.cargo = null;
                break;
        }
    }

    public String getCargo(){
        return this.cargo;
    }

    private void setSalario(double salario){
        if (salario < 0) {
            System.out.println("Salário inválido.");
            this.salario = 0;
        }else{
            this.salario = salario;
        }
    }

    public double getSalario(){
        return this.salario;
    }

    public boolean getAtivo(){
        return this.ativo;
    }

    public void apresentar(){
        System.out.println("Nome: " + this.getNome());
        System.out.println("Idade: " + this.getIdade());
        System.out.println("Cargo: " + this.getCargo());
        System.out.printf("Salário: %.2f\n", this.getSalario());
        System.out.printf("Ativo: %s\n", (this.getAtivo()? "Disponível":"Indisponível"));
    }

    public void trabalhar(){
        if (this.getAtivo()) {
            System.out.println("Funcionário " + this.getNome() + " foi posto para trabalhar.");
        }else{
            System.out.println("Funcionário " + this.getNome() + " não está mais ativo.");
        }
    }

    public void aumentarSalario(int aumento){
        if (aumento > 0) {
            this.setSalario(getSalario() + aumento);
        }else{
            System.out.println("Valor de aumento inválido.");
        }
    }
    
    public void demitir(){
        if (this.getAtivo()) {
            System.out.println("Funcionário " + this.getNome() + " está sendo desligado da empresa. Obrigado pela contribuição!");
            this.ativo = false;
        }else{
            System.out.println("Não existe.");
        }
    }
}
