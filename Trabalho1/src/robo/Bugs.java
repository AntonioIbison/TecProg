package robo;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Bugs {
	private int posicaox;
	private int posicaoy;
	Random random = new Random();
	List<Bugs> bugs = new ArrayList<>();

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

	public void sortearPosicaoBugs(List<Celula> celulas, int numBugs) {
		List<Celula> celulasLivres = new ArrayList<>(celulas);

		for (int i = 0; i < numBugs && !celulasLivres.isEmpty(); i++) {

			int num = random.nextInt(celulasLivres.size());
			Celula celulaSorteada = celulasLivres.remove(num);

			Bugs b = new Bugs();
			b.setPosicaoX(celulaSorteada.getPosicaoX());
			b.setPosicaoY(celulaSorteada.getPosicaoY());
			bugs.add(b);

		}
	}
}
