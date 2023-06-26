package view;

import java.awt.GridLayout;

import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class PainelRelatorio extends JPanel {
	JPanel painelFundo;
	private JTable tabela;
	private JScrollPane barraRolagem;

	public PainelRelatorio() {

		painelFundo = new JPanel();
		painelFundo.setLayout(new GridLayout(1, 1));
		tabela = new JTable(dados, colunas);
		barraRolagem = new JScrollPane(tabela);
		painelFundo.add(barraRolagem);
		this.setVisible(false);

		this.add(painelFundo);
	}

	Object[][] dados = { { "Caua", "20", "10", "70", "10", "2", "100", "-15", "-15" },
			{ "Geovana", "20", "10", "70", "10", "2", "100", "-15", "-15" }, };

	String[] colunas = { "Jogador", "Qtdd. Rodadas", "Celulas vazias", "Pontuaçao", "Alunos resgatados",
			"Bugs encontrados", "robo1", "robo2", "robo3" };

}
