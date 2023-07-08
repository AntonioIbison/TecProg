package Exerc6;

public class IngressoVIP extends Ingresso {

	private double adicional;

	public IngressoVIP(double valor, double valorAdicional) {
		super(valor);
		this.adicional = valorAdicional;
	}

	public double getValorAdicional() {
		return adicional;
	}

	public void setValorAdicional(double valorAdicional) {
		this.adicional = valorAdicional;
	}

	@Override
	public String toString() {
		return "Valor do VIP: " + (getValor() + adicional);
	}
}
