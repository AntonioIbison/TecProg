package Exerc12;

public class Vendedor extends Empregado {
	  private double valorVendas;
	    private double comissao;

	    public Vendedor(String nome, String endereco, double salario, double valorVendas, double comissao) {
	        super(nome, endereco, salario);
	        this.valorVendas = valorVendas;
	        this.comissao = comissao;
	    }

	    @Override
	    public double calcularSalario() {
	        return super.calcularSalario() + (valorVendas * comissao / 100);
	    }
}
