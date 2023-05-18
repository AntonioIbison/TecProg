package negocio;

import java.util.Random;
import apresentacao.*;

public class Jogo {

	private Jogador jogador;
	private Tela tela;
	private Terminal terminal;
	private int numeroEscolhido;
	private boolean jogando;

	Random nE = new Random();

	public Jogo() {
		tela = new Tela();
		terminal = new Terminal();
		jogador = new Jogador();
		numeroEscolhido = nE.nextInt(101);
		jogando = true;
	}

	public void inciarJogoTerminal() {
		jogador.setNome(terminal.entradaNome());
		terminal.mesagem("Seja bem vindo: " + jogador.getNome());
	}

	public void inciarJogoGUI() {
		jogador.setNome(tela.entradaDados("Qual é o seu nome?"));
		tela.mesagem("Seja bem vindo: " + jogador.getNome());
		jogadas();
	}

	public int solicitarNumero() {
		String numero = tela.entradaDados(jogador.getNome() + ", informe um numero de 0 a 100:");
		return Integer.parseInt(numero);
	}

	public void jogadas() {
		do {
			verificarAcerto();
		} while (jogando);

		fimDoJogo();
	}

	private void fimDoJogo() {

		String numeros = "";
		for (Integer numero : jogador.getListaNumeros()) {
			numeros += " - " + numero;
		}
		tela.mesagem("Numeros apostados: " + numeros);

	}

	public boolean verificarMenor(int numero) {
		if (numero < numeroEscolhido)
			return true;

		return false;
	}

	public void verificarAcerto() {
		try {
		int numero = solicitarNumero();
		jogador.addNumero(numero);

		if (numero == numeroEscolhido) {
			jogador.setNumeroTentativa();
			tela.mesagem("Acertou! Foram"+ jogador.getNumeroTentativa() + "tentativas.");
			jogando = false;
		} else {
			jogador.setNumeroTentativa();
			String msg = (verificarMenor(numero)) ? " Tente um numero maior." : " Tente um número menor.";
			tela.mesagem("Errou." + msg);
		}
		}catch(NumberFormatException e) {
			tela.mesagem("Insira um valor válido");
		}
	}

}
