package Aula04;

public class ContaCorrente {

    private int numeroConta;
    private String titular;
    private double saldo;

    public ContaCorrente(int numeroConta, String titular, double saldo) {
        if (numeroConta <= 0 || numeroConta > 9999999) {
            System.out.println("Número da conta inválido.");
        } else {
            this.numeroConta = numeroConta;
        }

        if (titular == null || titular.isEmpty()) {
            System.out.println("Titular inválido.");
        } else {
            this.titular = titular;
        }

        if (saldo < 0) {
            System.out.println("Saldo inválido.");
        } else {
            this.saldo = saldo;
        }
    }

    public int getNumeroConta() {
        return numeroConta;
    }

    public String getTitular() {
        return titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setTitular(String titular) {

        if (titular == null || titular.isEmpty()) {
            System.out.println("Titular inválido.");
        } else {
            this.titular = titular;
        }
    }

    public void deposito(double valor) {
        if (valor <= 0) {
            System.out.println("Valor de depósito inválido.");
        } else {
            saldo += valor;
        }
    }

    public void saque(double valor) {
        if (valor <= 0) {
            System.out.println("Valor inválido.");
        } else if (valor > saldo) {
            System.out.println("Saldo insuficiente.");
        } else {
            saldo -= valor;
        }
    }

    public void verDados() {

        System.out.printf("\n=================================");
        System.out.printf("\nConta   : %07d", numeroConta);
        System.out.printf("\nTitular : %s", titular);
        System.out.printf("\nSaldo   : R$ %.2f", saldo);
        System.out.printf("\n=================================");
    }
}