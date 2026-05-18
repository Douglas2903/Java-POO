package ExerciciosRevisao;

import java.util.Scanner;

public class Adicao02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double num1, num2, soma;

        System.out.print("Digite o primeiro número: ");
        num1 = input.nextDouble();
        
        System.out.print("Digite o segundo número: ");
        num2 = input.nextDouble();

        soma = num1 + num2;
        System.out.printf("Soma: %5.2f\n", soma);

        input.close();
    }
}
