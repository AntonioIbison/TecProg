package Exerc10;

public class Main {

	public static void main(String[] args) {
Empregado e = new Empregado("Jr", 15, "Rua Santos Dumont, 15", 2, 4000.0, 0.2);
        
        System.out.println("Nome: " + e.getNome());
        System.out.println("Idade: " + e.getIdade());
        System.out.println("Endereço: " + e.getEndereco());
        System.out.println("Código do Setor: " + e.getCodigoSetor());
        System.out.println("Salário Base: R$" + e.getSalarioBase());
        System.out.println("Imposto: " + (e.getImposto() * 100) + "%");
        System.out.println("Salário Líquido: R$" + e.calcularSalario());
	}

}
