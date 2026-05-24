package Aula010;

public class Caminhao extends Veiculo{
    private int capacidade;
    private int numEixos;

    public Caminhao(String modelo, String placa, int anoFabr, int capacidade, int numEixos, double valor){
        super(modelo, placa, anoFabr, valor);
        setCapacidade(capacidade);    
        setNumEixos(numEixos);
    }

    public void setCapacidade(int capacidade){
        this.capacidade = capacidade;
    }

    public int getCapacidade(){
        return this.capacidade;
    }

    public void setNumEixos(int numEixos){
        this.numEixos = numEixos;
    }

    public int getNumEixos(){
        return this.numEixos;
    }

    public void imprime(){
        System.out.printf("\nVeiculo: %s\nPlaca: %7s", modelo, placa);
        System.out.printf("\nAno Fabr: %4d\nCapacidade(toneladas): %d", anoFabr,
                capacidade);
        System.out.printf("\n%02d Eixos\nR$ %.2f\n", numEixos,
                valor);
    }

}
