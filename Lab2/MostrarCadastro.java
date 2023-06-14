
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;

public class MostrarCadastro implements ActionListener{

	private JanelaPrincipal frame;
	public MostrarCadastro(JanelaPrincipal frame) {
		
		this.frame = frame;
	}
	@Override
	public void actionPerformed(ActionEvent arg0) {
		
		frame.painelCadastrar.setVisible(true);
		frame.painelAtualizar.setVisible(false);
		frame.painelListar.setVisible(false);
		frame.painelDeletar.setVisible(false);
	}

}
