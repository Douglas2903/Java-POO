package ExerciciosRevisao;

import java.util.Scanner;

public class LeituraString {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String frase;

        System.out.print("Digite uma frase: ");
        frase = input.nextLine();

        System.out.printf("Frase lida: %s", frase);
        input.close();
    }
}
