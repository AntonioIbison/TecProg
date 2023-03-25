import java.util.Locale;
import java.util.Scanner;

public class Exerc1 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		for(int numero=1; numero<=100;numero++) {
			if(numero%2==0) {
				System.out.println(numero);
			}
			
		}
		
		sc.close();

	}

}
