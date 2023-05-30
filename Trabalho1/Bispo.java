package robo;

public class Bispo extends Robo {

	public Bispo(int id, String nome, int posicaox, int posicaoy, Plano plano, int pontos) {
		super(id, "Bispo", 1, 1, plano, pontos, "B");
	}

	@Override
	public void avançar(int quantidade) {
		int m = Math.min(quantidade, 2);
		posicaoy += m;
		posicaox += m;
		verificaLimite();
	}

	@Override
	public void retroceder(int quantidade) {
		int m = Math.min(quantidade, 2);
		posicaoy -= m;
		posicaox += m;
		verificaLimite();
	}

	@Override
	public void verificaLimite() {
		if (posicaoy <= 0 || posicaox <= 0) {
			posicaoy = 1;
			posicaox = 1;

		} else if (posicaoy >= plano.getTamanhoY() || posicaox >= plano.getTamanhoX()) {
			posicaoy = plano.getTamanhoY();
			posicaox = plano.getTamanhoX();
		}
	}

}
