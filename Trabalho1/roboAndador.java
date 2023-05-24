package robo;

public class roboAndador extends Robo {

	public roboAndador(int id, String nome, int posicaox, int posicaoy, Plano plano, int pontos) {
		super(id, "Andador", 1, 1, plano, pontos, "A");
		// TODO Auto-generated constructor stub
	}

	public void avançar(int quantidade) {
		posicaoy += quantidade;
	}

	public void retroceder(int quantidade) {
		posicaoy -= quantidade;
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
