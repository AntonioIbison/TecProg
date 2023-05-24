package robo;

public class Cavalo extends Robo {

	public Cavalo(int id, String nome, int posicaox, int posicaoy, Plano plano, int pontos) {
		super(id, "Cavalo", 1, 1, plano, pontos, "C");
	}

	public void avançar(int quantidade) {
		int m = Math.min(quantidade, 2);
		posicaoy += m;
		posicaox += m;

	}

	public void retroceder(int quantidade) {
		int m = Math.min(quantidade, 2);
		posicaoy -= m;
		posicaox -= m;

	}

	@Override
	public void verificaLimite() {
		if (posicaoy <= 0 || posicaox <= 0) {
			System.out.println("Bateu no limite do tabuleiro.");
			posicaoy = Math.max(1, posicaoy);
			posicaox = Math.max(1, posicaox);

		} else if (posicaoy >= plano.getTamanhoY() || posicaox >= plano.getTamanhoX()) {
			System.out.println("Bateu no limite do tabuleiro.");
			posicaoy = Math.min(plano.getTamanhoY(), posicaoy);
			posicaox = Math.min(plano.getTamanhoX(), posicaox);
		}
	}

}
