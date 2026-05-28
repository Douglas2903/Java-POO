package Aula013;

public class TesteFormas{
   public static void main(String[] args){   
      Circulo c = new Circulo(5);
      c.imprime();
      System.out.println();
      
      Retangulo r = new Retangulo(3, 4);
      r.imprime();
      System.out.println();
      
      Triangulo t = new Triangulo(3, 4);
      t.imprime();
      System.out.println();
   }
}
