package Exerc7;

public class Main {

	public static void main(String[] args) {
		Empregado e = new Empregado("Zé", 1750);
		Gerente g = new Gerente("Joseph", 3500, "Financeiro");
		Vendedor v = new Vendedor("José", 2100, 10);
		
		System.out.println(e.toString());
		System.out.println(g.toString());
		System.out.println(v.toString());

	}

}
