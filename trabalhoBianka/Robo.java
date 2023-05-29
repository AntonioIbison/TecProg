package trabalhoBianka;

public class Robo {

	// todos os robos comecam na posicao X = 1 e Y = 1

	protected String nome;
	protected int posicaox = 1;
	protected int posicaoy = 1;
	protected int id;
	protected int pontos;
	Plano plano;

	public Robo(int id, String nome, int posicaox, int posicaoy, Plano plano) {
		this.id = id;
		this.nome = nome;
		this.posicaox = posicaox;
		this.posicaoy = posicaoy;
		this.plano = plano;
		pontos=0;

		Celula aux = null;
		for (int i = 0; i < plano.listaDeCelulas.size(); i++) {
			aux = plano.listaDeCelulas.get(i);
			if (aux.posicaoX == posicaox && aux.posicaoY == posicaoy) {
				aux.robo = this;
			}
		}
	}
	
	public boolean verificarLimites() {
	    int tamanhox = plano.getTamanhoX();
	    int tamanhoy = plano.getTamanhoY();


	    // Verificar se a posição atual do robô está dentro dos limites do plano
	    if (posicaox >= 0 && posicaox < tamanhox && posicaoy >= 0 && posicaoy < tamanhoy) {
	        return true; // Posição válida
	    } else {
	        return false; // Posição inválida
	    }
	}

	
	public String getNome() {
		return nome;
	}
	
	public void setPosicaox(int posicaox) {
		this.posicaox = posicaox;
	}

	public void setPosicaoy(int posicaoy) {
		this.posicaoy = posicaoy;
	}

	public int getPosicaox() {
		return posicaox;
	}

	public int getPosicaoy() {
		return posicaoy;
	}

	public void avancar(int numCelulas) {
		posicaox++;
	}

	public void retroceder(int numCelulas) {
		posicaox++;
	}
	public void pegouAluno() {
		pontos += 10;
	}

	public void pegouBug() {
		pontos -= 15;
	}

	public int getPontos() {
		return pontos;
	}
	
	
}