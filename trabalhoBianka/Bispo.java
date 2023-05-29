package trabalhoBianka;

public class Bispo extends Robo {
	// bispo se movimenta pela diagonal ate 2 celulas por rodada.

	Plano p;

	public Bispo(int id, String nome, int posicaox, int posicaoy, Plano plano) {
		super(id, nome, posicaox, posicaoy, plano);
		this.nome = "B";
		p = plano;
	}

	public void avancar(int novaAndada) {
		if (novaAndada >= 0 && novaAndada <= 2) {
			if (posicaox + novaAndada <= p.tamanhoX && posicaoy + novaAndada <= p.tamanhoY) {
				posicaox += novaAndada;
				posicaoy += novaAndada;
			} else {
				System.out.println("Movimento inválido. O Bispo só pode se mover até duas células nas diagonais.");
			}
		} else {
			System.out.println(
					"Valor inválido para novaAndada. O Bispo só pode se mover até duas células nas diagonais.");
		}
	}

	public void retroceder(int novaAndada) {
		if (novaAndada >= 0 && novaAndada <= 2) {
			if (posicaox - novaAndada >= 1 && posicaoy - novaAndada >= 1) {
				posicaox -= novaAndada;
				posicaoy -= novaAndada;
			} else {
				System.out.println("Movimento inválido. O Bispo só pode retroceder até duas células nas diagonais.");
			}
		} else {
			System.out.println(
					"Valor inválido para novaAndada. O Bispo só pode retroceder até duas células nas diagonais.");
		}

	}

//	public void moverDiagonal(int novox, int novoy) {
//        if (novox >= 0 && novox <= p.tamanhoX  && novoy >= 0 && novoy <= p.tamanhoY) {
//            int diferencaX = Math.abs(novox - posicaox);
//            int diferencaY = Math.abs(novoy - posicaoy);
//            
//            if ((diferencaX == diferencaY && diferencaX <= 2 && diferencaY <= 2) || (diferencaX == -diferencaY && diferencaX <= 2 && diferencaY <= 2)) {
//                posicaox = novox;
//                posicaoy = novoy;
//            } else {
//                System.out.println("Movimento inválido. O bispo só pode se mover até duas células nas diagonais.");
//            }
//        } else {
//            System.out.println("Posição inválida. As dimensões do plano são X= "+ p.tamanhoX+ "e Y= "+ p.tamanhoY);
//        }
//    }

}