package execucao;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

import ui.PainelControle;
import ui.PainelRelatorio;
import ui.PainelSuperior;
import ui.Tabuleiro;

public class JanelaPrincipal extends JFrame {

	private JPanel painel;
	public PainelControle pc;
	public Tabuleiro mapa;
	public JPanel relatorios;
	public PainelSuperior opcoes;

	public JanelaPrincipal() {
		iniciar();
		layoutPainel();
		config();

		mapa.setVisible(false);
		pc.setVisible(false);
	}

	private void iniciar() {
		mapa = new Tabuleiro(null);
		pc = new PainelControle(this, null);
		relatorios = new PainelRelatorio();
		opcoes = new PainelSuperior(this);
	}

	private void layoutPainel() {
		painel = new JPanel(new BorderLayout());
		painel.add(opcoes, BorderLayout.NORTH);
		painel.add(mapa, BorderLayout.CENTER);
		painel.add(pc, BorderLayout.EAST);
		painel.add(relatorios, BorderLayout.SOUTH);

		opcoes.setPreferredSize(new Dimension(100, 44));
	}

	private void config() {
		getContentPane().add(painel);
		setTitle("Trabalho 2 Java");
		setSize(700, 500);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setResizable(false);
		setVisible(true);
	}
}
