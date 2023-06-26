package view;

import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class PontuacaoIndividual extends JPanel {

	private JLabel[] qtddPontosRobo;
	private ImageIcon[] icons;

	public PontuacaoIndividual() {
		this.setLayout(new GridLayout(1, 3));
		this.setBackground(Color.decode("#fed9b7"));

		qtddPontosRobo = new JLabel[3];
		icons = new ImageIcon[3];

		icons[0] = new ImageIcon(getClass().getResource("/icons/robo1.png"));
		icons[1] = new ImageIcon(getClass().getResource("/icons/robo2.png"));
		icons[2] = new ImageIcon(getClass().getResource("/icons/robo3.png"));

		for (int i = 0; i < 3; i++) {
			qtddPontosRobo[i] = new JLabel();
			qtddPontosRobo[i].setIcon(icons[i]);
			qtddPontosRobo[i].setText("0");
			this.add(qtddPontosRobo[i]);
		}

	}

}
