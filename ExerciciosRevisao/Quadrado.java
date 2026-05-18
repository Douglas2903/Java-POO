package ExerciciosRevisao;

import java.util.Scanner;

public class Quadrado {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n, impar = 1, quadrado = 0;
        do{
            System.out.print("Digite um numero natural (n >= 0): ");
            n = input.nextInt();
        }while(n < 0);

        for(; n > 0; n--){
            quadrado += impar;
            impar += 2;
        }

        System.out.print("Quadrado: " + quadrado);

        input.close();
    }
}
