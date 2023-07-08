package Exerc15;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Informe o preço de custo: ");
		double precoCusto = scanner.nextDouble();

		System.out.print("Informe o preço de venda: ");
		double precoVenda = scanner.nextDouble();

		System.out.print("Informe as despesas da empresa: ");
		double despesasEmpresa = scanner.nextDouble();

		Produto p = new Produto(precoCusto, precoVenda, despesasEmpresa);
		double m = p.calcularMargemLucro();

		System.out.printf("Lucro do produto: %.2f%%\n", m);
		scanner.close();

	}

}
