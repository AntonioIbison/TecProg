package robo;

import java.util.List;
import java.util.Scanner;

public class Partida {

	private int alunoAchado;
	private int bugAchado;
	private Plano plano;
	private List<Robo> r;
	private boolean fimDoJogo;

	public Partida(int alunoAchado, int bugAchado, Plano plano, List<Robo> r, boolean fimDoJogo) {
		this.alunoAchado = 0;
		this.bugAchado = 0;
		this.plano = plano;
		this.r = r;
		this.fimDoJogo = false;
	}

	public void comecarPartida() {

		movimentaVerificaAtualizaRobo();
		AlunoBugAchados();
		todosAlunosAchados();
		Pontos();
		Relatorio();
		verTerminoPartida();
	}

	private void verTerminoPartida() {

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
			sc.close();
		}
	}

	private void AlunoBugAchados() {

	}

	private void todosAlunosAchados() {

	}

	private void Pontos() {

	}

	private void Relatorio() {

	}

}
