package Aula010.Heranca;

public class Pessoa {
    private String nome;
    private int idade;
    private double peso;

    public Pessoa(String nome, int idade, double peso){
        this.setNome(nome);
        this.setIdade(idade);
        this.setPeso(peso);
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public String getNome(){
        return this.nome;
    }

    public void setIdade(int idade){
        if (idade > 0) {
            this.idade = idade;
        }
    }

    public int getIdade(){
        return this.idade;
    }

    public void setPeso(double peso){
        if (peso > 0) {
            this.peso = peso;
        }
    }

    public double getPeso(){
        return this.peso;
    }

    public void fazerAniversario(){
        this.setIdade(this.getIdade() + 1);
    }

    public String exibirDados(){
        return String.format(
                "Nome: %s\nIdade: %d\nPeso: %.2f",
                this.getNome(),
                this.getIdade(),
                this.getPeso()
        );
    }
}
