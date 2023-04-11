import java.util.Locale;
import java.util.Scanner;

public class Exerc16 {

	public static boolean primo(int num) {

		if (num % 2 != 0 && num % 3 != 0 && num % 5 != 0 && num % 7 != 0) {
			return true;
		}
		if(num ==2  || num == 3|| num == 5  || num == 7 ){
			return true;
		} else {
			return false;
		}
		
	}

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.println("insira um numero:");
		int num = sc.nextInt();

		if (primo(num)) {
			System.out.println("primo");
		} else {
			System.out.println("não é primo");
		}

		sc.close();

	}

}
