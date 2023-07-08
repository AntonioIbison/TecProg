package Exerc5;

import java.util.List;

public class Main {

	public static void main(String[] args) {

		Contato contato1 = new Contato(1234);
		Contato contato2 = new Contato(5678, "Maria");
		Contato contato3 = new Contato(9012, "João", "joao@gmail.com");
		Contato contato4 = new Contato("98765432");

		contato1.setNome("Pedro");
		contato1.setEndereco("Rua A, 123");
		contato1.setTelefone("12345678");
		contato1.setObservacao("Amigo de infância");

		contato1.impressaoCtt();
		System.out.println("-----------------------");
		Contato contatoDuplicado = contato1.duplicarContato();
		System.out.println("Dados do contato duplicado:");
		contatoDuplicado.impressarCtt();
		System.out.println("-----------------------");

		boolean contatoPreenchido = contato1.taPreenchido();
		System.out.println("Contato preenchido: " + contatoPreenchido);
		System.out.println("-----------------------");

		Agenda agenda = new Agenda("Agenda de Contatos", "Minha agenda pessoal");

		agenda.adicionarContato(contato1);
		agenda.adicionarContato(contato2);
		agenda.adicionarContato(contato3);
		agenda.adicionarContato(contato4);

		System.out.println("Contatos da Agenda:");
		agenda.imprimirContatos();
		System.out.println("-----------------------");

		Cliente cliente = new Cliente(agenda);

	}
}
