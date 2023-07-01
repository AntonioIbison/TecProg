package ui;

import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JPanel;

import buttons.Botao;
import buttons.EscolhaSuperior;
import execucao.JanelaPrincipal;

public class PainelSuperior extends JPanel {

	JanelaPrincipal j;
	Nome n;

	public PainelSuperior(JanelaPrincipal j) {

		n = new Nome("Nome: ");
		this.j = j;
		painelCima();
		this.setBackground(Color.decode("#424c77"));
	}

	private void painelCima() {

		Botao jogar = new Botao("Jogar", Color.decode("#8e7dbe"));
		jogar.addActionListener(new EscolhaSuperior(j, n));

		Botao relatorio = new Botao("Relatorios", Color.decode("#8e7dbe"));
		relatorio.addActionListener(new EscolhaSuperior(j, n));

		this.add(n);
		this.add(jogar);
		this.add(relatorio);

	}
}
