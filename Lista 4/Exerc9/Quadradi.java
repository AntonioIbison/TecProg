package Exerc9;

public class Quadradi extends Forma {
	public int lado;

	public Quadradi(int lado) {
		super();
		this.lado = lado;
	}

	@Override
	public double calcularArea() {
		return lado * lado;

	}

	@Override
	public void imprimirNome() {
		System.out.println("Quadrado");

	}

}
