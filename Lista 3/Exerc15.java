import java.util.Locale;
import java.util.Scanner;

public class Exerc15 {

	public static boolean palindromo(String palavra) {
		
		int tamanho=palavra.length();
		
		for (int i = 0; i <tamanho; i++) {
			if(palavra.charAt(i)!=palavra.charAt(tamanho-1-i)) {
				return false;
			}
		}
		return true;
	}
	
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Insira uma palavra para fazer a verificação de palindromo: ");
		String palavra=sc.nextLine();
		
		if(palindromo(palavra)) {
			System.out.println("É palindromo.");	
		} else {
			System.out.println("Não é palindromo.");
		}
		
		
		sc.close();

	}

}
