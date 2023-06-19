package view;

import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JPanel;

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

		Botao jogar = new Botao("Jogar", new ImageIcon("img/adicionar-usuario.png"), Color.decode("#8e7dbe"));
		jogar.addActionListener(new EscolhaSuperior(j));

		Botao relatorio = new Botao("Relatorios", new ImageIcon("img/visualizar.png"), Color.decode("#8e7dbe"));
		relatorio.addActionListener(new EscolhaSuperior(j));

		this.add(n);
		this.add(jogar);
		this.add(relatorio);

	}
}
