package Aula010;

public class TesteVeiculo {
    public static void main(String[] args) {
        Veiculo v = new Veiculo("Toyota Etios", "EQB1785", 2024, 65000);
        v.imprime();
        v.deprecia(10);

        System.out.println("\nVeiculo depreciado:");
        v.imprime();
    }
}
