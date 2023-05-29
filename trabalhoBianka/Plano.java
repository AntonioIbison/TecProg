package trabalhoBianka;

import java.util.ArrayList;

public class Plano {

	protected int tamanhoX;
	protected int tamanhoY;
	public ArrayList<Celula> listaDeCelulas;

	public Plano(int tamanhoX, int tamanhoY) {
		this.tamanhoX = tamanhoX;
		this.tamanhoY = tamanhoY;
		listaDeCelulas = new ArrayList<Celula>();

		int contador = 1;
		for (int i = 0; i <= tamanhoX; i++) {
			for (int j = 0; j <= tamanhoY; j++) {
				Celula celula = new Celula(contador, i, j);
				listaDeCelulas.add(celula);
				contador++;
			}
		}
	}

	public void verificarSeTemRobo() {
		for (int i = 0; i < listaDeCelulas.size(); i++) {
			Celula aux = listaDeCelulas.get(i);
			if (listaDeCelulas.get(i).robo != null) {
				System.out.println("tem robo" + aux.robo.nome + "  - x: " + aux.posicaoX + "  - y: " + aux.posicaoY);
			}
		}
	}

	public Celula retornarCelula(int x, int y) {

		for (int i = 0; i < listaDeCelulas.size(); i++) {
			if (listaDeCelulas.get(i).posicaoX == x && listaDeCelulas.get(i).posicaoY == y) {
				return listaDeCelulas.get(i);
			}
		}
		return null;
	}

	public void retornarCelulas() {
		for (int i = 0; i < listaDeCelulas.size(); i++) {
			System.out.println(listaDeCelulas.get(i).imprimir());
		}
	}

	public int getTamanhoX() {
		return tamanhoX;
	}

	public int getTamanhoY() {
		return tamanhoY;
	}

//	public boolean verificarMovimentoValido(int xMovimento, int yMovimento) {
//        int novoX = xRobo + xMovimento;
//        int novoY = yRobo + yMovimento;
//
//        return novoX >= 0 && novoX < tamanho && novoY >= 0 && novoY < tamanho;
//    }
}