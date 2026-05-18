package ExerciciosRevisao;

import java.util.Scanner;

public class Caixa {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double valor, total = 0, desconto = 0, valorFinal;

        do {
            System.out.print("Digite o valor da mercadoria (0 para finalizar): ");
            valor = input.nextDouble();
            while (valor < 0) {
                System.out.print("Valor inválido! Digite novamente: ");
                valor = input.nextDouble();
            }
            total += valor;
        } while (valor != 0);

        if (total < 50) {
            desconto = 0.05;

        } else if (total <= 100) {
            desconto = 0.10;

        } else if (total <= 200) {
            desconto = 0.15;

        } else {
            desconto = 0.20;
        }

        valorFinal = total * (1 - desconto);

        System.out.printf("\nValor total: R$ %.2f", total);
        System.out.printf("\nDesconto aplicado: %.0f%%", desconto * 100);
        System.out.printf("\nValor final a pagar: R$ %.2f", valorFinal);

        input.close();
    }
}