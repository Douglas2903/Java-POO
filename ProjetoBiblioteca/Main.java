package ProjetoBiblioteca;

public class Main {

    public static void main(String[] args) {

        Livro livro = new Livro(
                "Clean Code",
                "LIV-001",
                2008,
                "Robert C. Martin",
                425
        );

        Revista revista = new Revista(
                "Superinteressante",
                "REV-010",
                2024,
                "Especial Tecnologia",
                5
        );

        DVD dvd = new DVD(
                "Interestelar",
                "DVD-101",
                2014,
                169,
                12
        );

        Usuario usuario = new Usuario(
                "Sayuri",
                "123.456.789-00",
                "sayuri@email.com"
        );

        usuario.pegarMaterial(livro);
        usuario.pegarMaterial(revista);
        usuario.pegarMaterial(dvd);

        System.out.println();

        usuario.listarMateriaisEmprestados();

        System.out.println();

        System.out.println(
                "Multa livro (3 dias): R$ "
                        + livro.calcularMulta(3)
        );

        System.out.println(
                "Multa revista (3 dias): R$ "
                        + revista.calcularMulta(3)
        );

        System.out.println(
                "Multa DVD (3 dias): R$ "
                        + dvd.calcularMulta(3)
        );

        System.out.println();

        usuario.devolverMaterial(revista);

        System.out.println();

        usuario.listarMateriaisEmprestados();
    }
}