package controller;

import java.io.File;

import view.Arquivo;
import view.Nome;
import view.Tabuleiro;

public class Jogador {

	public String nomeJogador;
	public int rodadas;
	public int celulasVazias;
	public int pontuacao;
	public int alunos;
	public int bugs;
	public int robox;
	public int roboy;
	public int roboz;

	public Nome n;
	public Tabuleiro t;

	public Jogador(int rodadas, int cel, int r1, int r2, int r3) {
		this.nomeJogador = n.getNomeInserido();
		this.rodadas = rodadas;
		this.celulasVazias = cel;
		this.pontuacao = t.pontuacao;
		this.alunos = t.AlunosAchados;
		this.bugs = t.BugsAchados;
		this.robox = r1;
		this.roboy = r2;
		this.roboz = r3;
	}

	public String getNomeJogador() {
		return nomeJogador;
	}

	public int getRodadas() {
		return rodadas;
	}

	public int getCelulasVazias() {
		return celulasVazias;
	}

	public int getPontuacao() {
		return pontuacao;
	}

	public int getAlunos() {
		return alunos;
	}

	public int getBugs() {
		return bugs;
	}

	public int getRobox() {
		return robox;
	}

	public int getRoboy() {
		return roboy;
	}

	public int getRoboz() {
		return roboz;
	}

	public String formatarDados() {

		String saida = "";

		saida += getNomeJogador() + " ; " + getRodadas() + " ; " + getCelulasVazias() + " ; " + getPontuacao() + " ; "
				+ getAlunos() + " ; " + getBugs() + " ; " + getRobox() + " ; " + getRoboy() + " ; " + getRoboz();

		return saida;
	}

	public void salvarDados() {
		Arquivo a = new Arquivo();
		File file = new File("dados/dadosJogadores");
		a.escreverDados(formatarDados(), file);
	}
}
