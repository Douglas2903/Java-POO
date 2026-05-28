package ProjetoBiblioteca;

public class DVD extends Material{

    private int duracao;
    private int classificacaoIndicativa;

    public DVD(String titulo, String codigo, int anoPublicacao, int duracao, int classificacaoIndicativa){
        super(titulo, codigo, anoPublicacao);
        this.setDuracao(duracao);
        this.setClassificacaoIndicativa(classificacaoIndicativa);
    }

    private void setDuracao(int duracao){
        if (duracao > 0) {
            this.duracao = duracao;
        }
    }

    public int getDuracao(){
        return this.duracao;
    }

    private void setClassificacaoIndicativa(int classificacaoIndicativa){
        if (classificacaoIndicativa > 0 && classificacaoIndicativa <= 18) {
            this.classificacaoIndicativa = classificacaoIndicativa;
        }
    }

    public int getClassificacaoIndicativa(){
        return this.classificacaoIndicativa;
    }

    @Override
    public double calcularMulta(int diasAtrasados){
        return 2.5 * diasAtrasados;
    }
}
