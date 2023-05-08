import java.util.ArrayList;

public class Biblioteca {

	private ArrayList<Emprestimo> listaEmprestimo;
	private ArrayList<Cliente> listaCliente;
	private ArrayList<Publicacao> listaPub;
	private ArrayList<Publicacao> Doação;

	public Biblioteca() {
		listaEmprestimo = new ArrayList<Emprestimo>();
		listaCliente = new ArrayList<Cliente>();
		listaPub = new ArrayList<Publicacao>();
		Doação = new ArrayList<Publicacao>();
	}

	public void addEmprestimo(Emprestimo e) {
		listaEmprestimo.add(e);
	}

	public void addCliente(Cliente c) {
		listaCliente.add(c);
	}

	public void addPub(Publicacao p) {
		listaPub.add(p);
	}

	public void addDoacoes(Publicacao d) {
		Doação.add(d);
	}

	public ArrayList<Emprestimo> getListaEmprestimo() {
		return listaEmprestimo;
	}

	public ArrayList<Cliente> getListaClientes() {
		return listaCliente;

	}

	public ArrayList<Publicacao> getPublicacoes() {
		return listaPub;

	}

	public ArrayList<Publicacao> getDoaçoes() {
		return Doação;

	}

}