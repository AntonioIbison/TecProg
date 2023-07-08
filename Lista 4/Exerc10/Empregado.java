package Exerc10;

public class Empregado extends Pessoa{
	 private int codSetor;
	    private double sBase;
	    private double imposto;

	    public Empregado(String nome, int idade, String endereco, int codigoSetor, double salarioBase, double imposto) {
	        super(nome, idade, endereco);
	        this.codSetor = codigoSetor;
	        this.sBase = salarioBase;
	        this.imposto = imposto;
	    }

	    public int getCodigoSetor() {
	        return codSetor;
	    }

	    public void setCodigoSetor(int codigoSetor) {
	        this.codSetor = codigoSetor;
	    }

	    public double getSalarioBase() {
	        return sBase;
	    }

	    public void setSalarioBase(double salarioBase) {
	        this.sBase = salarioBase;
	    }

	    public double getImposto() {
	        return imposto;
	    }

	    public void setImposto(double imposto) {
	        this.imposto = imposto;
	    }

	    public double calcularSalario() {
	        double salarioLiquido = sBase - (sBase * imposto);
	        return salarioLiquido;
	    }
}
