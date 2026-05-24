package Aula010;

public class TesteCaminhao {
    public static void main(String args[]) {
        Caminhao c = new Caminhao("Mercedes", "XY76558", 2023, 10, 3, 315000);

        c.imprime();
        c.deprecia(10);

        System.out.println("\nCaminhao depreciado:");
        c.imprime();
    }
}