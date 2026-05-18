package ExerciciosRevisao;

import java.util.Scanner;

public class Inverso2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n;
        
        do{
            System.out.println("Digite um numero natural: ");
            n = input.nextInt();
        }while(n < 0);

        do{
            System.out.print(n % 10);
            n /= 10;
        }while (n != 0);

        input.close();
    }
}
