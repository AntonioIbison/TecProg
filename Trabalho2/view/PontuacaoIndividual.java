package view;

import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class PontuacaoIndividual extends JPanel {

	private JLabel qtddRobo1Pontos;
	private JLabel qtddRobo2Pontos;
	private JLabel qtddRobo3Pontos;

	private ImageIcon icon1;
	private ImageIcon icon2;
	private ImageIcon icon3;

	public PontuacaoIndividual() {
		this.setLayout(new GridLayout(1, 3));
		this.setBackground(Color.decode("#fed9b7"));

		qtddRobo1Pontos = new JLabel();
		qtddRobo2Pontos = new JLabel();
		qtddRobo3Pontos = new JLabel();

		icon1 = new ImageIcon(getClass().getResource("/icons/robo1.png"));
		icon2 = new ImageIcon(getClass().getResource("/icons/robo2.png"));
		icon3 = new ImageIcon(getClass().getResource("/icons/robo3.png"));

		qtddRobo1Pontos.setIcon(icon1);
		qtddRobo1Pontos.setText("20");

		qtddRobo2Pontos.setIcon(icon2);
		qtddRobo2Pontos.setText("-15");

		qtddRobo3Pontos.setIcon(icon3);
		qtddRobo3Pontos.setText("0");

		this.add(qtddRobo1Pontos);
		this.add(qtddRobo2Pontos);
		this.add(qtddRobo3Pontos);
	}

}
