package Exerc7;

public class Vendedor extends Empregado {

	private float percentual;

	public Vendedor(String nome, float salario, float percentual) {
		super(nome, salario);
		this.percentual = percentual;
	}

	public float calcularSalario() {
		return salario + (salario * percentual / 100);
	}

	public String toString() {
		return super.toString() + ",  salário com comissão: " + calcularSalario() + ", percentual: " + percentual;

	}
}
