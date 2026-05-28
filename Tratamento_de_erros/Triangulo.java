package Tratamento_de_erros;

public class Triangulo extends FormaGeometrica {

    private double base;
    private double altura;

    public Triangulo(double base, double altura) throws Exception {

        super.setLados(3);

        setBase(base);
        setAltura(altura);
    }

    public void setBase(double base) throws Exception {

        if (base < 0) {
            throw new Exception("Base invalida");
        }

        this.base = base;
    }

    public void setAltura(double altura) throws Exception {

        if (altura < 0) {
            throw new Exception("Altura invalida");
        }

        this.altura = altura;
    }

    public double area() {

        return (base * altura) / 2;
    }

    public void imprime() {

        System.out.println("Dados do Triangulo");
        super.imprime();

        System.out.println("Base: " + base);
        System.out.println("Altura: " + altura);
    }
}