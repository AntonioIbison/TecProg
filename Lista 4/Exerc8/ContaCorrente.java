package Exerc8;

public class ContaCorrente {
	protected double saldo;

    public ContaCorrente(double saldo) {
        this.saldo = saldo;
    }

    public void depositar(double valor) {
        saldo += valor;
        System.out.println("Depósitado, novo saldo: " + saldo);
    }

    public void sacar(double valor) {
        if (saldo >= valor) {
            saldo -= valor;
            System.out.println("Sacado, novo saldo: R$" + saldo);
        } else {
            System.out.println("Saldo insuficiente.");
        }
    }
}
