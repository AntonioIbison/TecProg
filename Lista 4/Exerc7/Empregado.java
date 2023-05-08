package Exerc7;

public class Empregado {
	public String nome;
	protected float salario;
	
	public Empregado(String nome, float salario) {
		this.nome = nome;
		this.salario = salario;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public float getSalario() {
		return salario;
	}
	
	public String toString() {
		return "nome: " + nome + " e salario: " + salario;
	}
}
