package Exerc15;

public class Produto {
	private double precoCusto, precoVenda, despesasEmpresa;

	public Produto(double precoCusto, double precoVenda, double despesasEmpresa) {
		this.precoCusto = precoCusto;
		this.precoVenda = precoVenda;
		this.despesasEmpresa = despesasEmpresa;
	}

	public double calcularMargemLucro() {
		return ((precoVenda - (precoCusto + despesasEmpresa)) / precoVenda) * 100;
	}
}
