package Aula012;

public class Veiculo {
    protected String modelo, placa;
    protected int anoFabr;
    protected double valor;

    public Veiculo(String pModelo, String pPlaca, int AnoFabr, double pValor){
        setModelo(pModelo);
        setPlaca(pPlaca);
        setAnoFabr(AnoFabr);
        setValor(pValor);
    }

    public void setModelo(String modelo){
        this.modelo = modelo;
    }

    public String getModelo(){
        return this.modelo;
    }

    public void setPlaca(String placa){
        this.placa = placa;
    }

    public String getPlaca(){
        return this.placa;
    }

    public void setAnoFabr(int anoFabr){
        this.anoFabr = anoFabr;
    }

    public int getanoFabr(){
        return this.anoFabr;
    }

    public void setValor(double valor) {
        if (valor >= 0) this.valor = valor;
        else this.valor = 0;
    }

    public double getValor() {
        return valor;
    }

    public void deprecia(float taxa) {
        setValor(valor - valor * taxa / 100);
    }

    public void imprime() {
        System.out.printf(
            "\nVeiculo: %s\nPlaca: %7s\nAno: %4d\nValor: R$%.2f\n",
            modelo, placa, anoFabr, valor
        );
    }
}
