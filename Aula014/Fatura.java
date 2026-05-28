package Aula014;

public class Fatura implements Pagavel{
   private int qtd;
   private double preco;
   
   public Fatura(int qtd, double preco){
      if (qtd < 0){
         System.out.println("Quantidade de itens deve ser maior que zero!");
      }else{
         this.qtd = qtd;
      }
      
      if (preco < 0){
         System.out.println("O preco dos itens deve ser maior que zero!");
      }else{
         this.preco = preco;
      }
   }
   
   public int getQuantidade(){
      return this.qtd;
   }
   
   public double getPreco(){
      return this.preco;
   }
   
   public double getPagamento(){
      return qtd*preco;
   }
   
}