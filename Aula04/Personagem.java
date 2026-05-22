package Aula04;

public class Personagem {

    private String nome;
    private int pontosVida;
    private int nivel;

    public Personagem(String nome, int pontosVida, int nivel){

        setNome(nome);

        if (pontosVida < 0) {
            System.out.println("Pontos de vida inválido.");
        }else if(pontosVida > 100){
            System.out.println("Vida máxima permitida é 100!");
            this.pontosVida = 100;
        }else{
            this.pontosVida = pontosVida;
        }

        if (nivel <= 0) {
            System.out.println("Nivel tem que ser no mínimo 1.");
            this.nivel = 1;
        }else{
            this.nivel = nivel;
        }
    }

    public void setNome(String s){
        if (s == null || s.trim().isEmpty()) {
            System.out.println("Campo invalido!");
        }else{
            this.nome = s;
        }
    }

    public void receberDano(int dano){
        if (dano < 0) {
            System.out.println("Valor de dano inválido!");
        }else if (dano >= this.pontosVida){
            this.pontosVida = 0;
        }else{
            this.pontosVida -= dano;
        }
    }

    public void curar(int cura){
        if (cura + this.pontosVida > 100) {
            System.out.println("Vida máxima permitida é 100!");
            this.pontosVida = 100;
        }else if(cura < 0){
            System.out.println("Valor de cura inválido!");
        }else{
            this.pontosVida += cura;
        }
    }

    public void subirNivel(){
        this.nivel += 1;
    }

    public String getNome(){
        return this.nome;
    }

    public int getPontosVida(){
        return this.pontosVida;
    }

    public int getNivel(){
        return this.nivel;
    }

    public void exibirStatus(){
        System.out.println("========================");
        System.out.printf("Nome : %s\n", getNome());
        System.out.printf("Vida : %d\n", getPontosVida());
        System.out.printf("Nivel: %d\n", getNivel());
        System.out.println("========================");
    }
}
