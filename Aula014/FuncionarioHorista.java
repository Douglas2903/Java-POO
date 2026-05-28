package Aula014;

public class FuncionarioHorista extends Funcionario {

   double vlrHora;
   int qtdHrsTrabalhadas;

   public FuncionarioHorista(int matricula, String nome, String cargo, double vlrHora, int qtdHrsTrabalhadas) {
      super(matricula, nome, cargo);
      setVlrHora(vlrHora);
      setHorasTrabalhadas(qtdHrsTrabalhadas);
   }

   public void setVlrHora(double vlrHora) {
      if (vlrHora < 0) {
         System.out.println("Valor da hora invalido");
      } else {
         this.vlrHora = vlrHora;
      }
   }

   public void setHorasTrabalhadas(int qtdHrsTrabalhadas) {
      if (qtdHrsTrabalhadas < 0) {
         System.out.println("Quantidade de horas invalida");
      } else {
         this.qtdHrsTrabalhadas = qtdHrsTrabalhadas;
      }
   }

   public double getPagamento() {
      return vlrHora * qtdHrsTrabalhadas;
   }

   public void exibeFuncionario(){
      super.exibeFuncionario();
      System.out.println(vlrHora);
      System.out.println(qtdHrsTrabalhadas);
   }
}
