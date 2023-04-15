import java.util.Locale;
import java.util.Scanner;

public class Exerc17 {

	public static void inversao(String palavra) {
		int tamanho=palavra.length();
		String inversa="";
		
		for (int i = tamanho-1; i >= 0; i--) {
			inversa+=palavra.charAt(i);
		}
		System.out.println(inversa);
	}
	
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Sua palavra para inverter é: ");
		String palavra=sc.nextLine();
		
		inversao(palavra);
		
		sc.close();
	}

}
