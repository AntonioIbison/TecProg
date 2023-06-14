
import java.awt.Color;
import java.awt.GridBagLayout;
import java.awt.GridLayout;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class PainelCadastrar extends JPanel {

	public PainelCadastrar() {
	  criarFormularioCadastro();
	  this.setBackground(Color.LIGHT_GRAY);
	}

	private void criarFormularioCadastro() {
		JLabel label  = new JLabel("Nome");
		JTextField caixaNome= new JTextField(6);
		
		JLabel cpf  = new JLabel("CPF");
		JTextField caixaCPF= new JTextField(6);
		
		JLabel matricula  = new JLabel("Matricula");
		JTextField caixamatricula= new JTextField(6);
		
		JLabel vertente  = new JLabel("Vertente");
		JTextField caixaVertente= new JTextField(6);
		
		Botao b= new Botao("Cadastrar", Color.GREEN);
		
		this.setLayout(new GridLayout(5,2));
		
		this.add(label);
		this.add(caixaNome);
		this.add(cpf);
		this.add(caixaCPF);
		this.add(matricula);
		this.add(caixamatricula);
		this.add(vertente);
		this.add(caixaVertente);
		this.add(b);
		
		
		
		
	}
}
