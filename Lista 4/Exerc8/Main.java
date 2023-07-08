package Exerc8;

public class Main {

	public static void main(String[] args) {
	     ContaCorrente contaCorrente = new ContaCorrente(500.0);
	        contaCorrente.depositar(200.0);
	        contaCorrente.sacar(400.0);

	        ContaEspecial contaEspecial = new ContaEspecial(1000.0, 500.0);
	        contaEspecial.depositar(300.0);
	        contaEspecial.sacar(1500.0);
	}

}
