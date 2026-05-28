package Tratamento_de_erros;

public class TesteFormas {

    public static void main(String[] args) {

        try {

            Circulo c = new Circulo(5);
            c.imprime();

            System.out.println();

            Retangulo r = new Retangulo(3, 4);
            r.imprime();

            System.out.println();

            Triangulo t = new Triangulo(-3, 4);
            t.imprime();
        }

        catch (Exception e) {
            System.out.println("Erro identificado: " + e.getMessage());
        }
    }
}