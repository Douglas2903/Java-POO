package Aula06;

public class YoutubeMusic implements Player{

    private boolean ligado;
    private boolean tocando;
    private int musicaAtual;

    public YoutubeMusic(){
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
            System.out.println("YouTube Music já está ligado");
        }else{
            this.setLigado(true);
            System.out.println("Abrindo anúncios...");
            System.out.println("YouTube Music ligado");
        }
    }

    
    @Override
    public void desligar(){
        if (this.getLigado()) {
            this.setTocando(false);
            this.setLigado(false);
            System.out.println("YouTube Music desligado");
        }
    }
    
    @Override
    public void tocar(){
        if (this.getLigado() && !this.getTocando()) {
            System.out.printf("Reproduzindo música %d no YouTube Music\n", this.getMusicaAtual());
        }
    }

    
    @Override
    public void pausar(){
        if (this.getTocando()) {
            this.setTocando(false);
            System.out.println("YoutubeMusic pausado");
        }
    }

    
    @Override
    public void avancar(){
        if (this.getLigado()) {
            this.setMusicaAtual(this.getMusicaAtual() + 2);
            System.out.println("Pulando duas músicas");
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