package robo;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class AlunoPerdido {

	protected String nome;
	private int posicaox;
	private int posicaoy;
	private Plano plano;
	List<AlunoPerdido> alunosPerdidos = new ArrayList<>();
	Random random = new Random();

	public AlunoPerdido(Plano plano) {
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

	public void sortearPosicaoAlunosPerdidos(int numAlunosPerdidos) {
		List<Celula> celulasLivres = new ArrayList<>();

		for (int x = 1; x <= plano.getTamanhoX(); x++) {
			for (int y = 1; y <= plano.getTamanhoY(); y++) {
				Celula celula = plano.retornarCelula(x, y);
				celulasLivres.add(celula);
			}
		}

		for (int i = 0; i < numAlunosPerdidos && !celulasLivres.isEmpty(); i++) {

			int num = random.nextInt(celulasLivres.size());
			Celula celulaSorteada = celulasLivres.remove(num);

			AlunoPerdido a = new AlunoPerdido(plano);
			a.setPosicaoX(celulaSorteada.getPosicaoX());
			a.setPosicaoY(celulaSorteada.getPosicaoY());
			alunosPerdidos.add(a);
			celulaSorteada.setAluno(a);

		}
	}

}
