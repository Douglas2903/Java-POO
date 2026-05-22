package Aula06;

public class Moto implements Veiculo{
    private boolean ligado;
    private int velocidade;

    public Moto(){
        this.ligado = false;
        this.velocidade = 0;
    }

    private void setLigado(boolean b){
        this.ligado = b;
    }

    private boolean getLigado(){
        return this.ligado;
    }

    private void setVelocidade(int v){
        this.velocidade = v;
    }

    private int getVelocidade(){
        return this.velocidade;
    }

    @Override
    public void ligar(){
        if (this.getLigado()) {
            System.out.println("Moto já está ligada!");
        }else{
            this.setLigado(true);
            System.out.println("Moto ligada.");
        }
    }

    @Override
    public void desligar(){
        if (this.getVelocidade() == 0) {
            this.setLigado(false);
            System.out.println("Moto desligada.");
        }else{
            System.out.println("Não é possível desligar em movimento!");
        }
    }

    @Override
    public void acelerar(){
        if (this.getLigado()) {
            this.setVelocidade(this.getVelocidade() + 20);
            System.out.printf("Velocidade atual: %d km/h\n", this.getVelocidade());
        }
    }
    
    @Override
    public void frear(){
        if (this.getVelocidade() <= 0) {
            System.out.println("A velocidade não pode ser menor que 0.");
        }else if (this.getVelocidade() <= 20) {
            this.setVelocidade(0);
            System.out.println("Velocidade = 0");
        }else{
            this.setVelocidade(getVelocidade() - 20);
            System.out.printf("Velocidade atual: %d km/h\n", this.getVelocidade());
        }
    }

    @Override
    public void virar(String direcao){
        if (this.getVelocidade() > 0) {
            if (direcao.equalsIgnoreCase("direita")) {
                System.out.println("Virando à direita");
            }else if (direcao.equalsIgnoreCase("esquerda")) {
                System.out.println("Virando à esquerda");
            }
        }
    }
}
