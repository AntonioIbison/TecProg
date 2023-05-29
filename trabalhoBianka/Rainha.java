package trabalhoBianka;

public class Rainha extends Robo{
	
	Plano p;
	
	public Rainha(int id, String nome, int posicaox, int posicaoy, Plano plano) {
		super(id, nome, posicaox, posicaoy, plano);
		this.nome = "Q";
		p=plano;
	}
	
	public void avancar(int novaAndada) {
		if (novaAndada >= 0 && novaAndada <= 4) {
			if (posicaox + novaAndada <= p.tamanhoX && posicaoy + novaAndada <= p.tamanhoY) {
				posicaox += novaAndada;
				posicaoy += novaAndada;
			} else {
				System.out.println("Movimento inválido. A Rainha só pode se mover até duas células nas diagonais.");
			}
		} else {
			System.out.println(
					"Valor inválido para novaAndada. A Rainha só pode se mover até duas células nas diagonais.");
		}
	}

	public void retroceder(int novaAndada) {
		if (novaAndada >= 0 && novaAndada <= 4) {
			if (posicaox - novaAndada >= 1 && posicaoy - novaAndada >= 1) {
				posicaox -= novaAndada;
				posicaoy -= novaAndada;
			} else {
				System.out.println("Movimento inválido. A Rainha só pode retroceder até duas células nas diagonais.");
			}
		} else {
			System.out.println(
					"Valor inválido para novaAndada. A Rainha só pode retroceder até duas células nas diagonais.");
		}

	}
}