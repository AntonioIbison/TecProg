package view;

import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Tabuleiro extends JPanel implements ActionListener {

	private JFrame frame;
	public int BugsAchados = 0;
	public int AlunosAchados = 0;
	public int pontuacao = 0;
	private JButton[][] botoesTabuleiro;
	private JButton b;
	private Sorteio s;

	public Tabuleiro(JFrame frame) {
		s = new Sorteio();
		this.frame = frame;
		this.setLayout(new GridLayout(8, 8));
		this.botoesTabuleiro = new JButton[8][8];
		s.sortearPosicoes();
		for (int i = 0; i < 8; i++) {
			for (int j = 0; j < 8; j++) {
				b = botoes();
				this.botoesTabuleiro[i][j] = b;
				this.add(b);
			}
		}

	}

	private JButton botoes() {
		JButton b = new JButton();
		b.setBackground(Color.decode("#2b2d42"));
		b.addActionListener(this);
		return b;
	}

	public int getBugsAchados() {
		return BugsAchados;
	}

	public int getAlunosAchados() {
		return AlunosAchados;
	}

	public int getPontuacao() {
		return pontuacao;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		JButton botaoEscolha = (JButton) e.getSource();

		for (int i = 0; i < 8; i++) {
			for (int j = 0; j < 8; j++) {

				if (botaoEscolha == botoesTabuleiro[i][j]) {
					if (PainelRobos.escolhaRobo != null) {
						botaoEscolha.setIcon(PainelRobos.escolhaRobo.getIcon());

						botaoEscolha.setEnabled(false);
						botaoEscolha.setBackground(Color.decode("#051923"));

						if (s.verificaAluno(i, j)) {
							botaoEscolha.setBackground(Color.decode("#588157"));
							AlunosAchados++;
							pontuacao += 20;
							botaoEscolha.setDisabledIcon(botaoEscolha.getIcon());
							AtualizacoesControle.atualizarQuantidadeAlunos(AlunosAchados);

						} else if (s.verificaBug(i, j)) {
							botaoEscolha.setBackground(Color.decode("#d90429"));
							BugsAchados++;
							pontuacao -= 15;
							botaoEscolha.setDisabledIcon(botaoEscolha.getIcon());
							AtualizacoesControle.atualizarQuantidadeBugs(BugsAchados);

						}
						PainelControle.atualizarPontos(pontuacao);

						PainelRobos.escolhaRobo = null;
					}
				}
			}
		}
	}

}
