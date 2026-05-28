package ProjetoBiblioteca;

public class Livro extends Material{

    private String autor;
    private int numPaginas;

    public Livro(String titulo, String codigo, int anoPublicacao, String autor, int numPaginas){
        super(titulo, codigo, anoPublicacao);
        this.setAutor(autor);
        this.setNumPaginas(numPaginas);
    }

    private void setAutor(String autor){
        if (autor != null && !autor.trim().isEmpty()) {
            this.autor = autor;
        }
    }

    public String getAutor(){
        return this.autor;
    }

    private void setNumPaginas(int numPaginas){
        if (numPaginas > 0) {
            this.numPaginas = numPaginas;
        }
    }

    public int getNumPaginas(){
        return this.numPaginas;
    }

    @Override
    public double calcularMulta(int diasAtrasados){
        return 0.5 * diasAtrasados;
    }
}
