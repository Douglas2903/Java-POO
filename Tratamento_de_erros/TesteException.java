package Tratamento_de_erros;

import java.util.Scanner;

public class TesteException {
    public static void main(String[] args) {
        int a, b, c;
        try{
            System.out.println("Digite 2 valores: ");
            Scanner entrada = new Scanner(System.in);
            a = entrada.nextInt();
            b = entrada.nextInt();
            c = a / b;
            System.out.println("c = " + c);
        }
        catch (ArithmeticException e){
            
            System.out.println("Erro aritmetico!");
        }
        catch (RuntimeException e){
            
            System.out.println("Erro inesperado!");
        }
        finally{
            
            System.out.println("Execucao concluida");
        }
    }
}
