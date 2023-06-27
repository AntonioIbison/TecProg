package view;

import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.JLabel;
import javax.swing.JPanel;

import controller.Jogador;

public class PainelControle extends JPanel {

	public JanelaPrincipal j;
	private Jogador jo;
	private Tabuleiro t;
	private static JLabel pontuacaoLabel;
	
	private ManualSair vps;
	private PainelRobos robos;
	private AtualizacoesControle atc;
	private PontuacaoIndividual pi;

	public PainelControle(JanelaPrincipal j, Jogador jo) {
		this.j = j;
		this.jo = jo;
		t = new Tabuleiro(null);
		this.setLayout(new GridLayout(5, 1));
		this.setBackground(Color.decode("#fed9b7"));

		pontuacaoLabel = new JLabel(String.valueOf("  Pontuação: "+t.getPontuacao()));
		
		pi = new PontuacaoIndividual();
		atc= new AtualizacoesControle();
		robos = new PainelRobos();
		vps = new ManualSair(j, jo);

		this.add(pontuacaoLabel);
		this.add(atc);
		this.add(pi);
		this.add(robos);
		this.add(vps);
	}
	
	public static void atualizarPontos(int quantidade) {
		pontuacaoLabel.setText(String.valueOf("  Pontuação: "+quantidade));
	}

}
