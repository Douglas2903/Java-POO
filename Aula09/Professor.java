package Aula09;

public class Professor extends Pessoa{
    private String especialidade;
    private double salario;

    public void receberAumento(double aum){
        this.salario += aum;
    }

    public void setEspecialidade(String especialidade){
        this.especialidade = especialidade;
    }

    public String getEspecialidade(){
        return this.especialidade;
    }

    public void setSalario(double salario){
        this.salario = salario;
    }

    public double getSalario(){
        return this.salario;
    }
}
