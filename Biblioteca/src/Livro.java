
public class Livro extends Publicacao {

	public Livro(String titulo, int ano, String autor, int quantidadeDisponivel) {
		super(titulo, ano, autor, quantidadeDisponivel);
		this.tipo = "Livro";
	}

	@Override
	protected void QuantidadeDisponivel(int quantidade) {
		// TODO Auto-generated method stub
		
	}
	
	
}