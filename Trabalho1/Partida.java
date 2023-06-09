package robo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class Partida implements Rodadas {

	private int alunosPerdidos;
	private int bugsEscondidos;
	private Plano plano;
	private List<Robo> r;
	private Player jogador;
	private int maisPontos;

	public Partida(int alunosPerdidos, int bugsEscondidos, Plano plano, List<Robo> r, Player jogador) {
		this.alunosPerdidos = alunosPerdidos;
		this.bugsEscondidos = bugsEscondidos;
		this.plano = plano;
		this.r = r;
		this.jogador = jogador;
		maisPontos = 0;
	}
	
	//d
	public void comecarPartida() {
		mapa();
		while (!todosAlunosAchados()) {
			movimentaVerificaAtualizaRobo();
			alunoBugAchados();
			pontos();
			verTerminoPartida();
		}
		relatorioFinal();
	}

	private void verTerminoPartida() {
		if (todosAlunosAchados()) {
			System.out.println("Todos os alunos foram encontrados. O jogo terminou.");
		}
	}

	// e
	private void movimentaVerificaAtualizaRobo() {
		Scanner sc = new Scanner(System.in);

		for (Robo robo : r) {
			try {
				System.out.println("Quantas casas andará o robo " + robo.getNome() + "?");
				int casas = sc.nextInt();

				System.out.println("Digite: 1.avançar ou 2.retroceder?");
				int comando = sc.nextInt();

				if (comando == 1) {
					robo.avançar(casas);
					robo.visitou(plano.retornarCelula(robo.getPosicaox(), robo.getPosicaoy()));
				} else if (comando == 2) {
					robo.retroceder(casas);
					robo.visitou(plano.retornarCelula(robo.getPosicaox(), robo.getPosicaoy()));
				} else {
					movimentaVerificaAtualizaRobo();
				}
				mapa();
			} catch (InputMismatchException e) {
				System.out.println("valor invalido, vamos denovo...");
				movimentaVerificaAtualizaRobo();
			}
		}
	}

	private void alunoBugAchados() {
		List<Celula> alunosEncontrados = new ArrayList<>();
		List<Celula> bugsEncontrados = new ArrayList<>();

		for (Robo robo : r) {
			Celula c = plano.retornarCelula(robo.getPosicaox(), robo.getPosicaoy());

			if (c != null) {
				if (c.temAluno()) {
					alunosPerdidos--;
					robo.pontuar(c);
					alunosEncontrados.add(c);
					System.out.println("Houve aluno(s) encontrado(s)!");
				}

				if (c.temBug()) {
					bugsEscondidos--;
					robo.pontuar(c);
					bugsEncontrados.add(c);
					System.out.println("Houve bug(s) encontrado(s)!");
				}
			}
		}

		for (Celula c : alunosEncontrados) {
			c.retiraAluno();
		}

		for (Celula c : bugsEncontrados) {
			c.retiraBug();
		}

		relatorio();
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

	// g
	private void pontos() {
		System.out.println("✄╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌");
		for (Robo robo : r) {
			System.out.println("Pontuação do " + robo.getNome() + ": " + robo.getPontos() + "\nAtual posição do robo "
					+ robo.getNome() + ": (" + robo.getPosicaox() + "," + robo.getPosicaoy() + ").");

			List<Celula> visitadas = robo.visitadas();
			System.out.println("Posições visitadas pelo " + robo.getNome() + ":");
			for (Celula c : visitadas) {
				System.out.println("(" + c.getPosicaoX() + "," + c.getPosicaoY() + ").");
			}
			System.out.println("✄╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌");
		}

	}

	public void mapa() {

		for (int j = 1; j <= plano.getTamanhoX(); j++) {
			for (int i = 1; i <= plano.getTamanhoY(); i++) {
				Celula c = plano.retornarCelula(i, j);
				String bloco = "∎ ";
				for (Robo robo : r) {
					if (robo.getPosicaox() == i && robo.getPosicaoy() == j) {
						bloco = robo.getLetra() + " ";

					}
				}

//				if (c.temAluno() || c.temBug()) {
//					bloco = "∎ ";
//				}

				if (c.temAluno()) {
					bloco = "A ";
				} else if (c.temBug()) {
					bloco = "B ";
				}

				System.out.print(bloco);
			}
			System.out.println();
		}
	}

	// f
	private void relatorio() {
		System.out.println("✄╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌\nRelatório da rodada: ");
		System.out.println("Restam " + alunosPerdidos + " alunos.");
		System.out.println("Restam " + bugsEscondidos + " bugs.");
	}

	// h
	private void relatorioFinal() {
		Robo vence = null;
		System.out.println("✄╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌\nRelatório Final: ");
		for (Robo robo : r) {
			System.out.println(robo.getNome() + " fez " + robo.getPontos() + " pontos.");
			List<Celula> Visitadas = robo.visitadas();
			for (Celula celula : Visitadas) {
				System.out.println(
						robo.getNome() + " passou por: (" + celula.getPosicaoX() + "," + celula.getPosicaoY() + ").");
			}
			if (robo.getPontos() > maisPontos) {
				maisPontos = robo.getPontos();
				vence = robo;
			}

			System.out.println("✄╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌");
		}
		System.out.println("Nao ha mais alunos e bugs no mapa.");
		if (vence != null) {
			System.out.println("Obrigado por jogar, " + jogador.getNome() + ". O robô " + vence.getNome()
					+ " venceu com " + vence.getPontos() + " pontos.");
		}
	}
}
