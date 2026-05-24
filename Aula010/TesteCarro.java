package Aula010;

public class TesteCarro {
    public static void main(String[] args) {
        Carro c = new Carro("Toyota Etios", "EQB1785", 2023, 2024, 4, 65000);
        c.imprime();
        c.deprecia(10);

        System.out.println("\nCarro depreciado:");
        c.imprime();
    }
}
