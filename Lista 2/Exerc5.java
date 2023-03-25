import java.util.Locale;
import java.util.Scanner;

public class Exerc5 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.println("o numero maximo da esquerda:");
		int esquerdo = sc.nextInt();

		System.out.println(" o numero maximo da direita:");
		int direito = sc.nextInt();

		for (int esq = 0; esq <= esquerdo; esq++) {
			for (int dir = 0; dir <= direito; dir++) {
				System.out.println(esq + " - " + dir);
			}
		}
		sc.close();
	}

}
