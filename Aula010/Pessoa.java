package Aula010;

public abstract class Pessoa {
    protected String nome;
    protected int idade;
    protected String sexo;

    public void fazerAniversario(){
        this.idade ++;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public String getNome(){
        return this.nome;
    }

    public void setIdade(int idade){
        this.idade = idade;
    }

    public int getIdade(){
        return this.idade;
    }

    public void setSexo(String sexo){
        this.sexo = sexo;
    }

    public String getSexo(){
        return this.sexo;
    }

    @Override
    public String toString(){
        return "Dados{" + "nome=" + this.getNome() + ", idade=" + this.getIdade() + ", sexo=" + this.getSexo() + "}";
    }

}
