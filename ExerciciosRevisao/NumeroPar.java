package ExerciciosRevisao;

import java.util.Scanner;

public class NumeroPar {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n;
        System.out.print("Digite um numero inteiro: ");
        n = input.nextInt();

        if (n % 2 == 0) {
            System.out.printf("O numero %d e PAR", n);
        }else{
            System.out.printf("O numero %d e IMPAR", n);   
        }

        input.close();
    }
}
