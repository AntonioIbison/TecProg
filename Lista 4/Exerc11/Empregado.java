package Exerc11;

class Empregado extends Pessoa {
    protected double salario;

    public Empregado(String nome, String endereco, double salario) {
        super(nome, endereco);
        this.salario = salario;
    }

    public double calcularSalario() {
        return salario;
    }
}