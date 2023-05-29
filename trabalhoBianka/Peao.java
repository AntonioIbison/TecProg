package trabalhoBianka;

public class Peao extends Robo{
	//o peao tem dois movimentos, o de avançar o move pra direita
	//e o de retroceder pra esquerda
	
	public Peao(int id, String nome, int posicaox, int posicaoy, Plano plano) {
		super(id, nome, posicaox, posicaoy, plano);
		this.nome = "P";
	}
	
	public void avancar(int numCelula) {
		posicaox++;
		this.setPosicaox(posicaox);
	}

	public void retroceder(int numCelula) {
		posicaox--;
		this.setPosicaox(posicaox);
	}
}