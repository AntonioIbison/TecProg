package robo;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		//Robo r = new Robo(1, "delta x", 2, 2, p);
		//p.verificarSeTemRobo();
		//r.moverEsquerda();
		//p.verificarSeTemRobo();
		
		//a) O jogo deverá iniciar pedindo para o jogador informar 
		//seu nome. O jogo salva a informação.
		System.out.println("Vamos jogar? Me informe seu nome: ");
		String nome=sc.nextLine();
		
		Player play = new Player(nome);
		
		System.out.println("Muito bem, "+ play.getNome()+ ". O jogo começará em instantes, mas antes...");
		//b)
		System.out.println("Me forneça as dimensões do plano: ");
		System.out.println("X: ");
		int posX=sc.nextInt();
		System.out.println("Y: ");
		int posY=sc.nextInt();
		
		Plano p = new Plano(posX, posY);
		
		//c) 
		System.out.println("Numero de bugs: ");
		int qtddBug=sc.nextInt();
		System.out.println("Numero de alunos perdidos: ");
		int qtddAluno=sc.nextInt();
		
		
		
		
		
		sc.close();
	}
	

}
