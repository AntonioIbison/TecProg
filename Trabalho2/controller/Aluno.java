package controller;

import model.AlunoDAO;

public class Aluno {

	
	private String nome;
	private String cpf;
	private String matricula;
	private String vertente;

	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public String getVertente() {
		return vertente;
	}

	public void setVertente(String vertente) {
		this.vertente = vertente;
	}

	public boolean salvar() {
		AlunoDAO alunodao = new AlunoDAO();
		if (alunodao.inserir(this) == 1)
			return true;

		return false;
	}

}
