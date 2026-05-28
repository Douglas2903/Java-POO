package ProjetoBiblioteca;

import java.time.LocalDate;


public abstract class Material {
    private String titulo;
    private String codigo;
    private int anoPublicacao;
    private boolean disponivel;

    public Material(String titulo, String codigo, int anoPublicacao){
        this.setTitulo(titulo);
        this.setCodigo(codigo);
        this.setAnoPublicacao(anoPublicacao);
        this.disponivel = true;
    }

    private void setTitulo(String titulo){
        if (titulo != null && !titulo.trim().isEmpty()) {
            this.titulo = titulo;
        }
    }

    public String getTitulo(){
        return this.titulo;
    }

    private void setCodigo(String codigo){
        if (codigo != null && !codigo.trim().isEmpty()) {
            this.codigo = codigo;
        }
    }

    public String getCodigo(){
        return this.codigo;
    }

    private void setAnoPublicacao(int anoPublicacao){
        int anoAtual = LocalDate.now().getYear();
        if (anoPublicacao > 0 && anoPublicacao <= anoAtual) {
            this.anoPublicacao = anoPublicacao;
        }
    }

    public int getAnoPublicacao(){
        return this.anoPublicacao;
    }

    public boolean isDisponivel(){
        return this.disponivel;
    }

    public void emprestar(){
        if (this.isDisponivel()) {
            System.out.println("Material emprestado com sucesso.");
            this.disponivel = false;
        }else{
            System.out.println("O material está indisponível no momento.");
        }
    }

    public void devolver(){
        if (!this.isDisponivel()) {
            System.out.println("Material devolvido com sucesso.");
            this.disponivel = true;
        }else{
            System.out.println("O material está disponível, não precisa ser devolvido no momento.");
        }
    }

    public abstract double calcularMulta(int diasAtrasados);
}
