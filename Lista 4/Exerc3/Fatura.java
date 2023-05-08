package Exerc3;

public class Fatura {
	private int numItem;
	private String descricao;
	private int quantidade;
	private double precoUnitario;

	public Fatura(int numItem, String descricao, int quantidade, double precoUnitario) {
		this.numItem = numItem;
		this.descricao = descricao;
		if (quantidade < 0) {
			this.quantidade = 0;
		} else {
			this.quantidade = quantidade;
		}
		if (precoUnitario < 0.0) {
			this.precoUnitario = 0.0;
		} else {
			this.precoUnitario = precoUnitario;
		}
	}

	public int getNumItem() {
		return numItem;
	}

	public void setNumItem(int numItem) {
		this.numItem = numItem;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
			this.quantidade = quantidade;
	}

	public double getPrecoUnitario() {
		return precoUnitario;
	}

	public void setPrecoUnitario(double precoUnitario) {
			this.precoUnitario = precoUnitario;
	}

	public double getValorFatura() {
		return precoUnitario * quantidade;
	}

	public void ValorDesconto(double porcentagem) {
		double desc = (porcentagem / 100.0) * getValorFatura();
		setPrecoUnitario(precoUnitario - (desc / quantidade));
	}
}
