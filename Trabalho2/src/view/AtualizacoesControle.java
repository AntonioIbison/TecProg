
package view;

import java.awt.Color;
import java.awt.FlowLayout;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class AtualizacoesControle extends JPanel {

	private JLabel label;
	private static JLabel alunosQtdd;
	private static JLabel bugQtdd;
	private ImageIcon iconA;
	private ImageIcon iconB;
	private Tabuleiro t;

	public AtualizacoesControle() {
		this.setLayout(new FlowLayout(FlowLayout.LEFT));
		this.setBackground(Color.decode("#fed9b7"));

		t = new Tabuleiro(null);
		alunosQtdd = new JLabel();
		bugQtdd = new JLabel();

		label = new JLabel("Total: ");

		atualizarQuantidadeAlunos(t.getAlunosAchados());
		iconA = new ImageIcon(getClass().getResource("/icons/57073.png"));
		alunosQtdd.setIcon(iconA);

		atualizarQuantidadeBugs(t.getBugsAchados());
		iconB = new ImageIcon(getClass().getResource("/icons/bugg.png"));
		bugQtdd.setIcon(iconB);

		this.add(label);
		this.add(alunosQtdd);
		this.add(bugQtdd);
	}

	public static void atualizarQuantidadeAlunos(int quantidade) {
		alunosQtdd.setText(String.valueOf(quantidade));
	}

	public static void atualizarQuantidadeBugs(int quantidade) {
		bugQtdd.setText(String.valueOf(quantidade));
	}

}