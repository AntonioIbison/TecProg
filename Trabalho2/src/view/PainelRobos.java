package view;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPanel;

public class PainelRobos extends JPanel implements ActionListener {

	public static JButton escolhaRobo;

	private JButton[] robos;
	private ImageIcon[] icons;

	public PainelRobos() {
		this.setLayout(new FlowLayout());
		this.setBackground(Color.decode("#fed9b7"));

		robos = new JButton[3];
		icons = new ImageIcon[3];

		icons[0] = new ImageIcon(getClass().getResource("/icons/robo1.png"));
		icons[1] = new ImageIcon(getClass().getResource("/icons/robo2.png"));
		icons[2] = new ImageIcon(getClass().getResource("/icons/robo3.png"));

		for (int i = 0; i < 3; i++) {
			robos[i] = new JButton();
			robos[i].setIcon(icons[i]);
			robos[i].addActionListener(this);
			robos[i].setPreferredSize(new Dimension(60, 60));
			this.add(robos[i]);
		}

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		for (int i = 0; i < robos.length; i++) {
			if (e.getSource() == robos[i]) {
				escolhaRobo = robos[i];
			}
		}
	}
}
