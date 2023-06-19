package controller;

import java.util.ArrayList;

public class Alunos {

	private ArrayList<Aluno> alunos;

	public Alunos() {
		alunos = new ArrayList<Aluno>();
	}
	
	public void addAluno(Aluno a) {
		alunos.add(a);
	}
	public void imprimir() {
		for (Aluno aluno : alunos) {
			System.out.println("CPF"+ aluno.getCpf() + " nome: "+ aluno.getNome() + " matricula: "+ aluno.getMatricula() + " vertente: "+ aluno.getVertente());

		}
	}

}
