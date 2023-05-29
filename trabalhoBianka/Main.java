package trabalhoBianka;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner z = new Scanner(System.in);
		Jogador jogador = new Jogador();
		System.out.println("Informe seu nome: ");
		jogador.setNome(z.nextLine());

		System.out.println("Seja bem vinda ao Regaste dos Alunos de Técnicas de Programação na Ilha de Java 🤖 "+jogador.getNome()+"!\nQual a dimensão do seu tabuleiro?");
		int n = z.nextInt();
		Plano plano = new Plano(n, n);

		//ALUNOS
		System.out.println("Certo, e quantos alunos🐱‍🏍 se perderam? ");
		int numAluno = z.nextInt();
		Aluno aluno = new Aluno(numAluno, plano);
		aluno.sortearPosicaoAlunos(numAluno);

		
		//BUGS
		System.out.println("Agora informe a quantidade de bugs☠ presentes: ");
		int numBug = z.nextInt();
		Bug bug = new Bug(numBug);
		bug.sortearPosicaoBug(numBug, plano);

		ArrayList<Robo> robos = new ArrayList<Robo>();

		// adicionando os robos de um por um kk tem que mudar viu
		Robo T = new Torre(1, "T", 1, 1, plano);
		robos.add(T);
		Robo B = new Bispo(2, "B", 1, 1, plano);
		robos.add(B);
		Robo P = new Peao(3, "P", 1, 1, plano);
		robos.add(P);
		Robo Q = new Rainha(4, "Q", 1, 1, plano);
		robos.add(Q);
		Robo K = new Rei(5, "K", 1, 1, plano);
		robos.add(K);
		Robo A = new RoboAndador(6, "A", 1, 1, plano);
		robos.add(A);
		Robo C = new Cavalo(7, "C", 1, 1, plano);
		robos.add(C);
		//
		
		Partida p = new Partida(robos, plano);

		p.adicionarRobosDiferentes(robos);
		p.gerarTabuleiro(plano, robos);

		ArrayList<Aluno> a = new ArrayList<Aluno>();
		for (int i = 0; i < numAluno; i++) {
			a.add(aluno);
		}
		
		ArrayList<Bug> b = new ArrayList<Bug>();
		for (int i = 0; i < numBug; i++) {
			b.add(bug);
		}
		for (Robo robo : robos) {
			System.out.println("Quanto " + robo.getNome() + " irá se mover?");
			int numCelulas = z.nextInt();
			System.out.println("Para avançar digite 1\nPara retroceder digite 2");
			int opcao=z.nextInt();
			p.movimentarRobos(robo, opcao, numCelulas, plano, aluno, bug);
		}
		
		for (Robo robo : robos) {
			System.out.println();
			System.out.println("Robo "+ robo.getNome()+"; Pontuação = "+robo.getPontos()+"; Posição atual= ("+robo.posicaox+", "+robo.posicaoy+")");
			
		}
//		
//		for (Bug bug2 : b) {
//			System.out.println("Bug (" + bug2.getPosicaoxBug()+", "+bug2.getPosicaoyBug()+")");
//		}
//		for (Aluno aluno : a) {
//			System.out.println("Aluno (" + aluno.getPosicaoxAluno()+", "+aluno.getPosicaoyAluno()+")");
//		}
		
		System.out.println();
		p.gerarTabuleiro(plano, robos);
		
		z.close();
	}

}