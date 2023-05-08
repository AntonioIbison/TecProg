
public class Aluno extends Cliente {

	public Aluno(int matricula, String nome) {
		super(matricula, nome);
		this.tipo = "Aluno";
	}

	public int verificarDias() {
		return 10;
	}

	public void descontoLivro(Publicacao pub) {
		tps -= (tps * 10) / 100;
	}

	public void descontoRevista(Publicacao pub) {
		tps -= (tps * 1) / 100;
	}

	public void descontoArtigo(Publicacao pub) {
		tps -= (tps * 50) / 100;

	}

	@Override
	public int limiteEmprestimos() {
		return 5;
	}
}
