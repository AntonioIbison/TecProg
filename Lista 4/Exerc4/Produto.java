package Exerc4;

public class Produto {
	private String nome;
	private double preco;
	private int quantidade;
	
	public Produto(String nome, double preco, int quantidade) {
		this.nome = nome;
		this.preco = preco;
		this.quantidade = quantidade;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}
	
	public void comprarProduto() {
		double desc=0.0;
		double valor=quantidade*preco;
		if(preco>=500.0) {
			desc=0.25;
		}else if(preco>=200.0 && preco<500.0){
			desc=0.2;
		}else if(preco>=100.0 && preco<200.0){
			desc=0.1;
		}
		double totalDesc=valor*(1-desc);
		System.out.println("Item: " + getNome());
		System.out.println("Valor total a ser pago: " + totalDesc);
		
	}
	
	
	
}
