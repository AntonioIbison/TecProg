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
		this.id=id;
		robo = null;
	}
	public Celula(int x, int y) {
		posicaoX = x;
		posicaoY = y;
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

	public boolean retiraAluno() {
		 if (aluno != null) {
		        aluno = null;
		        return true; 
		    } else {
		        return false; 
		    }
	}

	public boolean temBug() {
		return bug != null;
	}

	public boolean retiraBug() {
		if (bug != null) {
	        bug = null;
	        return true; 
	    } else {
	        return false; 
	    }
	}
	public void setAluno(AlunoPerdido aluno) {
	    this.aluno = aluno;
	}

	public AlunoPerdido getAluno() {
	    return aluno;
	}

	public void setBug(Bugs bug) {
	    this.bug = bug;
	}

	public Bugs getBug() {
	    return bug;
	}


	public String imprimir() {
		return "Celula:  " + id + " x: " + posicaoX + " y: " + posicaoY;
	}
}
