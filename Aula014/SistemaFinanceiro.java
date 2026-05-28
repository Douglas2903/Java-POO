package Aula014;

import java.util.Scanner;

public class SistemaFinanceiro{
   public static void main(String[] args){
      int qtdItens, matricula;
      double salarioMensal, precoItens;
      String tipo, nome, cargo;
      Pagavel p;
      Scanner sInput = new Scanner(System.in);
      Scanner nInput = new Scanner(System.in);
      System.out.println("Tipo de pagamento? (f-fatura/ s-salario)");
      tipo = sInput.nextLine();
      if(!tipo.equalsIgnoreCase("f") && !tipo.equalsIgnoreCase("s")){
         System.out.println("Tipo de pagamento não identificado");
      }else{
         if (tipo.equalsIgnoreCase("f")){
            System.out.println("Quantidade de itens: ");
            qtdItens = nInput.nextInt();
            System.out.println("Preco por item: ");
            precoItens = nInput.nextDouble();
            p = new Fatura(qtdItens, precoItens);
         }else{
            System.out.println("Matricula: ");
            matricula = nInput.nextInt();
            
            System.out.println("Nome: ");
            nome = sInput.nextLine();
            
            System.out.println("Cargo: ");
            cargo = sInput.nextLine();
            
            System.out.println("Salario: ");
            salarioMensal = nInput.nextDouble();
            
            p = new FuncionarioAssalariado(matricula, nome, cargo, salarioMensal);
         }
         System.out.println(p.getPagamento());
      }
      sInput.close();
      nInput.close();
   }
}
