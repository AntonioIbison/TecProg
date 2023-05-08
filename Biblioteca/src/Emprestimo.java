
public class Emprestimo {

	private Cliente cliente;
	private Publicacao publicacao;
	
	public Emprestimo(Cliente cliente, Publicacao publicacao) {
		this.cliente = cliente;
		this.publicacao = publicacao;
	}

	public String retornarDadosEmprestimo() {

		String saida = "";
		saida = this.cliente.tipo + ":" + this.cliente.nome + " - " + publicacao.tipo + ": " + this.publicacao.titulo
				+ " - Dias de emprestimo:" + cliente.verificarDias() + " - tps: " + cliente.verificaTps();
		return saida;
	}
	
	
}
