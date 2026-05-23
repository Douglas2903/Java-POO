package Aula07;

public class Livro {
    private String titulo;
    private String autor;
    private int totalPaginas;
    private boolean emprestado;

    public Livro(String titulo, String autor, int totalPaginas){
        this.setTitulo(titulo);
        this.setAutor(autor);
        this.setTotalPaginas(totalPaginas);
        this.setEmprestado(false);
    }

    private void setTitulo(String titulo){
        if (titulo == null || titulo.trim().isEmpty()) {
            System.out.println("O livro precisa de um título.");
        } else {
            this.titulo = titulo;
        }
    }

    public String getTitulo(){
        return this.titulo;
    }

    private void setAutor(String autor){
        if (autor == null || autor.trim().isEmpty()) {
            System.out.println("O livro precisa de um autor!");
        } else {
            this.autor = autor;
        }
    }

    public String getAutor(){
        return this.autor;
    }

    private void setTotalPaginas(int totalPaginas){
        if (totalPaginas <= 0) {
            System.out.println("Número de páginas não pode ser menor ou igual a 0!");
        } else {
            this.totalPaginas = totalPaginas;
        }
    }

    public int getTotalPaginas(){
        return this.totalPaginas;
    }

    private void setEmprestado(boolean emprestado){
        this.emprestado = emprestado;
    }

    public boolean isEmprestado(){
        return this.emprestado;
    }

    public void apresentar(){
        System.out.println("Título          : " + this.titulo);
        System.out.println("Autor           : " + this.autor);
        System.out.println("Total de Páginas: " + this.totalPaginas);
        if (this.isEmprestado()) {
            System.out.println("Status          : Emprestado");
        } else {
            System.out.println("Status          : Disponível");
        }
    }

    public void emprestar(){
        if (this.emprestado) {
            System.out.println("O livro não está disponível, ainda está emprestado.");
        } else {
            this.setEmprestado(true);
            System.out.println("Livro emprestado com sucesso.");
        }
    }

    public void devolver(){
        if (this.emprestado) {
            this.setEmprestado(false);
            System.out.println("Livro devolvido com sucesso.");
        } else {
            System.out.println("O livro já está disponível.");
        }
    }
}