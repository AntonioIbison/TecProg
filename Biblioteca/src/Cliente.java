public abstract class Cliente implements ValidacaoEmprestimo {

	protected int matricula;
	protected String nome;
	protected float tps;
	protected String tipo;
	protected int qtddEmprestimos = 0;

	public Cliente(int matricula, String nome) {
		super();
		this.matricula = matricula;
		this.nome = nome;
		this.tps = 0;
	}

	public void Emprestimos() {
		if (qtddEmprestimos < limiteEmprestimos()) {
			qtddEmprestimos++;
		} else {
			System.out.println(nome + " atingiu seu limite de empréstimos.");
		}
	}

	public float verificaTps() {
		return tps;
	}

	public void addTps(int qtdd) {
		tps += qtdd;
	}
	

	public void qtddTps() {
		System.out.println("Empregado: " + nome + ", Tps: " + tps);
	}

	public void doar(Biblioteca b, Publicacao d) {
		float multiplos = tps / 50;
		tps %= 50;
		for (int i = 0; i < multiplos; i++) {
			b.addDoacoes(d);
		}

	}

	public void descontoLivro(Publicacao pub) {
	}

	public void descontoRevista(Publicacao pub) {
	}

	public void descontoArtigo(Publicacao pub) {

	}

}
