package Aula08;

public class Livro implements Publicacao {
    private String titulo;
    private String autor;
    private int totPaginas;
    private int pagAtual;
    private boolean aberto;
    private Pessoa leitor;

    public Livro(String titulo, String autor, int totPaginas, Pessoa leitor){
        this.titulo = titulo;
        this.autor = autor;
        this.totPaginas = totPaginas;
        this.aberto = false;
        this.pagAtual = 0;
        this.leitor = leitor;
    }

    public void setTitulo(String titulo){
        this.titulo = titulo;
    }

    public String getTitulo(){
        return this.titulo;
    }

    public void setAutor(String autor){
        this.autor = autor;
    }

    public String getAutor(){
        return this.autor;
    }

    public void setTotPaginas(int totPaginas){
        this.totPaginas = totPaginas;
    }

    public int getTotPaginas(){
        return this.totPaginas;
    }

    public void setPagAtual(int pagAtual){
        this.pagAtual = pagAtual;
    }

    public int getPagAtual(){
        return this.pagAtual;
    }

    public void setAberto(boolean aberto){
        this.aberto = aberto;
    }

    public boolean isAberto(){
        return this.aberto;
    }

    public void setLeitor(Pessoa leitor){
        this.leitor = leitor;
    }

    public Pessoa getLeitor(){
        return this.leitor;
    }

    public String detalhes(){
        return  "Livro{" + "titulo=" + titulo + "\n, autor="
        + autor + "\n, totPaginas=" + totPaginas + ", pagAtual="
        + pagAtual + "\n, aberto=" + aberto + "\n, leitor=" + leitor.getNome()
        + ", idade=" + leitor.getIdade() + ", sexo=" + leitor.getSexo() + "}"; 
    }

    @Override
    public void abrir(){
        this.aberto = true;
    }
    
    @Override
    public void fechar(){
        this.aberto = false;
    }
    
    @Override
    public void folhear(int p){
        if (p > this.totPaginas) {
            this.pagAtual = 0;
        }else{
            this.pagAtual = p;
        }
    }
    
    @Override
    public void avancarPag(){
        this.pagAtual++;
    }
    
    @Override
    public void voltarPag(){
        this.pagAtual--;

    }
}
