package view;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;

public class ManualSair extends JPanel implements ActionListener {
	private JanelaPrincipal frame;
	private Jogador j;
	private JButton manual;
	private JButton sair;

	public ManualSair(JanelaPrincipal frame, Jogador jogador) {
		this.j = jogador;
		this.frame = frame;
		this.setBackground(Color.decode("#fed9b7"));
		this.setLayout(new GridLayout(2, 1, 0, 7));

		manual = botoes("Manual do jogo", "#8e7dbe");
		sair = botoes("Sair da partida", "#8e7dbe");

		manual.addActionListener(this);
		sair.addActionListener(this);

		this.add(manual);
		this.add(sair);
	}

	private JButton botoes(String nome, String corHexadecimal) {
		JButton b = new JButton(nome);
		b.setBackground(Color.decode(corHexadecimal));
		b.setPreferredSize(new Dimension(100, 100));
		return b;
	}

	public void actionPerformed(ActionEvent e) {
		if (e.getSource() instanceof JButton) {
			JButton button = (JButton) e.getSource();
			if (button.getText().equals("Manual do jogo")) {
				frame.mapa.setVisible(true);
				frame.relatorios.setVisible(false);

			} else if (button.getText().equals("Sair da partida")) {
				 if (j != null) {
	                    j.salvarDados();
	                }

				frame.mapa.setVisible(false);
				frame.relatorios.setVisible(true);
			}
		}
	}
}
