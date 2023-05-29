package trabalhoBianka;

import java.util.ArrayList;
import java.util.Random;

public class Aluno {

	protected int posicaox;
	protected int posicaoy;
	protected int quantAluno;
	Plano p;
	Random random = new Random();
	protected ArrayList<Aluno> listaDeAlunos = new ArrayList<Aluno>();

	public Aluno(int quantAluno, Plano p) {
		super();
		if (quantAluno <= p.listaDeCelulas.size() / 2) {
			this.quantAluno = quantAluno;
		}
		this.p = p;
	}

	public void setPosicaox(int posicaox) {
		this.posicaox = posicaox;
	}

	public void setPosicaoy(int posicaoy) {
		this.posicaoy = posicaoy;
	}

	public int getPosicaoxAluno() {
		return posicaox;
	}

	public int getPosicaoyAluno() {
		return posicaoy;
	}

	public void sortearPosicaoAlunos(int numAlunos) {
		for (int i = 0; i < numAlunos; i++) {
			int posX = random.nextInt(p.getTamanhoX()) + 1;
			int posY = random.nextInt(p.getTamanhoY()) + 1;

			Aluno aluno = new Aluno(numAlunos, p);
			posicaox = posX;
			posicaoy = posY;
			listaDeAlunos.add(aluno);

			Celula celula = p.retornarCelula(posX, posY);
			celula.setAluno(aluno);
			System.out.println("Aluno " + posicaox + "," + posicaoy);
		}

//	public void sortearPosicaoAlunos(int numAlunos, Plano p) {
//		List<Celula> celulasLivres = new ArrayList<>();
//
//		for (int x = 1; x <= p.getTamanhoX(); x++) {
//			for (int y = 1; y <= p.getTamanhoY(); y++) {
//				Celula celula = p.retornarCelula(x, y);
//				celulasLivres.add(celula);
//			}
//		}
//
//		for (int i = 0; i < numAlunos && !celulasLivres.isEmpty(); i++) {
//
//			int num = random.nextInt(celulasLivres.size());
//			Celula celulaSorteada = celulasLivres.remove(num);
//
//			Aluno a = new Aluno(numAlunos, p);
//			setPosicaox(celulaSorteada.getPosicaoX());
//			setPosicaoy(celulaSorteada.getPosicaoY());
//			listaDeAlunos.add(a);
//			celulaSorteada.setAluno(a);
//
//		}
//	}

	}
}