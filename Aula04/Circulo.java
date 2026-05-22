package Aula04;

public class Circulo {
    private double raio;

    public Circulo(double r){
        setRaio(r);
    }

    public void setRaio(double r){
        if (r < 0) {
            System.out.println("O raio não pode ser negativo.");
        }else{
            this.raio = r;
        }
    }

    public double getRaio(){
        return this.raio;
    }

    public double calcularDiametro(){
        return 2 * this.raio;
    }

    public double calcularArea(){
        return Math.pow(this.raio, 2) * Math.PI;
    }

    public double calcularCircunferencia(){
        return 2 * Math.PI * this.raio;
    }

    public void exibeDados(){
        System.out.println("Raio: " + getRaio());
        System.out.printf("Diametro: %.2f\n",calcularDiametro());
        System.out.printf("Area: %.2f\n", calcularArea());
        System.out.printf("Circunferencia: %.2f\n", calcularCircunferencia());
    }

}
