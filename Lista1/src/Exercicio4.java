import java.util.Locale;
import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.println("Insira um valor para A:");
		int A = sc.nextInt();

		System.out.println("Insira um valor para B:");
		int B = sc.nextInt();

		if (A > 10 || A + B == 20) {
			System.out.println("número valido");
		} else {
			if (A == B) {
				System.out.println("A é igual B; A e B são diferentes de 10; A é menor que 10");
			} else {
				System.out.println("número não valido");
			}
		}
		sc.close();
	}

}
