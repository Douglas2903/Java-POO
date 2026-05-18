package ExerciciosRevisao;

import java.util.Scanner;

public class TiposDistintos {
    public static void main(String[] args) {
        Scanner inputString = new Scanner(System.in);
        Scanner inputInt = new Scanner(System.in);
        Scanner inputDouble = new Scanner(System.in);
        String nome;
        int idade;
        double salario;

        System.out.print("Digite o nome: ");
        nome = inputString.nextLine();

        System.out.print("Digite a idade: ");
        idade = inputInt.nextInt();

        System.out.print("Digite o nome: ");
        salario = inputDouble.nextDouble();

        System.out.println("Dados lidos:");
        System.out.printf("Nome: %s\n", nome);
        System.out.printf("Idade: %d\n", idade);
        System.out.printf("Salario: %.2f\n", salario);

        inputString.close();
        inputInt.close();
        inputDouble.close();
    }
}
