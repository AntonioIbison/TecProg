import java.util.ArrayList;

public class IniciarBiblioteca {

	public static void main(String[] args) {
		// Clientes da Biblioteca TecProg
		Cliente aluno = new Aluno(30305, "Joao");
		Cliente aluno2 = new Aluno(2552, "Marcos");

		Cliente professor = new Professor(2525, "Mateus");
		Cliente professor2 = new Professor(565, "jonas");

		Cliente servidor = new Servidor(898, "Michelle");
		Cliente servidor2 = new Servidor(982, "Thales");

		// Publicacoes da Biblioteca TecProg
		Publicacao livro = new Livro("Java como programa", 2020, "Deitel", 10);
		Publicacao livro2 = new Livro("Python como programa", 2019, "Oliveira", 10);
		
		livro.QuantidadeDisponivel(30);
		livro2.QuantidadeDisponivel(25);
		
		System.out.println("Informaçoes dos livros da biblioteca: ");
		System.out.println("Nome: " + livro.getTitulo() + ", ano: " + livro.getAno() + ", autor: " + livro.getAutor() + ", Quantidade:" + livro.quantidadeDisponivel);
		System.out.println("Nome: " + livro2.getTitulo() + ", ano: " + livro2.getAno() + ", autor: " + livro2.getAutor() + ", Quantidade:" + livro.quantidadeDisponivel);
		
		System.out.println("Nome: " + livro.getTitulo() + ", ano: " + livro.getAno() + ", autor: " + livro.getAutor() + ", Quantidade:" + livro.quantidadeDisponivel);

		System.out.println();
		
		Publicacao revista = new Revista("INDICO: inclusao digital necessaria para sociedade atual", 2023,
				"Geovana e Cauã", 8);
		Publicacao revista2 = new Revista("inteligencia artificial aplicada", 2023, "Amora", 10);

		System.out.println("Informaçoes das revistas da biblioteca: ");
		System.out.println("Nome: " + revista.getTitulo() + ", ano: " + revista.getAno() + ", autor: " + revista.getAutor() + ", Quantidade:" + revista.quantidadeDisponivel);
		System.out.println("Nome: " + revista2.getTitulo() + ", ano: " + revista2.getAno() + ", autor: " + revista2.getAutor() + ", Quantidade:" + revista2.quantidadeDisponivel);
		
		System.out.println();
		
		Publicacao artigo = new Artigo("Um comparativo de desempenho entre Java e Python", 2021, "Silva", 4);
		Publicacao artigo2 = new Artigo("Um comparativo entre o Eclipse e VsCode", 2023, "Cordeiro", 5);

		System.out.println("Informaçoes dos artigo da biblioteca: ");
		System.out.println("Nome: " + artigo.getTitulo() + ", ano: " + artigo.getAno() + ", autor: " + artigo.getAutor() + ", Quantidade:" + artigo.quantidadeDisponivel);
		System.out.println("Nome: " + artigo2.getTitulo() + ", ano: " + artigo2.getAno() + ", autor: " + artigo2.getAutor() + ", Quantidade:" + artigo2.quantidadeDisponivel);
		
		System.out.println();
		
		Biblioteca bib = new Biblioteca();
		Emprestimo e1 = new Emprestimo(aluno, artigo);
		Emprestimo e2 = new Emprestimo(professor, livro2);
		Emprestimo e3 = new Emprestimo(servidor, revista2);
		Emprestimo e4 = new Emprestimo(aluno2, artigo2);
		Emprestimo e5 = new Emprestimo(professor2, livro);
		Emprestimo e6 = new Emprestimo(servidor2, revista);

		
		System.out.println("Moedas adicionadas: ");
		aluno.addTps(40);
		aluno2.addTps(25);
		professor.addTps(15);
		professor2.addTps(45);
		servidor.addTps(30);
		servidor2.addTps(20);
		
		System.out.println(aluno.verificaTps());
		System.out.println(aluno2.verificaTps());
		System.out.println(professor.verificaTps());
		System.out.println(professor2.verificaTps());
		System.out.println(servidor.verificaTps());
		System.out.println(servidor2.verificaTps());
		
		System.out.println();
		
		aluno.descontoLivro(livro);
		aluno2.descontoArtigo(artigo);
		aluno.descontoRevista(revista);
		aluno2.descontoLivro(livro2);
		aluno.descontoArtigo(artigo2);
		aluno2.descontoRevista(revista2);
		
		//add cliente
		bib.addCliente(aluno);
		bib.addCliente(aluno2);
		bib.addCliente(professor);
		bib.addCliente(professor2);
		bib.addCliente(servidor);
		bib.addCliente(servidor2);
		
		//doando
		aluno.doar(bib, revista);
		aluno2.doar(bib, artigo2);
		professor.doar(bib, livro);
		servidor.doar(bib, artigo);
		
		//add publicações
		bib.addPub(livro);
		bib.addPub(livro2);
		bib.addPub(artigo);
		bib.addPub(artigo2);
		bib.addPub(revista);
		bib.addPub(revista2);
		
		System.out.println("Emprestimos: ");
		
		bib.addEmprestimo(e1);
		System.out.println(e1.retornarDadosEmprestimo());
		bib.addEmprestimo(e2);
		System.out.println(e2.retornarDadosEmprestimo());
		bib.addEmprestimo(e3);
		System.out.println(e3.retornarDadosEmprestimo());
		bib.addEmprestimo(e4);
		System.out.println(e4.retornarDadosEmprestimo());
		bib.addEmprestimo(e5);
		System.out.println(e5.retornarDadosEmprestimo());
		bib.addEmprestimo(e6);
		System.out.println(e6.retornarDadosEmprestimo());

		System.out.println();
		
		System.out.println("Lista de clientes cadastrados: ");
		ArrayList<Cliente> c = bib.getListaClientes();
		for (Cliente cliente : c) {
			System.out.println(cliente.nome);
		}
		
		System.out.println();
		
		System.out.println("Lista de publicações cadastradas: ");
		ArrayList<Publicacao> p = bib.getPublicacoes();
		for (Publicacao publicacao : p) {
			System.out.println(publicacao.titulo);
		}
		
		System.out.println("Lista de doações:");
        ArrayList<Publicacao> doacoes = bib.getDoaçoes();
        for (Publicacao doacao : doacoes) {
            System.out.println(doacao.titulo);
        }
	}

}
