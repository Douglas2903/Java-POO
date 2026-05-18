package ExerciciosRevisao;

import java.util.Scanner;

public class Triangulo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double a, b, c;
        System.out.println("Digite os 3 lados do triangulo: ");
        System.out.print("A = ");
        a = input.nextDouble();

        System.out.print("B = ");
        b = input.nextDouble();

        System.out.print("C = ");
        c = input.nextDouble();

        if (a + b > c && a + c > b && b + c > a) {
            if (a == b && b == c) {
                System.out.print("O triangulo formado e equilatero.");
            }else if(a != b && a != c && b != c){
                System.out.print("O triangulo formado e escaleno.");
            }else{
                System.out.print("O triangulo formado e isoceles.");
            }
        }else{
            System.out.println("Com os lados informados, nao e possivel formar um triangulo");
        }

        input.close();
    }
}
