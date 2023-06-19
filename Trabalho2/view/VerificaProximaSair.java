package view;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JPanel;

public class VerificaProximaSair extends JPanel {
	
	
	private Dimension tamanho;
	private JButton verifica;
	private JButton proxima;
	private JButton sair;

	public VerificaProximaSair() {
		this.setBackground(Color.decode("#fed9b7"));
		this.setLayout(new GridLayout(3, 1, 0, 7));

		verifica = new JButton("Verificar");
		proxima = new JButton("Proxima jogada");
		sair = new JButton("Sair da partida");

		verifica.setBackground(Color.decode("#8e7dbe"));
		proxima.setBackground(Color.decode("#8e7dbe"));
		sair.setBackground(Color.decode("#8e7dbe"));
		
		tamanho = new Dimension(100, 100);
		verifica.setPreferredSize(tamanho);
		proxima.setPreferredSize(tamanho);
		sair.setPreferredSize(tamanho);

		this.add(verifica);
		this.add(proxima);
		this.add(sair);
	}

}
