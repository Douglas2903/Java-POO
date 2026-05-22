package Aula06;

public class Spotify implements Player{

    private boolean ligado;
    private boolean tocando;
    private int musicaAtual;

    public Spotify(){
        this.ligado = false;
        this.tocando = false;
        this.musicaAtual = 0;
    }

    private void setLigado(boolean b){
        this.ligado = b;
    }

    private boolean getLigado(){
        return this.ligado;
    }

    private void setTocando(boolean b){
        this.tocando = b;
    }

    private boolean getTocando(){
        return this.tocando;
    }

    private void setMusicaAtual(int n){
        this.musicaAtual = n;
    }

    private int getMusicaAtual(){
        return this.musicaAtual;
    }
    
    @Override
    public void ligar(){
        if (this.getLigado()) {
            System.out.println("Spotify já está ligado");
        }else{
            this.setLigado(true);
            System.out.println("Spotify ligado");
        }
    }

    
    @Override
    public void desligar(){
        if (this.getLigado()) {
            this.setTocando(false);
            this.setLigado(false);
            System.out.println("Spotify desligado");
        }
    }
    
    @Override
    public void tocar(){
        if (this.getLigado() && !this.getTocando()) {
            this.setTocando(true);
            System.out.printf("Spotify tocando música %d\n", this.getMusicaAtual());
        }
    }

    
    @Override
    public void pausar(){
        if (this.getLigado() && this.getTocando()) {
            this.setTocando(false);
            System.out.println("Spotify pausado");
        } else {
            System.out.println("Não foi possível pausar");
        }
    }

    
    @Override
    public void avancar(){
        if (this.getLigado()) {
            this.setMusicaAtual(this.getMusicaAtual() + 1);
            System.out.printf("Avançando para a música %d\n", this.getMusicaAtual());
        }
    }

    
    @Override
    public void voltar(){
        if(this.getLigado()){
            if (this.getMusicaAtual() > 0) {
                this.setMusicaAtual(getMusicaAtual() - 1);
            }else{
                System.out.println("Não é possível voltar.");
            }
        }
    }

}
