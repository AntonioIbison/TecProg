
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MostrarDeletar implements ActionListener {

	private JanelaPrincipal frame;

	public MostrarDeletar(JanelaPrincipal frame) {

		this.frame = frame;
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		frame.painelDeletar.setVisible(true);
		frame.painelCadastrar.setVisible(false);
		frame.painelAtualizar.setVisible(false);
		frame.painelListar.setVisible(false);

	}

}
