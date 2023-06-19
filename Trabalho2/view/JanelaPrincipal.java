package view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class JanelaPrincipal extends JFrame {

	private JPanel painel;
	
	public PainelControle pc;
	public Tabuleiro mapa;
	public JPanel relatorios;
	public PainelSuperior opcoes;

	public JanelaPrincipal() {

		mapa = new Tabuleiro(this);
		pc = new PainelControle(this);
		relatorios = new PainelListar();

		opcoes = new PainelSuperior(this);
		opcoes.setPreferredSize(new Dimension(100, 44));

		mapa.setVisible(false);
		pc.setVisible(false);
		
		painel = new JPanel(new BorderLayout());
        painel.add(opcoes, BorderLayout.NORTH);
        painel.add(mapa, BorderLayout.CENTER);
        painel.add(pc, BorderLayout.EAST);
        painel.add(relatorios, BorderLayout.SOUTH);

        getContentPane().add(painel);
		
		setTitle("Trabalho 2 Java");
		setSize(700, 500);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setResizable(false);
		setVisible(true);
	}
}
