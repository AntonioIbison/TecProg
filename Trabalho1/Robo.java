package robo;

import java.util.ArrayList;
import java.util.List;

public abstract class Robo {

	protected int id;
	protected String nome;
	protected int posicaox;
	protected int posicaoy;
	protected Plano plano;
	protected int pontos;
	private String letra;
	private List<Celula> Visitadas;

	public Robo(int id, String nome, int posicaox, int posicaoy, Plano plano, int pontos, String letra) {
		this.id = id;
		this.nome = nome;
		this.posicaox = posicaox;
		this.posicaoy = posicaoy;
		this.plano = plano;
		this.pontos = pontos;
		this.Visitadas = new ArrayList<>();
		this.letra = letra;

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

	public String getLetra() {
		return letra;
	}

	public int getPosicaox() {
		return posicaox;
	}

	public int getPosicaoy() {
		return posicaoy;
	}

	public int getPontos() {
		return pontos;
	}

	public abstract void avançar(int quantidade);

	public abstract void retroceder(int quantidade);

	public abstract void verificaLimite();

	public List<Celula> visitadas() {
		return Visitadas;
	}

	public void visitou(Celula c) {
		visitadas().add(c);
	}

	/*
	 * public void cVisitada(Celula celula) { Visitadas.add(celula); }
	 */

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