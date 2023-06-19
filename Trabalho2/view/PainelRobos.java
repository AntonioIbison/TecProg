package view;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPanel;

public class PainelRobos extends JPanel implements ActionListener{

	private JButton robo1;
	private JButton robo2;
	private JButton robo3;
	private ImageIcon icon1;
	private ImageIcon icon2;
	private ImageIcon icon3;
	
	
	public PainelRobos() {
		this.setLayout(new FlowLayout());
		this.setBackground(Color.decode("#fed9b7"));

		robo1 = new JButton();
		robo2 = new JButton();
		robo3 = new JButton();

		icon1 = new ImageIcon(getClass().getResource("/icons/robo1.png"));
		icon2 = new ImageIcon(getClass().getResource("/icons/robo2.png"));
		icon3 = new ImageIcon(getClass().getResource("/icons/robo3.png"));

		robo1.setIcon(icon1);
		robo2.setIcon(icon2);
		robo3.setIcon(icon3);

		robo1.setPreferredSize(new Dimension(60, 60));
		robo2.setPreferredSize(new Dimension(60, 60));
		robo3.setPreferredSize(new Dimension(60, 60));

		this.add(robo1);
		this.add(robo2);
		this.add(robo3);
	}


	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}

}
