package Aula06;

public class Main {
    public static void main(String[] args) {
        Spotify s = new Spotify();
        YoutubeMusic y = new YoutubeMusic();
        s.ligar();
        s.tocar();
        s.avancar();
        s.pausar();
        s.desligar();
        y.ligar();
        y.tocar();
        y.avancar();
        y.avancar();
        y.voltar();
        y.desligar();
    }
}
