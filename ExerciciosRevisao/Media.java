package ExerciciosRevisao;

import java.util.Scanner;

public class Media {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double p1, p2, media;

        System.out.print("Digite as duas notas: ");
        p1 = input.nextDouble();
        p2 = input.nextDouble();
        media = (p1 + p2) / 2;
        if (media >= 6){
            System.out.println("Aprovado com media " + media);
        }else if (media >= 4){
            System.out.println("Recuperacao com media " + media);
        }else{
            System.out.println("Reprovado com media " + media);
        }

        input.close();
    }
}
