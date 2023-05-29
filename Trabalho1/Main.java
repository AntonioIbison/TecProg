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
		System.out.println("Me forneça as dimensões do plano: \nX: ");
		int posX = sc.nextInt();
		System.out.println("Y: ");
		int posY = sc.nextInt();
		Plano p = new Plano(posX, posY);
		AlunoPerdido ap = new AlunoPerdido(p);
		Bugs bug = new Bugs(p);

		// c
		System.out.println("Quantos alunos se perderam? ");
		int alunosPerdidos = sc.nextInt();
		System.out.println("Quantos bugs tem na ilha? ");
		int bugsEscondidos = sc.nextInt();

		List<Robo> robos = new ArrayList<>();
		ap.sortearPosicaoAlunosPerdidos(alunosPerdidos);
		bug.sortearPosicaoBugs(bugsEscondidos);

		robos.add(new RoboAndador(1, "Andador", 1, 1, p, 0));
		robos.add(new Peao(2, "Peao", 1, 1, p, 0));
		robos.add(new Torre(3, "Torre", 1, 1, p, 0));
		robos.add(new Bispo(4, "Bispo", 1, 1, p, 0));
		robos.add(new Cavalo(5, "Cavalo", 1, 1, p, 0));
		robos.add(new Rei(6, "Rei", 1, 1, p, 0));
		robos.add(new Rainha(7, "Rainha", 1, 1, p, 0));

		sc.nextLine();
		// d
		Partida pt = new Partida(alunosPerdidos, bugsEscondidos, p, robos, play);

		pt.comecarPartida();
		sc.close();
	}
}
