package Aula014;

public class Boleto implements Pagavel {

   String nomeBeneficiario;
   String dadosPagador;
   float valorBoleto;
   String linhaDigitavel;

   public Boleto(String nomeBeneficiario, String dadosPagador, float valorBoleto, String linhaDigitavel) {
      this.nomeBeneficiario = nomeBeneficiario;
      this.dadosPagador = dadosPagador;
      this.valorBoleto = valorBoleto;
      this.linhaDigitavel = linhaDigitavel;
   }

   public void setNomeBeneficiario(String nomeBeneficiario) {
      this.nomeBeneficiario = nomeBeneficiario;
   }

   public String getNomeBeneficiario() {
      return nomeBeneficiario;
   }

   public void setDadosPagador(String dadosPagador) {
      this.dadosPagador = dadosPagador;
   }

   public String getDadosPagador() {
      return dadosPagador;
   }

   public void setValorBoleto(float valorBoleto) {
      this.valorBoleto = valorBoleto;
   }

   public float getValorBoleto() {
      return valorBoleto;
   }

   public void setLinhaDigitavel(String linhaDigitavel) {
      this.linhaDigitavel = linhaDigitavel;
   }

   public String getLinhaDigitavel() {
      return linhaDigitavel;
   }

   public double getPagamento() {
      return valorBoleto;
   }

   public void exibeDados() {
      System.out.println(nomeBeneficiario);
      System.out.println(dadosPagador);
      System.out.println(valorBoleto);
      System.out.println(linhaDigitavel);
   }
}
