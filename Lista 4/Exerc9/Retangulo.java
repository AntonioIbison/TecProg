package Exerc9;

public class Retangulo extends Forma{
	public int base;
	public int altura;
	
	public Retangulo(int base, int altura) {
		super();
		this.base = base;
		this.altura = altura;
	}
	
	public double calcularArea() {
		return base*altura;
	}
	
	public void imprimirNome() {
		System.out.println("Retangulo");

		
	}
}
