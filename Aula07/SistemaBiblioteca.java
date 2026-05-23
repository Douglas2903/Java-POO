package Aula07;

public class SistemaBiblioteca {
    public static void main(String[] args) {

        Biblioteca biblioteca = new Biblioteca("Biblioteca Central");

        Livro l1 = new Livro("Clean Code", "Robert Martin", 425);
        Livro l2 = new Livro("Java POO", "Guanabara", 300);
        Livro l3 = new Livro("Estruturas de Dados", "Nivio Ziviani", 500);

        Leitor leitor1 = new Leitor("Sayuri", 19);
        Leitor leitor2 = new Leitor("Carlos", 22);

        biblioteca.adicionarLivro(l1);
        biblioteca.adicionarLivro(l2);
        biblioteca.adicionarLivro(l3);

        biblioteca.cadastrarLeitor(leitor1);
        biblioteca.cadastrarLeitor(leitor2);

        System.out.println("\n=== LIVROS DA BIBLIOTECA ===");
        biblioteca.listarLivros();

        System.out.println("\n=== LEITORES CADASTRADOS ===");
        biblioteca.listarLeitores();

        System.out.println("\n=== EMPRÉSTIMOS ===");
        biblioteca.realizarEmprestimo(leitor1, l1);
        biblioteca.realizarEmprestimo(leitor1, l2);

        System.out.println("\n=== LIVROS DO LEITOR ===");
        leitor1.listarLivros();

        System.out.println("\n=== TESTE DE LIVRO JÁ EMPRESTADO ===");
        biblioteca.realizarEmprestimo(leitor2, l1);

        System.out.println("\n=== DEVOLUÇÃO ===");
        leitor1.devolverLivro(l1);

        System.out.println("\n=== LIVROS DO LEITOR APÓS DEVOLUÇÃO ===");
        leitor1.listarLivros();

        System.out.println("\n=== STATUS FINAL DOS LIVROS ===");
        l1.apresentar();
        l2.apresentar();
    }
}