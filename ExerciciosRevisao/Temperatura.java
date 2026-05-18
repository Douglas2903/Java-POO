package ExerciciosRevisao;

import java.util.Scanner;

public class Temperatura {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double celsius, fahrenheit;
        System.out.print("Digite a temperatura em Fahrenheit: ");
        fahrenheit = input.nextDouble();
        celsius = (fahrenheit - 32) * 5 / 9;
        System.out.printf("%.1f F = %.1f C", fahrenheit, celsius);
        input.close();
    }
}
