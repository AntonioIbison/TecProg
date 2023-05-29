package trabalhoBianka;

import java.util.ArrayList;

public class Partida {

	Plano p;
	Aluno a;
	Bug b;
	Robo r;
	protected boolean partida;

	protected ArrayList<Robo> listaDeRobo;

	public Partida(ArrayList<Robo> r, Plano p) {
		listaDeRobo = r;
		this.p = p;
		partida = true;
	}

	public void adicionarRobosDiferentes(ArrayList<Robo> robos) {
		for (Robo robo : robos) {
			boolean roboExistente = false;
			for (Robo r : listaDeRobo) {
				if (robo.equals(r)) {
					roboExistente = true;
				}
			}
			if (!roboExistente) {
				listaDeRobo.add(robo);
			}
		}

	}

	public void gerarTabuleiro(Plano p, ArrayList<Robo> r) {
		int cont = 0;

		for (int i = 1; i <= p.getTamanhoX(); i++) {
			for (int j = 1; j <= p.getTamanhoY(); j++) { // tava 0 e tava dando erro pq p y ia 0 e n entrava no if do
															// plano la ai a celula tava voltando vaziakk
				Celula celula = new Celula(cont, j, i);
				celula = p.retornarCelula(j, i);
				String area = "[ ]";

				for (Robo robo : listaDeRobo) {
					if (robo.getPosicaox() == j && robo.getPosicaoy() == i) {
						area = "[" + robo.getNome() + "]";
					}
				}
				
				if (celula.possuiAluno()) {
					area = "[A]"; // Representação de um aluno
				} else if (celula.possuiBug()) {
					area = "[B]"; // Representação de um bug
				}
				System.out.print(area);
			}
			System.out.println();
			cont++;
		}

	}

	// mecanica de movimentacao dos robos

	public void movimentarRobos(Robo r, int opcao, int numCelulas, Plano p, Aluno a, Bug b) {
		

		if (opcao == 1 && r.verificarLimites() == true) { // avancar
			r.avancar(numCelulas);
		} else if (opcao == 2 && r.verificarLimites() == true) { // retrocede
			r.retroceder(numCelulas);
		} else {
			System.out.println("Opção inválida.");
		}
		Celula celulaAtual = p.retornarCelula(r.getPosicaox(), r.getPosicaoy());

	    if (celulaAtual.possuiAluno()) {
	        r.pegouAluno();
	        //celulaAtual.tiraAluno();
	    }

	    if (celulaAtual.possuiBug()) {
	        r.pegouBug();
	        //celulaAtual.tiraBug();
	    }

		
		gerarTabuleiro(p, listaDeRobo);
	}
}