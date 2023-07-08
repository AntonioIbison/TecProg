package Exerc13;

public class ControleRemoto {
	private boolean ligado;
	private int volume;
	private int canal;

	public ControleRemoto() {
		ligado = false;
		volume = 35;
		canal = 10;
	}

	public void liga() {
		ligado = true;
		System.out.println("TV ligou");
	}

	public void desliga() {
		ligado = false;
		System.out.println("TV desligou");
	}

	public void aumentandoVolume() {
		if (ligado && volume < 100) {
			volume++;
			System.out.println("Volume aumentado: " + volume);
		} else {
			System.out.println("A TV ta desligada");
		}
	}

	public void diminuirVolume() {
		if (ligado && volume > 0) {
			volume--;
			System.out.println("Volume diminuído: " + volume);
		} else {
			System.out.println("TV desligada ou volume no mínimo");
		}
	}

	public void aumentaCanal() {
		if (ligado) {
			canal++;
			System.out.println("Canal aumentado: " + canal);
		} else {
			System.out.println("A TV está desligada");
		}
	}

	public void diminuiCanal() {
		if (ligado && canal > 1) {
			canal--;
			System.out.println("Canal diminuído: " + canal);
		} else {
			System.out.println("A TV está desligada ou o canal já está no mínimo");
		}
	}

	public void trocaCanal(int novoCanal) {
		if (ligado) {
			canal = novoCanal;
			System.out.println("Canal trocado para: " + canal);
		} else {
			System.out.println("A TV está desligada");
		}
	}

	public void relatorio() {
		System.out.println("Como ta a tv:");
		System.out.println("Ligado: " + ligado);
		System.out.println("Volume: " + volume);
		System.out.println("Canal: " + canal);
	}

	public void mudo() {
		if (ligado) {
			volume = 0;
			System.out.println("ta mudo");
		} else {
			System.out.println("A TV está desligada");
		}
	}
}
