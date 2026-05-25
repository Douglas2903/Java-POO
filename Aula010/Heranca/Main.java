package Aula010.Heranca;

public class Main {
    public static void main(String[] args) {

        Aluno a1 = new Aluno(
                "Sayuri",
                20,
                55.5,
                "Hipertrofia",
                120.0
        );

        a1.fazerAniversario();

        a1.pagarMensalidade();

        System.out.println("\n--------------------\n");

        System.out.println(a1.exibirDados());
    }
}