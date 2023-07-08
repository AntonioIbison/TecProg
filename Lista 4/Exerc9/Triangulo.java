package Exerc9;

public class Triangulo extends Forma{
	public int base;
	public int altura;
	public double area;
	public String nome;
	
	public Triangulo(int base, int altura) {
		super();
		this.base = base;
		this.altura = altura;
	}
	public double calcularArea() {
		return area=(base*altura)/2;
	}
	@Override
	public void imprimirNome() {
		System.out.println("Triangulo");

	}


}
