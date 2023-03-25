import java.util.Locale;
import java.util.Scanner;

public class Exerc3 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("Adivinhe um numero de 1 a 100");
		int numeroUsuario=sc.nextInt();
		int numAdivinhado=43;
		while(numeroUsuario!=numAdivinhado) {
			if(numeroUsuario>numAdivinhado) {
				System.out.println("o numero digitado é maior que o a ser adivinhado.");
				
			} else {
				System.out.println("o numero digitado é menor que o a ser adivinhado.");
			}
			System.out.println("digite outro numero:");
			numeroUsuario=sc.nextInt();
		}
		System.out.println("parabens, acertou o numero!!");
		sc.close();
	}

}
