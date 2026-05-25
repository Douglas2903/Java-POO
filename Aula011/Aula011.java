package Aula011;

public class Aula011 {
    public static void main(String[] args) {
        // Animal n = new Animal();
        /* Mamifero m = new Mamifero();
        Repitil r = new Repitil();
        Peixe p = new Peixe();
        Ave a = new Ave(); */

        Canguru c = new Canguru();
        Cachorro k = new Cachorro();
        /* Cobra j = new Cobra();
        Tartaruga t = new Tartaruga();
        Goldfish g = new Goldfish();
        Arara e = new Arara(); */

        c.locomover();
        k.locomover();
        c.emitirSom();
        k.emitirSom();
    }
}
