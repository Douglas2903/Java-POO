package Aula07;

public class Lutador {
    //Atributos

    private String nome;
    private String nacionalidade;
    private int idade;
    private double altura;
    private double peso;
    private String categoria;
    private int vitorias;
    private int derrotas;
    private int empates;

    //Métodos Publicos

    public void apresentar(){
        System.out.println("----------------------------------------------------");
        System.out.println("CHEGOU A HORA! Apresentamos o lutador " + this.getNome());
        System.out.println("Diretamente de " + this.getNacionalidade());
        System.out.println("com " + this.getIdade() + " anos e " + this.getAltura() + " metros");
        System.out.printf("pesando $.1fKg\n", this.getPeso());
        System.out.println(this.getVitorias() + " vitórias");
        System.out.println(this.getDerrotas() + " derrotas e");
        System.out.println(this.getEmpates() + " empates!");
    }

    public void Status(){
        System.out.println(this.getNome() + " é um peso " + getCategoria());
        System.out.println("Ganhou " + this.getVitorias() + " vezes!");
        System.out.println("Perdeu " + this.getDerrotas() + " vezes!");
        System.out.println("Empatou " + this.getEmpates() + " vezes!");
    }

    public void ganharLuta(){
        this.setVitorias(this.getVitorias() + 1);
    }

    public void perderLuta(){
        this.setDerrotas(this.getDerrotas() + 1);
    }

    public void empatarLuta(){
        this.setEmpates(getEmpates() + 1);
    }

    //Métodos Especiais

    public Lutador(String no, String na, int id, double al, double pe, int vi, int de, int em){
        this.nome = no;
        this.nacionalidade = na;
        this.idade = id;
        this.altura = al;
        setPeso(pe);
        this.vitorias = vi;
        this.derrotas = de;
        this.empates = em;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public String getNome(){
        return this.nome;
    }

    public void setNacionalidade(String nacionalidade){
        this.nacionalidade = nacionalidade;
    }

    public String getNacionalidade(){
        return this.nacionalidade;
    }

    public void setIdade(int idade){
        this.idade = idade;
    }

    public int getIdade(){
        return this.idade;
    }

    public void setAltura(double altura){
        this.altura = altura;
    }

    public double getAltura(){
        return this.altura;
    }

    public void setPeso(double peso){
        this.peso = peso;
        this.setCategoria();
    }

    public double getPeso(){
        return this.peso;
    }

    private void setCategoria(){
        if (this.peso < 52.2) {
            this.categoria = "Inválido";
        }else if (this.peso <= 70.3) {
            this.categoria = "Leve";
        }else if (this.peso <= 83.9) {
            this.categoria = "Médio";
        }else if (this.peso <= 120.2) {
            this.categoria = "Pesado";
        }else{
            this.categoria = "Inválido";
        }
    }

    public String getCategoria(){
        return this.categoria;
    }

    public void setVitorias(int vitorias){
        this.vitorias = vitorias;
    }

    public int getVitorias(){
        return this.vitorias;
    }

    public void setDerrotas(int derrotas){
        this.derrotas = derrotas;
    }

    public int getDerrotas(){
        return this.derrotas;
    }

    public void setEmpates(int empates){
        this.empates = empates;
    }

    public int getEmpates(){
        return this.empates;
    }

}
