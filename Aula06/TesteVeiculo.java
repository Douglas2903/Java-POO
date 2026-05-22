package Aula06;

public class TesteVeiculo {
    public static void main(String[] args) {
        Carro c = new Carro();
        Moto m = new Moto();

        c.ligar();
        c.acelerar();
        c.acelerar();
        c.virar("esquerda");
        c.frear();
        c.desligar();
        c.frear();
        c.desligar();

        m.ligar();
        m.acelerar();
        m.virar("direita");
        m.frear();
        m.desligar();

        Veiculo v1 = new Carro();
        Veiculo v2 = new Moto();

        v1.ligar();
        v2.ligar();
    }
}
