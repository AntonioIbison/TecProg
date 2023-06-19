package view;

import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.JLabel;
import javax.swing.JPanel;

public class PainelControle extends JPanel {

	public JanelaPrincipal j;
	private JLabel pontuacaoLabel;

	private JLabel alunosQtdd;
	private JLabel bugQtdd;
	
	private VerificaProximaSair vps;
	private PainelRobos robos;
	private AtualizacoesControle atc;
	private PontuacaoIndividual pi;

	public PainelControle(JanelaPrincipal j) {
		this.j = j;
		this.setLayout(new GridLayout(5, 1));
		this.setBackground(Color.decode("#fed9b7"));

		pontuacaoLabel = new JLabel("  Pontuação: x ");
		
		pi = new PontuacaoIndividual();
		atc= new AtualizacoesControle();
		robos = new PainelRobos();
		vps = new VerificaProximaSair();

		this.add(pontuacaoLabel);
		this.add(atc);
		this.add(pi);
		this.add(robos);
		this.add(vps);
	}

	public void qtddA(int quantidade) {
		alunosQtdd.setText("Total: " + quantidade);
	}

	public void qtddB(int quantidade) {
		bugQtdd.setText("Total: " + quantidade);
	}

}
