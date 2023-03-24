import java.util.Locale;
import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.println("Insira um valor para A:");
		int A = sc.nextInt();

		System.out.println("Insira um valor para B:");
		int B = sc.nextInt();

		if (A == 10) {
			System.out.println("A == 10");
		}
		if (A + B == 20) {
			System.out.println("A + B == 20");
		}
		if (B == 10) {
			System.out.println("B == 10");
		}

		sc.close();
	}

}
