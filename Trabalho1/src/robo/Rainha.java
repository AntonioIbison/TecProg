package robo;

public class Rainha extends Robo {

	public Rainha(int id, String nome, int posicaox, int posicaoy, Plano plano, int pontos) {
		super(id, nome, 1, 1, plano, pontos);
	}

	@Override
	public void avançar(int quantidade) {
		int m = Math.min(quantidade, 4);
		posicaoy += m;
		posicaox += m;

	}

	@Override
	public void retroceder(int quantidade) {
		int m = Math.min(quantidade, 4);
		posicaoy -= m;
		posicaox += m;

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
