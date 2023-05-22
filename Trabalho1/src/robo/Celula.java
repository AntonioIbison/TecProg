package robo;

public class Celula {

	public int posicaoX;
	public int posicaoY;
	public int id;
	public Robo robo;
	private AlunoPerdido aluno;
	private Bugs bug;

	public Celula(int id, int x, int y) {
		posicaoX = x;
		posicaoY = y;
		this.id = id;
		robo = null;
	}

	public int getPosicaoX() {
		return posicaoX;
	}

	public int getPosicaoY() {
		return posicaoY;
	}

	public boolean temAluno() {
		return aluno != null;
	}

	public boolean temBug() {
		return bug != null;
	}

	public String imprimir() {
		return "Celula:  " + id + " x: " + posicaoX + " y: " + posicaoY;
	}
}
