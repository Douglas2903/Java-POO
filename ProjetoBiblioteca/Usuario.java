package ProjetoBiblioteca;

public class Usuario {

    private String nome;
    private String cpf;
    private String email;

    private Material[] materiaisEmprestados;

    private int quantidadeMateriais;
    private int limiteMateriais;

    public Usuario(String nome, String cpf, String email) {
        this.setNome(nome);
        this.setCpf(cpf);
        this.setEmail(email);

        this.limiteMateriais = 5;
        this.materiaisEmprestados = new Material[this.limiteMateriais];
        this.quantidadeMateriais = 0;
    }

    public void setNome(String nome) {
        if (nome != null && !nome.trim().isEmpty()) {
            this.nome = nome;
        }
    }

    public String getNome() {
        return this.nome;
    }

    private void setCpf(String cpf) {
        if (cpf != null && !cpf.trim().isEmpty()) {
            this.cpf = cpf;
        }
    }

    public String getCpf() {
        return this.cpf;
    }

    public void setEmail(String email) {
        if (email != null && !email.trim().isEmpty()) {
            this.email = email;
        }
    }

    public String getEmail() {
        return this.email;
    }

    public int getQuantidadeMateriais() {
        return this.quantidadeMateriais;
    }

    public int getLimiteMateriais() {
        return this.limiteMateriais;
    }

    public void pegarMaterial(Material material) {

        if (material == null) {
            System.out.println("Material inválido.");
            return;
        }

        if (this.quantidadeMateriais >= this.limiteMateriais) {
            System.out.println("Limite de materiais atingido.");
            return;
        }

        if (!material.isDisponivel()) {
            System.out.println("Material indisponível.");
            return;
        }

        material.emprestar();

        this.materiaisEmprestados[this.quantidadeMateriais] = material;

        this.quantidadeMateriais++;

        System.out.println(
                "Material do tipo " + material.getClass().getSimpleName() + " adicionado com sucesso."
        );
    }

    public void devolverMaterial(Material material) {

        if (material == null) {
            System.out.println("Material inválido.");
            return;
        }

        for (int i = 0; i < this.quantidadeMateriais; i++) {
            if (this.materiaisEmprestados[i] == material) {
                material.devolver();
                for (int j = i; j < this.quantidadeMateriais - 1; j++) {
                    this.materiaisEmprestados[j] = this.materiaisEmprestados[j + 1];
                }

                this.materiaisEmprestados[this.quantidadeMateriais - 1] = null;
                this.quantidadeMateriais--;

                System.out.println(
                        "Material do tipo " + material.getClass().getSimpleName() + " devolvido com sucesso."
                );
                return;
            }
        }
        System.out.println("Esse material não pertence ao usuário.");
    }

    public void listarMateriaisEmprestados() {
        if (this.quantidadeMateriais == 0) {
            System.out.println("Nenhum material emprestado.");
            return;
        }
        for (int i = 0; i < this.quantidadeMateriais; i++) {
            System.out.println(
                    "Item " + (i + 1) + ": " + this.materiaisEmprestados[i].getClass().getSimpleName());
        }
    }
}