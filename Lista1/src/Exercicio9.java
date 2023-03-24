import java.util.Locale;
import java.util.Scanner;

public class Exercicio9 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.println("Insira um valor para A:");
		int A = sc.nextInt();

		System.out.println("Insira um valor para B:");
		int B = sc.nextInt();

		if (A > 10 && A + B == 20) {
			System.out.println("A + B == 20");
		} else {
			System.out.println("número não válido");
		}
		sc.close();
	}

}
