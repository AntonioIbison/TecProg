package Exerc4;

import java.util.Locale;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		Produto p1 = new Produto("Cacho de banana", 11.0, 2);
		Produto p2 = new Produto("Calculadora cientifica", 160.0, 1);
		Produto p3 = new Produto("Microondas", 450.0, 1);
		Produto p4 = new Produto("Televisao", 2200.0, 1);

		p1.comprarProduto();
		p2.comprarProduto();
		p3.comprarProduto();
		p4.comprarProduto();
		
	}

}
