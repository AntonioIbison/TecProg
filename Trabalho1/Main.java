package robo;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// a
		System.out.println("Vamos jogar? Me informe seu nome: ");
		String nome = sc.nextLine();
		Player play = new Player(nome);
		System.out.println("Muito bem, " + play.getNome() + ". O jogo começará em instantes, mas antes...");

		// b
		System.out.println("Me forneça as dimensões do plano: ");
		System.out.println("X: ");
		int posX = sc.nextInt();
		System.out.println("Y: ");
		int posY = sc.nextInt();
		Plano p = new Plano(posX, posY);
		AlunoPerdido ap = new AlunoPerdido(p);
		Bugs bu = new Bugs(p);

		// c
		System.out.println("Quantos alunos se perderam? ");
		int alunosPerdidos = sc.nextInt();
		System.out.println("Quantos bugs tem na ilha? ");
		int bugsEscondidos = sc.nextInt();
		
		List<Robo> robos = new ArrayList<>();
		ap.sortearPosicaoAlunosPerdidos(alunosPerdidos);
		bu.sortearPosicaoBugs(bugsEscondidos);
		
		for (int i = 1; i <= 8; i++) {
			Robo robo;
			String name = "Robo " + i;

			if (i == 1) {
				robo = new roboAndador(i, name, 1, 1, p, 0);
			} else if (i == 2) {
				robo = new Peao(i, name, 1, 1, p, 0);
			} else if (i == 3) {
				robo = new Torre(i, name, 1, 1, p, 0);
			} else if (i == 4) {
				robo = new Bispo(i, name, 1, 1, p, 0);
			} else if (i == 5) {
				robo = new Cavalo(i, name, 1, 1, p, 0);
			} else if (i == 6) {
				robo = new Rei(i, name, 1, 1, p, 0);
			} else if (i == 7) {
				robo = new Rainha(i, name, 1, 1, p, 0);
			} else {
				continue;
			}

			robos.add(robo);
		}

		sc.nextLine();
		//d
		Partida pt = new Partida(alunosPerdidos, bugsEscondidos, p, robos, play);

		pt.comecarPartida();

		sc.close();
	}

}
