package Exerc5;

import java.util.ArrayList;
import java.util.List;

public class Agenda {
	private String nomeAgenda;
	private String descricao;
	private List<Contato> contatos;

	public Agenda(String nomeAgenda, String descricao) {
		this.nomeAgenda = nomeAgenda;
		this.descricao = descricao;
		this.contatos = new ArrayList<>();
	}

	public void adicionarContato(Contato contato) {
		contatos.add(contato);
	}

	public void imprimirContatos() {
		for (Contato Contato : contatos) {
			Contato.impressaoCtt(contatos);
			System.out.println("-----------------------");
		}

	}
}