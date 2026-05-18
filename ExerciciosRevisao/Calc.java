package ExerciciosRevisao;

import java.util.Scanner;

public class Calc {
    public static void main(String[] args) {
        Scanner eStr = new Scanner(System.in);
        Scanner eNum = new Scanner(System.in);

        System.out.println("Digite uma expressao: ");
        double x = eNum.nextDouble();
        String s = eStr.nextLine();
        double y = eNum.nextDouble();

        char op = s.charAt(0);
        switch (op) {
            case '+':
                System.out.print("valor = " + (x + y));
                break;
            case '-':
                System.out.print("valor = " + (x - y));
                break;
            case '*':
                System.out.print("valor = " + (x * y));
                break;
            case '/':
                if (y == 0) {
                    System.out.println("Impossivel dividir por zero!");
                }else{
                    System.out.print("valor = " + (x / y));
                }
                break;
            
            default:
                System.out.print("Operador invalido: " + op);
                break;
        }

        eNum.close();
        eStr.close();
    }
}
