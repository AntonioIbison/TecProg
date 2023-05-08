package Exerc3;

import java.util.Locale;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		Fatura f = new Fatura(5, "Arroz", 4, 4.50);
		Fatura f1 = new Fatura(7, "Macarrao", 0, 3.50);
		Fatura f2 = new Fatura(6, "Feijao", -5, 5.50);
		
		System.out.println("Valor final 0: " + f.getValorFatura());
		System.out.println("Valor final 1: " + f1.getValorFatura());
		System.out.println("Valor final 2: " + f2.getValorFatura());
		
		f.ValorDesconto(10.0);
		f1.ValorDesconto(15.0);
		f2.ValorDesconto(20.0);
		
		System.out.println("Valor final 0 denovo: " + f.getValorFatura());
		System.out.println("Valor final 1 denovo: " + f1.getValorFatura());
		System.out.println("Valor final 2 denovo: " + f2.getValorFatura());
		

	}

}
