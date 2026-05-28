package Tratamento_de_erros;

import java.lang.Math;

public class Circulo extends FormaGeometrica {

   private double raio;

   public Circulo(double raio) throws Exception {
      super.lados = 0;
      setRaio(raio);
}

    public void setRaio(double raio) throws Exception {
        if (raio < 0) {
            throw new Exception("Raio invalido");
        }
        this.raio = raio;
    }

    public double area() {
        return Math.PI * Math.pow(raio, 2);
    }

    public void imprime() {
        System.out.println("Dados do Circulo");
        super.imprime();
        System.out.println("Raio: " + raio);
    }
}