package Aula010.Heranca;

public class Aluno extends Pessoa{
    private String objetivo;
    private double mensalidade;

    public Aluno(String nome, int idade, double peso, String objetivo, double mensalidade){
        super(nome, idade, peso);
        this.setObjetivo(objetivo);
        this.setMensalidade(mensalidade);
    }

    public void setObjetivo(String objetivo){
        this.objetivo = objetivo;
    }

    public String getObjetivo(){
        return this.objetivo;
    }

    public void pagarMensalidade(){
        System.out.println("Mensalidade paga com sucesso.");
    }

    public void setMensalidade(double mensalidade){
        if (mensalidade > 0) {
            this.mensalidade = mensalidade;
        }
    }

    public double getMensalidade(){
        return this.mensalidade;
    }

    @Override
    public String exibirDados(){
        return String.format(
                "%s\nObjetivo: %s\nMensalidade: %.2f",
                super.exibirDados(),
                this.getObjetivo(),
                this.getMensalidade()
        );
    }
}
