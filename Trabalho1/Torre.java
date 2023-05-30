package robo;

public class Torre extends Robo {

	public Torre(int id, String nome, int posicaox, int posicaoy, Plano plano, int pontos) {
		super(id, "Torre", posicaox, posicaoy, plano, pontos, "T");
		// TODO Auto-generated constructor stub
	}

	public void avançar(int quantidade) {
		int m = Math.min(quantidade, 2);
		posicaoy += m;
		verificaLimite();
	}

	public void retroceder(int quantidade) {
		int m = Math.min(quantidade, 2);
		posicaoy -= m;
		verificaLimite();
	}

	@Override
	public void verificaLimite() {
		if (posicaoy <= 0) {
			System.out.println("Bateu no limite do tabuleiro.");
			posicaoy=1;
			
		} else if(posicaoy >= plano.getTamanhoY()) {
			System.out.println("Bateu no limite do tabuleiro.");
			posicaoy=plano.getTamanhoY();
		}
		
	}

}
