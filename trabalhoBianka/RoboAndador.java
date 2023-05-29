package trabalhoBianka;

public class RoboAndador extends Robo {
	 //o parametro quantCelulas informa a quantidade de células
	 //que o robo andador vai mover
	
	protected int numCelulas;
	
	/*
	 * public RoboAndador (int id, String nome, int posicaox, int posicaoy, Plano
	 * plano) { super(id, nome, posicaox, posicaoy, plano); // if(numCelulas >=1 &&
	 * numCelulas <=2) { // this.numCelulas = numCelulas; // } this.nome =
	 * "Robo Andador"; }
	 */
	
	public RoboAndador(int id, String nome, int posicaox, int posicaoy, Plano plano) {
		super(id, nome, posicaox, posicaoy, plano);
		this.nome = "A";
	}

	public void avancar(int numCelulas) { 
		posicaoy +=numCelulas;
		this.setPosicaoy(posicaoy);
	}
	
	public void retroceder(int numCelulas) {
		posicaoy -=numCelulas;
		this.setPosicaoy(posicaoy);
	}
}