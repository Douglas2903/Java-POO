package Aula010;

public class Bolsista extends Aluno {
    private double bolsa;

    public void renovarBolsa(){
        System.out.println("Renovando bolsa de " + this.nome);
    }

    @Override
    public void pagarMensalidade(){
        System.out.println(this.nome + " é bolsista! Pagamento facilitado.");
    }

    public void setBolsa(double bolsa){
        this.bolsa = bolsa;
    }

    public double getBolsa(){
        return this.bolsa;
    }
}
