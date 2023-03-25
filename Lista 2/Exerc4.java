import java.util.Locale;
import java.util.Scanner;

public class Exerc4 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.println("digite um numeroa ser multiplicado:");
		int numero = sc.nextInt();
		int multiplicacaoInicial = 1;

		while (multiplicacaoInicial <= 10) {
			System.out.println("multiplicacao: " + numero + " * " + multiplicacaoInicial + " = "
					+ (numero * multiplicacaoInicial));
			multiplicacaoInicial++;
		}

		sc.close();

	}

}
