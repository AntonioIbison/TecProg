package Exerc8;

public class ContaEspecial extends ContaCorrente {
	 private double limite;

	    public ContaEspecial(double saldo, double limite) {
	        super(saldo);
	        this.limite = limite;
	    }

	    @Override
	    public void sacar(double valor) {
	        double saldoDisponivel = saldo + limite;
	        if (saldoDisponivel >= valor) {
	            saldo -= valor;
	            System.out.println("Sacou, novo saldo: " + saldo);
	        } else {
	            System.out.println("crédito excedeu");
	        }
	    }
}
