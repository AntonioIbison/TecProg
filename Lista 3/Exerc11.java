import java.util.Locale;
import java.util.Scanner;

public class Exerc11 {

	public static double potencia(double base, double expoente) {
		return Math.pow(base, expoente);

	}

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.println("Resolvendo a potenciação: ");
		System.out.println("Insira o valor da base: ");
		double base = sc.nextInt();
		System.out.println("Insira o valor do expoente: ");
		double expoente = sc.nextInt();

		System.out.println(potencia(base, expoente));

		sc.close();
	}

}
