package robo;

public class RoboAndador extends Robo {

	public RoboAndador(int id, String nome, int posicaox, int posicaoy, Plano plano, int pontos) {
		super(id, "Andador", 1, 1, plano, pontos, "A");
		// TODO Auto-generated constructor stub
	}

	public void avançar(int quantidade) {
		posicaoy += quantidade;
		verificaLimite();
	}

	public void retroceder(int quantidade) {
		posicaoy -= quantidade;
		verificaLimite();
	}

	@Override
	public void verificaLimite() {
		if (posicaoy <= 0) {
			System.out.println("Bateu no limite do tabuleiro.");
			posicaoy = 1;

		} else if (posicaoy >= plano.getTamanhoY()) {
			System.out.println("Bateu no limite do tabuleiro.");
			posicaoy = plano.getTamanhoY();
		}

	}

}
