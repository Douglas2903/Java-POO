package Tratamento_de_erros;

public class Retangulo extends FormaGeometrica {

    private double base;
    private double altura;

    public Retangulo(double base, double altura) throws Exception {

        super.setLados(4);

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

        return base * altura;
    }

    public void imprime() {

        System.out.println("Dados do Retangulo");
        super.imprime();

        System.out.println("Base: " + base);
        System.out.println("Altura: " + altura);
    }
}