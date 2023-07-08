package Exerc16;

public class Main {

	public static void main(String[] args) {
		Elevador e = new Elevador();
		e.inicializa(8, 10);

		e.entra();
		e.sobe();
		e.entra();
		e.desce();
		e.sai();
		e.desce();
	}
}
