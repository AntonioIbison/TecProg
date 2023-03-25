import java.util.Locale;
import java.util.Scanner;

public class Exerc2 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int numero = 0;
		int soma = 0;
		System.out.println("digite numeros positivos para soma-los:");

		while (numero >= 0) {
			soma += numero;
			numero = sc.nextInt();

		}
		System.out.println("a soma é: " +soma);

		sc.close();
	}
}