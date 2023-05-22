package robo;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class AlunoPerdido {

	protected String nome;
	private int posicaox;
	private int posicaoy;
	List<AlunoPerdido> alunosPerdidos = new ArrayList<>();
	Random random = new Random();

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

	public void sortearPosicaoAlunosPerdidos(List<Celula> celulas, int numAlunosPerdidos) {
		List<Celula> celulasLivres = new ArrayList<>(celulas);

		for (int i = 0; i < numAlunosPerdidos && !celulasLivres.isEmpty(); i++) {

			int num = random.nextInt(celulasLivres.size());
			Celula celulaSorteada = celulasLivres.remove(num);

			AlunoPerdido a = new AlunoPerdido();
			a.setPosicaoX(celulaSorteada.getPosicaoX());
			a.setPosicaoY(celulaSorteada.getPosicaoY());
			alunosPerdidos.add(a);

		}
	}

}
