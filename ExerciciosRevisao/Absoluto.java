package ExerciciosRevisao;

import java.util.Scanner;

public class Absoluto {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double n;
        System.out.print("Digite um numero: ");
        n = input.nextDouble();
        System.out.println("Modulo de n: " + (n > 0 ? n : -n));
        input.close();
    }
}
