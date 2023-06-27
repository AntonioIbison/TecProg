package view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class TelaManual extends JFrame {

	private JPanel painelNorte;
	private JPanel painelCentro;
	private JPanel painelSul;

	public TelaManual() {
		config();
	}

	private void config() {
		setTitle("Manual do jogo");
		setSize(700, 500);
		setLocationRelativeTo(null);
		setResizable(false);
		setVisible(true);

		painelNorte = new JPanel(new BorderLayout());
		painelNorte.add(new JLabel(
				"<html><body style='width: 530px'>Esse é um jogo de tabuleiro que envolve cliques, e tem como objetivo principal o encontro de todos os alunos. Após o jogador fornecer seu nome, inicia-se o jogo ao clicar no botão Jogar. Então é exibido o painel principal, que inclui o tabuleiro, informações atualizadas em tempo real, botões representando os robôs e etc.</body></html>"));
		painelNorte.add(new JLabel("MANUAL DO JOGO:"), BorderLayout.NORTH);

		painelCentro = new JPanel(new GridLayout(1, 3));
		painelCentro.add(new JLabel("<html><body style='width: 150px'>Mecanicas do jogo:<br>"
				+ "a. Após a seleçao de um robô, é realizado um clique em uma posição do tabuleiro.<br>"
				+ "b. Entao, é verificado a existencaid e alunos ou bugs.<br>"
				+ "c. Se houver um aluno, o botão clicado mudará a cor para verde, indicando o encontro. Então, é adicionado 1 a alunos encontrados.<br>"
				+ "d. Se houver um bug, o botão clicado mudará a cor para vermelho, indicando o encontro. Então, é adicionado 1 a bugs encontrados.<br>"
				+ "e. E caso não esteja vazio, o botão mudará a cor para cinza, indicando um não-encontro.</body></html>"));
		painelCentro.add(new JLabel("<html><body style='width: 150px'>Atualizações:<br>"
				+ "a. As informações são atualizadas em tempo real, ao decorrer do jogo.<br>"
				+ "b. A quantidade de alunos/bugs encontrados é atualizada e exibida no painel de informações. Isso permite um melhor acompanhamento do jogo.<br>"
				+ "c. A pontuação é atualizada com base nos encontros. É exibida no painel, permitindo o acompanhamento.</body></html>"));
		painelCentro.add(new JLabel(
				"<html><body style='width: 150px'>Robôs:<br>" + "a. Cada robô é representado por um botão na tela.<br>"
						+ "b. Ao selecionar um robô, se clica em uma posição do tabuleiro para realizar a ação.<br>"
						+ "c. A cor do botão do robô se altera indicando estado do encontro.</body></html>"));

		painelSul = new JPanel();
		painelSul.add(new JLabel(
				"<html><body style='width: 350px'>A mecânica é simples e cativante, o jogo é desafiador e divertido, incentivando a exploração de alcançar o objetivo de encontrar todos os alunos.</body></html>"));

		add(painelNorte, BorderLayout.NORTH);
		add(painelCentro, BorderLayout.CENTER);
		add(painelSul, BorderLayout.SOUTH);

	}
}
