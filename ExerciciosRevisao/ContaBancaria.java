package ExerciciosRevisao;

import java.util.Scanner;

public class ContaBancaria {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n;
        System.out.print("Digite o numero da conta: ");
        n = input.nextInt();

        int numero = n;
        int soma = 0;
        
        while (n > 0) {
            soma += n % 10;
            n /= 10;
        }

        soma %= 10;

        System.out.print("Numero da conta completo: ");
        System.out.printf("%06d-%d", numero, soma);
        input.close();
    }
}
