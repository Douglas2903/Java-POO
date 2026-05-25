package Aula011;

public abstract class Animal {
    protected double peso;
    protected int idade;
    protected int membros;

    public abstract void locomover();
    public abstract void alimentar();
    public abstract void emitirSom();

    public void setPeso(double peso){
        this.peso = peso;
    }

    public double getPeso(){
        return this.peso;
    }

    public void setIdade(int idade){
        this.idade = idade;
    }

    public int getIdade(){
        return this.idade;
    }

    public void setMembros(int membros){
        this.membros = membros;
    }

    public int getMembros(){
        return this.membros;
    }
}
