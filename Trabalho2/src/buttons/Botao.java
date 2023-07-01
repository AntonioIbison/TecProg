package buttons;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;

import javax.swing.JButton;

public class Botao extends JButton {

	public Botao(String nome, Color c) {

		this.setText(nome);
		this.setBackground(c);
		this.setFont(new Font(Font.SANS_SERIF, Font.BOLD, 13));
		this.setForeground(Color.decode("#04151f"));
		this.setPreferredSize(new Dimension(105, 31));

	}
}
