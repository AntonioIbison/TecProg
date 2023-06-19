package view;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

public class EscolhaSuperior implements ActionListener{

	private JanelaPrincipal frame;
	public EscolhaSuperior(JanelaPrincipal frame) {
		
		this.frame = frame;
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() instanceof JButton) {
			JButton button = (JButton) e.getSource();
			if (button.getText().equals("Jogar")) {
				frame.mapa.setVisible(true);
				frame.pc.setVisible(true);
				frame.relatorios.setVisible(false);
			} else if (button.getText().equals("Relatorios")) {
				frame.mapa.setVisible(false);
				frame.pc.setVisible(false);
				frame.relatorios.setVisible(true);
			}
	}

}
}