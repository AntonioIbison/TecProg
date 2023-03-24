import java.util.Locale;
import java.util.Scanner;

public class Exercicio10 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.println("Insira um valor para A:");
		int A = sc.nextInt();

		System.out.println("Insira um valor para B:");
		int B = sc.nextInt();

		if (!(A > 10 )) {
			System.out.println("número menor que 10");
		}
		if (!(A + B == 20 )) {
			System.out.println("número diferente de 20");
		}
		sc.close();
	}

}
