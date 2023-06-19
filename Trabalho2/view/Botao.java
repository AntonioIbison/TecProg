package view;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JButton;

public class Botao  extends JButton{

	public Botao(String nome, ImageIcon img, Color c) {
		
		this.setIcon(img);
		this.setText(nome);
		this.setFont(this.getFont().deriveFont(Font.LAYOUT_NO_LIMIT_CONTEXT, 15));
		this.setBackground(c);
		this.setForeground(Color.decode("#04151f"));
		this.setPreferredSize(new Dimension(105, 31));

	}
}
