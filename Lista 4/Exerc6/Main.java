package Exerc6;

public class Main {

	public static void main(String[] args) {
		Ingresso ingresso1 = new Ingresso(50.0);
		IngressoVIP ingresso2 = new IngressoVIP(100.0, 20.0);
		Ingresso ingresso3 = new Ingresso(70.0);

		Evento evento = new Evento();

		evento.vendeIngresso(ingresso1);
		evento.vendeIngresso(ingresso2);
		evento.vendeIngresso(ingresso3);

		double valorTotal = evento.valorTotal();
		System.out.println("Valor total dos ingressos vendidos: R$" + valorTotal);

		System.out.println("Ingressos não vendidos:");
		evento.ingressosNaoVendidos();
	}

}
