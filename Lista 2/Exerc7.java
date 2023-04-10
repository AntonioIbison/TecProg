import java.util.Locale;
import java.util.Scanner;

public class Exerc7 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int numMaximo = sc.nextInt();
		int divisor = 2;
		int ultimoNumero = 0;

		for (int numBuscado = 1; numBuscado < numMaximo; numBuscado++) {
			while (divisor < numBuscado) {
				if (numBuscado % 2 != 0 && numBuscado % 3 != 0 && numBuscado % 5 != 0) {
					ultimoNumero = numBuscado;
				}
				divisor++;
			}
		}
		System.out.println("o ultimo numero é: " +ultimoNumero);
		sc.close();

	}

}
