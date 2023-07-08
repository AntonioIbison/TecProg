package Exerc9;

public class Main {
	
	public static void main(String[] args) {
		
		Circulo c = new Circulo(5);
		Quadradi q = new Quadradi(3);
		Retangulo r = new Retangulo(5, 3);
		Triangulo t = new Triangulo(2, 9);
		
		c.imprimirNome();
		System.out.println(c.calcularArea());
		
		
		q.imprimirNome();
		System.out.println(q.calcularArea());
		
		
		r.imprimirNome();
		System.out.println(r.calcularArea());
		
		
		t.imprimirNome();
		System.out.println(t.calcularArea());
		
	}

}
