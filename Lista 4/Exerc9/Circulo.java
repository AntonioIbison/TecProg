package Exerc9;

public class Circulo extends Forma {
	public int raio;
	public double pi = 3.14;
	public double area;

	public Circulo(int raio) {
		super();
		this.raio = raio;
		
	}
	
	@Override
	public double calcularArea() {
		return pi * (raio * raio);

	}

	@Override
	public void imprimirNome() {
		System.out.println("Circulo");

	}

}
