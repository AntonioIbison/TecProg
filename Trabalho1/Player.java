package robo;

import java.util.Scanner;

public class Player {
	Scanner sc = new Scanner(System.in);
	private String nome;

	public Player(String nome) {
		this.nome = nome;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

}
