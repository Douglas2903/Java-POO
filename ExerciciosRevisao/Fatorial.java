package ExerciciosRevisao;

import java.util.Scanner;

public class Fatorial {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n, i, f = 1;
        do{
            System.out.println("Digite um numero natural (n >= 0): ");
            n = input.nextInt();
        }while(n < 0);
        i = n;
        while (i > 0) {
            f *= i;
            i--;
        }
        System.out.println("Fatorial: " + f);
        input.close();
    }
}
