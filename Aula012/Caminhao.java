package Aula012;

public class Caminhao extends Veiculo {
    private double capacidade;
    private int numEixos;

    public Caminhao(String modelo, String placa, int anoFabr,
                     double capacidade, int numEixos, double valor){

        super(modelo, placa, anoFabr, valor);

        setCapacidade(capacidade);
        setNumEixos(numEixos);
    }

    public void setCapacidade(double capacidade){
        this.capacidade = capacidade;
    }

    public double getCapacidade(){
        return capacidade;
    }

    public void setNumEixos(int numEixos){
        this.numEixos = numEixos;
    }

    public int getNumEixos(){
        return numEixos;
    }

    public void imprime(){
        System.out.printf("\nVeiculo: %s\nPlaca: %7s", modelo, placa);
        System.out.printf("\nAno Fabr: %4d\nCapacidade(toneladas): %.2f",
                          anoFabr, capacidade);

        System.out.printf("\n%02d Eixos\nR$ %.2f\n",
                          numEixos, valor);
    }
}