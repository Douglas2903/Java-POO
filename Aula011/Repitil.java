package Aula011;

public class Repitil extends Animal {
    private String corEscama;
    
    @Override
    public void locomover(){
        System.out.println("Rastejando");
    }
    
    @Override
    public void alimentar(){
        System.out.println("Comendo Vegetais");
    }
    
    @Override
    public void emitirSom(){
        System.out.println("Som de Repítil");
    }

    public void setCorEscama(String corEscama){
        this.corEscama = corEscama;
    }

    public String getCorEscama(){
        return this.corEscama;
    }
}
