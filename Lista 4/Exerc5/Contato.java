package Exerc5;

import java.util.List;

public class Contato {

	private int codigo;
	private String nome;
	private String endereco;
	private String email;
	private String telefone;
	private String observacao;

	public Contato(int codigo) {
		this.codigo = codigo;
	}

	public Contato(int codigo, String nome) {
		this.codigo = codigo;
		this.nome = nome;
	}

	public Contato(int codigo, String nome, String email) {
		this.codigo = codigo;
		this.nome = nome;
		this.email = email;
	}

	public Contato(String telefone) {
		this.telefone = telefone;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getObservacao() {
		return observacao;
	}

	public void setObservacao(String observacao) {
		this.observacao = observacao;
	}

	public String getEmail() {
		return email;
	}

	public boolean taPreenchido() {
		return (codigo != 0 && nome != null && endereco != null && email != null && telefone != null
				&& observacao != null);
	}

	public void impressaoCtt(List<Contato> contatos) {
		for (Contato c : contatos) {
			System.out.println("codigo: " + c.getCodigo());
			System.out.println("nome: " + c.getNome());
			System.out.println("endereco: " + c.getEndereco());
			System.out.println("email: " + c.getEmail());
			System.out.println("telefone: " + c.getTelefone());
			System.out.println("obs: " + c.getObservacao());
		}
	}

	public int validarCodigo(int codigo) {
		if (codigo >= 1000 && codigo <= 9999) {
			return codigo;
		} else {
			System.out.println("Código inválido. O código deve ser maior ou igual a 1000 e menor ou igual a 9999.");
			return 0;
		}
	}

	public String validarTelefone(String telefone) {
		if (telefone.length() == 8) {
			return telefone;
		} else {
			System.out.println("Telefone inválido. O telefone deve conter 8 dígitos.");
			return "";
		}
	}

	public Contato duplicarContato() {
		Contato duplica = new Contato(this.codigo, this.nome, this.email);
		duplica.setEndereco(this.endereco);
		duplica.setTelefone(this.telefone);
		duplica.setObservacao(this.observacao);
		return duplica;
	}

}
