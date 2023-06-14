
import java.awt.Color;

import javax.swing.JPanel;

public class PainelBotoes  extends JPanel{

	JanelaPrincipal janela; 
	
	public PainelBotoes(JanelaPrincipal janela) {
		this.janela = janela;
		criarBotoes();
		this.setBackground(Color.ORANGE);
	}

	private void criarBotoes() {
		Botao cadastrar = new Botao("Cadastrar", Color.black);
		cadastrar.addActionListener(new MostrarCadastro(janela));
	
		Botao listar = new Botao("Listar", Color.gray);
		listar.addActionListener(new MostrarListar(janela));
		
		Botao atualizar = new Botao("Atualizar", Color.cyan);
		atualizar.addActionListener(new MostrarAtualizar(janela));
		
		Botao deletar = new Botao("Deletar", Color.red);
		deletar.addActionListener(new MostrarDeletar(janela));
		
		this.add(cadastrar);
		this.add(listar);
		this.add(atualizar);
		this.add(deletar);
		
	}
}
