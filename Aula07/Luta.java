package Aula07;

import java.util.Random;

public class Luta {
    //Atributos 
    private Lutador desafiado;
    private Lutador desafiante;
    private int rounds;
    private boolean aprovada;

    //Métodos públicos

    public void marcarLuta(Lutador l1, Lutador l2){
        if ((l1.getCategoria().equals(l2.getCategoria())) && l1 != l2) {
            this.aprovada = true;
            this.desafiado = l1;
            this.desafiante = l2;
        }else{
            System.out.println("A luta não pode acontecer!");
            this.aprovada = false;
            this.desafiado = null;
            this.desafiante = null;
        }
    }

    public void lutar(){
        if (this.aprovada) {
            System.out.println("#### Desafiado ####");
            this.desafiado.apresentar();
            System.out.println("#### Desafiante ####");
            this.desafiante.apresentar();

            Random aleatorio = new Random();
            int vencedor = aleatorio.nextInt(3);

            System.out.println("============ RESULTADO DA LUTA ============");
            switch (vencedor) {
                case 0: //Empate
                    System.out.println("Empatou!");
                    this.desafiado.empatarLuta();
                    this.desafiante.empatarLuta();
                    break;
                case 1: //Desafiado vence
                    System.out.println("Vitória do " + this.getDesafiado().getNome());
                    this.desafiado.ganharLuta();
                    this.desafiante.perderLuta();
                    break;
                    
                    case 2: //Desafiante vence
                    System.out.println("Vitória do " + this.desafiante.getNome());
                    this.desafiante.ganharLuta();
                    this.desafiado.perderLuta();
                    break;
            }
            System.out.println("===========================================");
        }else{
            System.out.println("A luta não pode acontecer!");
        }
    }

    //Métodos Especiais

    public void setDesafiado(Lutador desafiado){
        this.desafiado = desafiado;
    }

    public Lutador getDesafiado(){
        return this.desafiado;
    }

    public void setDesafiante(Lutador desafiante){
        this.desafiante = desafiante;
    }

    public Lutador getDesafiante(){
        return this.desafiante;
    }

    public void setRounds(int rounds){
        this.rounds = rounds;
    }

    public int getRounds(){
        return this.rounds;
    }

    public void setAprovada(boolean aprovada){
        this.aprovada = aprovada;
    }

    public boolean getAprovada(){
        return this.aprovada;
    }

}
