package view;

import java.awt.Color;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Iterator;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

import controller.Aluno;

public class Tabuleiro extends JPanel {

	private JFrame frame;

	public Tabuleiro(JFrame frame) {
		this.frame = frame;
		this.setLayout(new GridLayout(8, 8));
		for (int i = 0; i < 8; i++) {
			for (int j = 0; j < 8; j++) {
				this.add(botoes());
			}
		}

	}

	private JButton botoes() {
		JButton b = new JButton();
		b.setBackground(Color.decode("#87baab"));
		return b;
	}

}
