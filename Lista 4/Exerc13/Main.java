package Exerc13;

public class Main {

	public static void main(String[] args) {
		ControleRemoto cr = new ControleRemoto();

		cr.liga();
		cr.aumentandoVolume();
		cr.diminuirVolume();
		cr.aumentaCanal();
		cr.diminuiCanal();
		cr.trocaCanal(13);
		cr.relatorio();
		cr.mudo();
		cr.desliga();
	}
}
