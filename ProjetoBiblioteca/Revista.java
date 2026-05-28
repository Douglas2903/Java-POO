package ProjetoBiblioteca;

public class Revista extends Material{
    private String edicao;
    private int mesPublicacao;

    public Revista(String titulo, String codigo, int anoPublicacao, String edicao, int mesPublicacao){
        super(titulo, codigo, anoPublicacao);
        this.setEdicao(edicao);
        this.setMesPublicacao(mesPublicacao);

    }

    private void setEdicao(String edicao){
        if (edicao != null && !edicao.trim().isEmpty()) {
            this.edicao = edicao;
        }
    }

    public String getEdicao(){
        return this.edicao;
    }

    private void setMesPublicacao(int mesPublicacao){
        if (mesPublicacao <= 12 && mesPublicacao >= 1) {
            this.mesPublicacao = mesPublicacao;
        }
    }

    public int getMesPublicacao(){
        return this.mesPublicacao;
    }

    @Override
    public double calcularMulta(int diasAtrasados){
        return 1.00 * diasAtrasados;
    }
}
