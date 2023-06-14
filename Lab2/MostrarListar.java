
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MostrarListar implements ActionListener {

	private JanelaPrincipal frame;

	public MostrarListar(JanelaPrincipal frame) {

		this.frame = frame;
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		frame.painelListar.setVisible(true);
		frame.painelCadastrar.setVisible(false);
		frame.painelAtualizar.setVisible(false);
		frame.painelDeletar.setVisible(false);
	}

}
