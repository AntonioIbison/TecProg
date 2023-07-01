package ui;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import entities.Aluno;
import entities.Bug;

public class Sorteio {
	private int linhas, colunas;
	public int qtddAluno, qntddBug;
	private List<String> ocupadas;
	private List<Aluno> alunos;
	private List<Bug> bugs;

	public Sorteio() {
		this.linhas = 8;
		this.colunas = 8;
		this.qtddAluno = 5;
		this.qntddBug = 7;
		this.ocupadas = new ArrayList<>();
		this.alunos = new ArrayList<>();
		this.bugs = new ArrayList<>();
	}

	public void sortearPosicoes() {
		sorteio(alunos, qtddAluno);
		sorteio(bugs, qntddBug);
	}

	private void sorteio(List<?> lista, int quantidade) {
		for (int i = 0; i < quantidade; i++) {
			int linha, coluna;
			do {
				linha = new Random().nextInt(linhas);
				coluna = new Random().nextInt(colunas);
			} while (ocupadas.contains(linha + "," + coluna));

			if (lista == alunos) {
				alunos.add(new Aluno(linha, coluna));
			} else if (lista == bugs) {
				bugs.add(new Bug(linha, coluna));
			}
		}
	}

	public boolean verificaAluno(int linha, int coluna) {
		for (Aluno aluno : alunos) {
			if (aluno.getPosY() == linha && aluno.getPosX() == coluna) {
				return true;
			}
		}
		return false;
	}

	public boolean verificaBug(int linha, int coluna) {
		for (Bug bug : bugs) {
			if (bug.getPosY() == linha && bug.getPosX() == coluna) {
				return true;
			}
		}
		return false;
	}

}
