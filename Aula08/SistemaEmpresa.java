package Aula08;

public class SistemaEmpresa {
    public static void main(String[] args) {

        Empresa empresa = new Empresa("Tech Solutions");

        Funcionario f1 = new Funcionario("Sayuri", 24, "Programador", 5500);
        Funcionario f2 = new Funcionario("Carlos", 32, "Gerente", 8500);
        Funcionario f3 = new Funcionario("Ana", 27, "Vendedor", 3200);

        System.out.println("=== CONTRATAÇÕES ===");
        empresa.contratarFuncionarios(f1);
        empresa.contratarFuncionarios(f2);
        empresa.contratarFuncionarios(f3);

        System.out.println("\n=== FUNCIONÁRIOS CADASTRADOS ===");
        empresa.listarFuncionarios();

        System.out.println("\n=== FUNCIONÁRIOS TRABALHANDO ===");
        f1.trabalhar();
        f2.trabalhar();

        System.out.println("\n=== AUMENTO SALARIAL ===");
        f1.aumentarSalario(1000);

        System.out.println("\n=== FOLHA DE PAGAMENTO ===");
        System.out.printf("Total da folha: %.2f\n", empresa.calcularFolhaPagamento());

        System.out.println("\n=== DEMISSÃO ===");
        empresa.demitirFuncionario(f3);

        System.out.println("\n=== FUNCIONÁRIOS APÓS DEMISSÃO ===");
        empresa.listarFuncionarios();

        System.out.println("\n=== NOVA FOLHA DE PAGAMENTO ===");
        System.out.printf("Total da folha: %.2f\n", empresa.calcularFolhaPagamento());
    }
}