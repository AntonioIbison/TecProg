package Exerc16;

class Elevador {
	private int andarAtual, totalAndares, capacidade, pessoasPresentes;

	public void inicializa(int capacidade, int totalAndares) {
		this.capacidade = capacidade;
		this.totalAndares = totalAndares;
	}

	public void entra() {
		if (pessoasPresentes < capacidade)
			pessoasPresentes++;
	}

	public void sai() {
		if (pessoasPresentes > 0)
			pessoasPresentes--;
	}

	public void sobe() {
		if (andarAtual < totalAndares)
			andarAtual++;
	}

	public void desce() {
		if (andarAtual > 0)
			andarAtual--;
	}
}