import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class PainelDeletar extends JPanel {

	public PainelDeletar() {
		criarDel();
		this.setBackground(Color.CYAN);
	}

	private void criarDel() {
		JLabel matricula = new JLabel("Matricula");
		JTextField caixamatricula = new JTextField(6);

		Botao b = new Botao("Deletar", Color.GREEN);

		this.setLayout(new GridLayout(2, 2));

		this.add(matricula);
		this.add(caixamatricula);
		this.add(b);

	}

}
