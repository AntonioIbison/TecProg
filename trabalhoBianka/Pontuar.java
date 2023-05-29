package trabalhoBianka;

public class Pontuar {

	protected int pontos;
	Celula celula;
	Aluno aluno;
	Bug bug;

	public Pontuar() {
		pontos = 0;
	}

	public void pegouAluno() {
		pontos += 10;
	}

	public void pegouBug() {
		pontos -= 15;
	}

	public int getPontos() {
		return pontos;
	}

	//

	public void darPontuacao(Robo robo, Bug bug, Aluno aluno) {

		if (robo.getPosicaoy() == bug.getPosicaoyBug() && robo.getPosicaox() == bug.getPosicaoxBug()) {
			pegouBug();
		} else if (robo.getPosicaox() == aluno.getPosicaoxAluno() && robo.getPosicaoy() == aluno.getPosicaoyAluno()) {
			pegouAluno();
		}
	}

}