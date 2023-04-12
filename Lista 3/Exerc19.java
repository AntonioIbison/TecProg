import java.util.Locale;
import java.util.Scanner;

public class Exerc19 {

	public static boolean perf(int numero) {

		int soma = 0;
		for (int i = 1; i < numero; i++) {
			if (numero % i == 0) {
				soma = soma + i;
			}
		}
		if (soma != numero) {
			return false;
		} else {
			return true;
		}

	}

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite um numero para verificar perfeição: ");
		int numero = sc.nextInt();

		if (perf(numero)) {
			System.out.println("perfeito.");
		} else {
			System.out.println("não é perfeito.");
		}

		sc.close();

	}

}
