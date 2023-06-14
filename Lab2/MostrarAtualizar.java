
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MostrarAtualizar implements ActionListener {

	private JanelaPrincipal frame;

	public MostrarAtualizar(JanelaPrincipal frame) {

		this.frame = frame;
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {

		frame.painelAtualizar.setVisible(true);
		frame.painelCadastrar.setVisible(false);
		frame.painelListar.setVisible(false);
		frame.painelDeletar.setVisible(false);
	}

}
