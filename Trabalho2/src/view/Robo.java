package view;

public abstract class Robo {
	private int pontuacaoIndividual;

	public Robo(int pontuacaoIndividual) {
		this.pontuacaoIndividual = pontuacaoIndividual;
	}

	public int getPontuacaoIndividual() {
		return pontuacaoIndividual;
	}

	public void atualizarPontuacaoIndividual(int quantidade) {
		pontuacaoIndividual += quantidade;
	}
}
