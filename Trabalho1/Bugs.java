package robo;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Bugs {
	private int posicaox;
	private int posicaoy;
	private Plano plano;
	Random random = new Random();
	List<Bugs> bugs = new ArrayList<>();

	public Bugs(Plano plano) {
		this.plano = plano;
	}

	
	public int getPosicaoX() {
		return posicaox;
	}

	public void setPosicaoX(int posicaoX) {
		this.posicaox = posicaoX;
	}

	public int getPosicaoY() {
		return posicaoy;
	}

	public void setPosicaoY(int posicaoY) {
		this.posicaoy = posicaoY;
	}

	public void sortearPosicaoBugs(int numBugs) {
		List<Celula> celulasLivres = new ArrayList<>();

		for (int x = 1; x <= plano.getTamanhoX(); x++) {
			for (int y = 1; y <= plano.getTamanhoY(); y++) {
				Celula celula = plano.retornarCelula(x, y);
				celulasLivres.add(celula);
			}
		}

		for (int i = 0; i < numBugs && !celulasLivres.isEmpty(); i++) {

			int num = random.nextInt(celulasLivres.size());
			Celula celulaSorteada = celulasLivres.remove(num);

			Bugs b = new Bugs(plano);
			b.setPosicaoX(celulaSorteada.getPosicaoX());
			b.setPosicaoY(celulaSorteada.getPosicaoY());
			bugs.add(b);
			celulaSorteada.setBug(b);

		}
	}
}
