package Exerc11;

public class Main {

	public static void main(String[] args) {
		Operario operario = new Operario("João", "Rua A", 2000.0, 10000.0, 10.0);
		double salario = operario.calcularSalario();
		System.out.println("Salário do operário: " + salario);
	}

}
