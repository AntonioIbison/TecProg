package Exerc11;

class Operario extends Empregado {
	private double valorProducao;
	private double comissao;

	public Operario(String nome, String endereco, double salario, double valorProducao, double comissao) {
		super(nome, endereco, salario);
		this.valorProducao = valorProducao;
		this.comissao = comissao;
	}
	 @Override
	    public double calcularSalario() {
	        double salarioBase = super.calcularSalario();
	        double salarioOperario = salarioBase + (valorProducao * comissao / 100);
	        return salarioOperario;
	    }
}
