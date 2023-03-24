import java.util.Locale;
import java.util.Scanner;

public class Exercicio7 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.println("Insira um valor para A:");
		int A = sc.nextInt();

		System.out.println("Insira um valor para B:");
		int B = sc.nextInt();

		if (A > 10 || A + B == 20) {
			if (A <= 10) {
				System.out.println("números não válidos");
			} else {
				System.out.println("números válidos");
			}
		}
		sc.close();
	}

}
