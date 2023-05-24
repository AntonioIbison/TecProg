package robo;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Partida {

	private int alunosPerdidos;
	private int bugsEscondidos;
	private Plano plano;
	private List<Robo> r;

	public Partida(int alunosPerdidos, int bugsEscondidos, Plano plano, List<Robo> r) {
		this.alunosPerdidos = alunosPerdidos;
		this.bugsEscondidos = bugsEscondidos;
		this.plano = plano;
		this.r = r;

	}

	public void comecarPartida() {

		Tabuleiro();
		while (!todosAlunosAchados()) {
			movimentaVerificaAtualizaRobo();
			AlunoBugAchados();
			Pontos();
			Relatorio();
			verTerminoPartida();
		}
		RelatorioFinal();
	}

	private void verTerminoPartida() {
		if (todosAlunosAchados()) {
			System.out.println("Todos os alunos foram encontrados. O jogo terminou.");
		}
	}

	private void movimentaVerificaAtualizaRobo() {
		Scanner sc = new Scanner(System.in);

		for (Robo robo : r) {
			System.out.println("Quantas casas andará o robo " + robo.getNome() + "?");
			int casas = sc.nextInt();
			System.out.println("Digite: 1.avançar ou 2.retroceder?");
			int comando = sc.nextInt();

			if (comando == 1) {
				robo.avançar(casas);
			} else if (comando == 2) {
				robo.retroceder(casas);
			} else {
				movimentaVerificaAtualizaRobo();
			}
			Tabuleiro();
		}
		sc.close();
	}

	private void AlunoBugAchados() {
		for (Robo robo : r) {
			int xBuscado = robo.getPosicaox();
			int yBuscado = robo.getPosicaoy();
			Celula c = plano.retornarCelula(xBuscado, yBuscado);

			if (c != null) {
				if (c.temAluno()) {
					alunosPerdidos--;
					c.retiraAluno();
					robo.pontuar(c);
					System.out.println("Aluno encontrado. +10 pontos!");
				}

				if (c.temBug()) {
					bugsEscondidos--;
					c.retiraBug();
					robo.pontuar(c);
					System.out.println("Bug encontrado. -15 pontos!");
				}
			}
		}
	}

	private boolean todosAlunosAchados() {

		for (int i = 1; i <= plano.getTamanhoX(); i++) {
			for (int j = 1; j <= plano.getTamanhoY(); j++) {
				Celula c = plano.retornarCelula(i, j);
				if (c.temAluno()) {
					return false;
				}
			}
		}
		return true;
	}

	private void Pontos() {
		for (Robo robo : r) {
			System.out.println("Pontuação do " + robo.getNome() + ": " + robo.getPontos());
			System.out.println(
					"Posiçao do robo " + robo.getNome() + ": (" + robo.getPosicaox() + "," + robo.getPosicaoy() + ").");

			List<Celula> visitadas = robo.visitadas();
			System.out.println("Posições visitadas pelo " + robo.getNome() + ":");
			for (Celula c : visitadas) {
				System.out.println("(" + c.getPosicaoX() + "," + c.getPosicaoY() + ").");
			}
		}

	}

	public void Tabuleiro() {

		for (int j = 1; j <= plano.getTamanhoX(); j++) {
			for (int i = 1; i <= plano.getTamanhoY(); i++) {
				Celula c = plano.retornarCelula(i, j);
				String quadrado = "* ";

				for (Robo robo : r) {
					if (robo.getPosicaox() == i && robo.getPosicaoy() == j) {
						quadrado = robo.getLetra() + " ";
					}
				}

				if (c.temAluno()) {
					quadrado = "A ";
				} else if (c.temBug()) {
					quadrado = "B ";
				} else {

				}

				System.out.print(quadrado);
			}
			System.out.println();
		}
	}

	private void Relatorio() {
		System.out.println("Relatório da rodada: ");
		System.out.println("Restam " + alunosPerdidos + " alunos.");
		System.out.println("Restam " + bugsEscondidos + " bugs.");
	}

	private void RelatorioFinal() {

		System.out.println("Relatório Final: ");
		for (Robo robo : r) {
			System.out.println(robo.getNome() + " fez " + robo.getPontos() + " pontos.");
			List<Celula> Visitadas = robo.visitadas();
			for (Celula celula : Visitadas) {
				System.out.println(
						robo.getNome() + "esteve em: (" + celula.getPosicaoX() + "," + celula.getPosicaoY() + ").");
			}
		}
		System.out.println(alunosPerdidos + " alunos perdidos.");
		System.out.println(bugsEscondidos + " bugs escondidos.");

		Robo vence = Collections.max(r, Comparator.comparingInt(Robo::getPontos));
		System.out.println(
				"Obrigado por jogar. O robô " + vence.getNome() + " venceu com " + vence.getPontos() + " pontos.");
	}
}
