package trabalhoBianka;

public class Torre extends Robo{
	
	//a torre pode mover ate duas celulas por rodada,
	//entao o construtor vai pedir o numero de celulas (entre 1 e 2) e fazer a verificação
	//para passar aos metodos seguintes

	protected int numCelulas;
	
	public Torre(int id, String nome, int posicaox, int posicaoy, Plano plano) { 
		super(id, nome, 1, 1, plano);
//		if(numCelulas >=1 && numCelulas <=2) {
//			this.numCelulas = numCelulas;
//		}
		this.nome = "T";
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