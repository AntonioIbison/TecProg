package view;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Nome extends JPanel {

	public JLabel label;
	public JTextField qtdd;

	public Nome(String nome) {
		label = new JLabel(nome);
		label.setForeground(Color.white);
		label.setBackground(Color.decode("#424c77"));
		label.setOpaque(true);

		qtdd = new JTextField(10);

		this.add(label);
		this.add(qtdd);

	}
	public String getNomeInserido() {
        return qtdd.getText();
    }

	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		g.setColor(Color.decode("#424c77"));
		g.fillRect(0, 0, getWidth(), getHeight());
	}

}
