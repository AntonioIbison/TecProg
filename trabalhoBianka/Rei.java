package trabalhoBianka;

public class Rei extends Robo{
	
	Plano p;
	
	public Rei(int id, String nome, int posicaox, int posicaoy, Plano plano) {
		super(id, nome, posicaoy, posicaoy, plano);
		this.nome = "K";
		p=plano;
	}
	
	public void avancar(int novaAndada) {
		if (novaAndada >= 0 && novaAndada <= 4) {
			if (posicaox + novaAndada <= p.tamanhoX && posicaoy + novaAndada <= p.tamanhoY) {
				posicaox += novaAndada;
				posicaoy += novaAndada;
			} else {
				System.out.println("Movimento inválido. O Rei só pode se mover até duas células nas diagonais.");
			}
		} else {
			System.out.println(
					"Valor inválido para novaAndada. O Rei só pode se mover até duas células nas diagonais.");
		}
	}

	public void retroceder(int novaAndada) {
		if (novaAndada >= 0 && novaAndada <= 4) {
			if (posicaox - novaAndada >= 1 && posicaoy - novaAndada >= 1) {
				posicaox -= novaAndada;
				posicaoy -= novaAndada;
			} else {
				System.out.println("Movimento inválido. O Rei só pode retroceder até duas células nas diagonais.");
			}
		} else {
			System.out.println(
					"Valor inválido para novaAndada. O Rei só pode retroceder até duas células nas diagonais.");
		}

	}
}