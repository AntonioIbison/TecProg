import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Janela extends JFrame {
	public JLabel janela;
	public JPanel painelCima;
	public JPanel painelBaixo;
	public JButton botao1;
	public JButton botao2;
	public JButton botao3;
	public JButton botao4;

	public Janela() {
		janela = new JLabel();
		this.setTitle("ola");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// this.setResizable(false);
		this.setSize(600, 600);
		this.setLayout(new BorderLayout(10, 10));

		botao1 = Botoes("Cadastro", "#d9ead3");
		botao2 = Botoes("Listar", "#d9ead3");
		botao3 = Botoes("Atualizar", "#d9ead3");
		botao4 = Botoes("Deletar", "#d9ead3");
		
		painelCima = criarPainel("#c9daf8");
		painelCima.setLayout(new FlowLayout(FlowLayout.CENTER));
		painelCima.setPreferredSize(new Dimension(0, 50));
		this.add(painelCima);
		painelCima.add(botao1);
		painelCima.add(botao2);
		painelCima.add(botao3);
		painelCima.add(botao4);

		painelBaixo = criarPainel("#c9daf8");

		this.add(painelCima, BorderLayout.NORTH);
		this.add(painelBaixo, BorderLayout.CENTER);

		
		//deletar();
		
		this.setVisible(true);
	}

	public JButton Botoes(String msg, String hexadecimal) {
		JButton botao = new JButton();
		botao.setBounds(200, 100, 100, 75);
		botao.setText(msg);
		botao.setBackground(Color.decode(hexadecimal));
		botao.setVisible(true);

		return botao;
	}

	public JPanel criarPainel(String hexadecimal) {
		JPanel p = new JPanel();
		p.setBackground(Color.decode(hexadecimal));
		return p;
	}

	private void deletar() {
		JPanel deletar = new JPanel(new BorderLayout());
		deletar.setBackground(Color.decode("#c9daf8"));

		JLabel labelMatricula = new JLabel("Matrícula:");
		JTextField campoTexto = new JTextField(10);
		JButton botaoExcluir = new JButton("Excluir");

		JPanel painelEsquerda = new JPanel(new BorderLayout());
		painelEsquerda.setBackground(Color.decode("#c9daf8"));
		painelEsquerda.add(labelMatricula, BorderLayout.WEST);

		JPanel painelDireita = new JPanel(new BorderLayout());
		painelDireita.setBackground(Color.decode("#c9daf8"));
		painelDireita.add(campoTexto, BorderLayout.EAST);

		JPanel painelAbaixo = new JPanel(new FlowLayout(FlowLayout.CENTER));
		painelAbaixo.setBackground(Color.decode("#c9daf8"));
		painelAbaixo.add(botaoExcluir);

		deletar.add(painelEsquerda, BorderLayout.WEST);
		deletar.add(painelDireita, BorderLayout.EAST);
		deletar.add(painelAbaixo, BorderLayout.SOUTH);

		painelBaixo.add(deletar);
	}
}