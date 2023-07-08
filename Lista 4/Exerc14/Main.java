package Exerc14;

public class Main {

	public static void main(String[] args) {
		Pessoa einstein = new Pessoa("Albert Einstein", 14, 3, 1879);
        Pessoa newton = new Pessoa("Isaac Newton", 4, 1, 1643);

        int idadeEinstein = einstein.calcularIdade();
        int idadeNewton = newton.calcularIdade();

        System.out.println("Idade de " + einstein.informaNome() + ": " + idadeEinstein + " anos");
        System.out.println("Idade de " + newton.informaNome() + ": " + idadeNewton + " anos");
	}

}
