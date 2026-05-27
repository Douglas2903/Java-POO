package ProjetoYoutube;

public abstract class Pessoa {
    protected String nome;
    protected int idade;
    protected String sexo;
    protected float experiencia;

    public Pessoa(String nome, int idade, String sexo) {
        this.nome = nome;
        this.idade = idade;
        this.sexo = sexo;
        this.experiencia = 0;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public int getIdade() {
        return idade;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getSexo() {
        return sexo;
    }

    public void setExperiencia(float experiencia) {
        this.experiencia = experiencia;
    }

    public float getExperiencia() {
        return experiencia;
    }

    @Override
    public String toString(){
        return "Pessoa{" + "nome=" + this.getNome() + ", idade=" + this.getIdade()
        + ", sexo=" + this.getSexo() + ", experiencia=" + this.getExperiencia() + "}";
    }
}
