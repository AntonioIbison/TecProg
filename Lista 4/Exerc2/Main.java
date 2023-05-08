package Exerc2;

import java.util.Locale;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Empregados empregado1 = new Empregados("Jose", "Silva", 4500.0);
		Empregados empregado2 = new Empregados("Maria", "Silva", -2000.0);

		
		System.out.println("O salario anual de " + empregado1.getNome() + " é: " + empregado1.salarioAnual());
		System.out.println("O salario anual de " + empregado2.getNome() + " é: " + empregado2.salarioAnual());
		
		empregado1.salarioAumento();
		empregado2.salarioAumento();
		
		System.out.println("E após reajustes:");
		System.out.println("O salario anual de " + empregado1.getNome() + " é: " + empregado1.salarioAnual());
		System.out.println("O salario anual de " + empregado2.getNome() + " é: " + empregado2.salarioAnual());
	}

}
