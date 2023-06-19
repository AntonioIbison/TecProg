package view;

import java.awt.Color;
import java.awt.FlowLayout;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class AtualizacoesControle extends JPanel {
	
	private JLabel label;
	private JLabel alunosQtdd;
	private JLabel bugQtdd;
	private ImageIcon iconA;
	private ImageIcon iconB;
	
	public AtualizacoesControle() {
		this.setLayout(new FlowLayout(FlowLayout.LEFT));
		this.setBackground(Color.decode("#fed9b7"));

		alunosQtdd = new JLabel();
		bugQtdd = new JLabel();

		label = new JLabel("Total: ");
		
		alunosQtdd.setText(" 5");
		iconA = new ImageIcon(getClass().getResource("/icons/57073.png"));
		alunosQtdd.setIcon(iconA);

		bugQtdd.setText(" 7");
		iconB = new ImageIcon(getClass().getResource("/icons/bugg.png"));
		bugQtdd.setIcon(iconB);

		this.add(label);
		this.add(alunosQtdd);
		this.add(bugQtdd);
	}

}
