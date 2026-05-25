package Aula012.Polimorfismo;

public class Funcionario {
    private String nome;
    private double salario;

    public Funcionario(String nome, double salario){
        this.setNome(nome);
        this.setSalario(salario);
    }

    private void setNome(String nome){
        this.nome = nome;
    }

    public String getNome(){
        return this.nome;
    }

    private void setSalario(double salario){
        this.salario = salario;
    }

    public double getSalario(){
        return this.salario;
    }

    public double calcularBonus(){
        return this.salario * 0.1;
    }
}
