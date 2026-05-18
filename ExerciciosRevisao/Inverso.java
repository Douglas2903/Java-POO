package ExerciciosRevisao;

import java.util.Scanner;

public class Inverso {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Digite um numero natural: ");
        int n = input.nextInt();

        while (n != 0) {
            System.out.print(n % 10);
            n /= 10;
        }
        input.close();
    }
}
