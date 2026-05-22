package Aula05;

public class ContaBanco {
    public int numConta;
    protected String tipo;
    private String dono;
    private double saldo;
    private boolean status;

    public void estadoAtual(){
        System.out.println("----------------------------------");
        System.out.println("Conta: " + this.getNumConta());
        System.out.println("Tipo: " + this.getTipo());
        System.out.println("Dono: " + this.getDono());
        System.out.println("Saldo: " + this.getSaldo());
        System.out.println("Status: " + this.getStatus());
    }

    public ContaBanco(){
        this.saldo = 0;
        this.status = false;
    }

    public void setNumConta(int n){
        this.numConta = n;
    }

    public int getNumConta(){
        return this.numConta;
    }

    public void setTipo(String t){
        this.tipo = t;
    }

    public String getTipo(){
        return this.tipo;
    }

    public void setDono(String d){
        this.dono = d;
    }

    public String getDono(){
        return this.dono;
    }

    public void setSaldo(double s){
        this.saldo = s;
    }

    public double getSaldo(){
        return this.saldo;
    }

    public void setStatus(boolean v){
        this.status = v;
    }

    public boolean getStatus(){
        return this.status;
    }

    public void abrirConta(String t){
        this.setTipo(t);
        this.setStatus(true);
        if ("CC".equals(t)) {
            this.setSaldo(50);
        }else if("CP".equals(t)){
            this.setSaldo(150);
        }
        System.out.println("Conta aberta com sucesso!");
    }

    public void fecharConta(){
        if(this.getSaldo() > 0){
            System.out.println("Não pode ser fechada. Motivo: Conta com dinheiro");
        }else if(this.getSaldo() < 0){
            System.out.println("Não pode ser fechada. Motivo: Conta em débito");
        }else{
            this.setStatus(false);
            System.out.println("Conta fechada com sucesso");
        }
    }

    public void depositar(double v){
        if (this.getStatus()) {
            this.setSaldo(this.getSaldo() + v);
            System.out.println("Deposito realizado na conta de " + this.getDono());
        } else {
            System.out.println("Impossível depositar (conta fechada)");
        }
    }

    public void sacar(double v){
        if (this.getStatus()) {
            if (this.getSaldo() >= v) {
                this.setSaldo(this.getSaldo() - v);
                System.out.println("Saque realizado na conta de " + this.getDono());
            }else{
                System.out.println("Saldo insuficiente");
            }
        }else{
            System.out.println("Impossivel sacar (conta fechada)");
        }
    }

    public void pagarMensal(){
        int v = 0;
        if ("CC".equals(this.getTipo())) {
            v = 12;
        }else if("CP".equals(this.getTipo())){
            v = 20;
        }

        if(this.getStatus()){
            if (getSaldo() > v) {
                this.setSaldo(this.getSaldo() - v);
                System.out.println("Mensalidade paga com sucesso por " + getDono());
            }else{
                System.out.println("Impossivel pagar (conta fechada)");
            }
        }

    }

}
