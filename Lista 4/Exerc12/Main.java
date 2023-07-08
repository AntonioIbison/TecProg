package Exerc12;

public class Main {

	public static void main(String[] args) {
		Vendedor vendedor = new Vendedor("João", "Rua A", 2000.0, 10000.0, 5.0);
		double salario = vendedor.calcularSalario();
		System.out.println("Salário do vendedor: " + salario);
	}

}
