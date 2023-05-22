package robo;

public abstract class Robo {

	public int id;
	public String nome;
	public int posicaox;
	public int posicaoy;
	public Plano plano;
	public int pontos;

	public Robo(int id, String nome, int posicaox, int posicaoy, Plano plano, int pontos) {

		this.id = id;
		this.nome = nome;
		this.posicaox = posicaox;
		this.posicaoy = posicaoy;
		this.plano = plano;
		this.pontos = 0;

		Celula aux = null;
		for (int i = 0; i < plano.listaCelulas.size(); i++) {
			aux = plano.listaCelulas.get(i);
			if (aux.posicaoX == posicaox && aux.posicaoY == posicaoy) {
				aux.robo = this;
			}
		}
	}

	public String getNome() {
		return nome;
	}

	public int getPosicaox() {
		return posicaox;
	}

	public int getPosicaoy() {
		return posicaoy;
	}

	public abstract void avançar(int quantidade);

	public abstract void retroceder(int quantidade);

	public abstract void verificaLimite();
	
	public void ganhaPonto(int pontos) {
		this.pontos += pontos;
	}

	public void perdePonto(int pontos) {
		this.pontos -= pontos;
	}

	public void pontuar(Celula c) {
		if (c.temAluno()) {
			ganhaPonto(10);
		} else if (c.temBug()) {
			perdePonto(15);
		}
	}
}