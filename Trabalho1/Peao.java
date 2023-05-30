package robo;

public class Peao extends Robo {

	public Peao(int id, String nome, int posicaox, int posicaoy, Plano plano, int pontos) {
		super(id, "Peao", 1, 1, plano, pontos, "P");
	}

	@Override
	public void avançar(int quantidade) {
		posicaox++;
		verificaLimite();
	}

	public void retroceder(int quantidade) {
		posicaox--;
		verificaLimite();
	}

	@Override
	public void verificaLimite() {

		if (posicaox <= 0) {
			posicaox = 1;

		} else if (posicaox >= plano.getTamanhoX()) {
			posicaox = plano.getTamanhoX();
		}

	}

}
