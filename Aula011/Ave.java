package Aula011;

public class Ave extends Animal {
    private String corPena;

    @Override
    public void locomover(){
        System.out.println("Voando");
    }
    
    @Override
    public void alimentar(){
        System.out.println("Comendo Frutas");
    }
    
    @Override
    public void emitirSom(){
        System.out.println("Som de Ave");
    }

    public void fazerNinho(){
        System.out.println("Contruindo Ninho");
    }

    public void setCorPena(String corPena){
        this.corPena = corPena;
    }

    public String getCorPena(){
        return this.corPena;
    }
}
