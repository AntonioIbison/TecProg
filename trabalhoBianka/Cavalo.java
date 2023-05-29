package trabalhoBianka;

public class Cavalo extends Robo {

	Plano p;

	public Cavalo(int id, String nome, int posicaox, int posicaoy, Plano plano) {
		super(id, nome, posicaox, posicaoy, plano);
		this.nome = "C";
		p=plano;
	}

	public void avancar(int novaAndada) {
		if (novaAndada >= 0 && novaAndada <= 2) {
			if (posicaox + novaAndada <= p.tamanhoX && posicaoy + novaAndada <= p.tamanhoY) {
				posicaox += novaAndada;
				posicaoy += novaAndada;
			} else {
				System.out.println("Movimento inválido. O Cavalo só pode se mover até duas células nas diagonais.");
			}
		} else {
			System.out.println(
					"Valor inválido para novaAndada. O Cavalo só pode se mover até duas células nas diagonais.");
		}
	}

	public void retroceder(int novaAndada) {
		if (novaAndada >= 0 && novaAndada <= 2) {
			if (posicaox - novaAndada >= 1 && posicaoy - novaAndada >= 1) {
				posicaox -= novaAndada;
				posicaoy -= novaAndada;
			} else {
				System.out.println("Movimento inválido. O Cavalo só pode retroceder até duas células nas diagonais.");
			}
		} else {
			System.out.println(
					"Valor inválido para novaAndada. O Cavalo só pode retroceder até duas células nas diagonais.");
		}

	}
}