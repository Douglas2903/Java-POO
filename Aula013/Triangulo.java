package Aula013;

public class Triangulo extends FormaGeometrica {

    private double base;
    private double altura;

    public Triangulo(double base, double altura) {
        super.setLados(3);
        this.base = base;
        this.altura = altura;
    }

    public double area() {
        return (base * altura) / 2;
    }

    public void imprime() {
        System.out.println("Dados do Triangulo:");
        super.imprime();
        System.out.println("Base: " + base);
        System.out.println("Altura: " + altura);
    }
}
