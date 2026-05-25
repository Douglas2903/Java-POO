package Aula012.Polimorfismo;

public class Main {
    public static void main(String[] args) {
        Funcionario f[] = new Funcionario[3];
        f[0] = new Funcionario("Carlos", 3000);
        f[1] = new Gerente("Ana", 10000);
        f[2] = new Vendedor("Julia", 4000);

        for(int i = 0; i < f.length; i++){
            System.out.println("Nome: " + f[i].getNome());
            System.out.println("Classe: " + f[i].getClass().getSimpleName());
            System.out.println("Bonus: " + f[i].calcularBonus());
            System.out.println();
        }
    }
}
