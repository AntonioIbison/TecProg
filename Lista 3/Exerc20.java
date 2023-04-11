import java.util.Locale;
import java.util.Scanner;

public class Exerc20 {

	public static void diminuirVetor(int tamanho, int vet[]) {
		
		for (int i = vet.length; i>=1; i--) {
			tamanho=i;
			System.out.println("tamanho do vetor:" + tamanho);
		}
		System.out.println("\ntamanho final do vetor: "+ tamanho);
		}
	
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("Insira o tamanho do vetor: ");
		int tamanho=sc.nextInt();
		int vet[]= new int[tamanho];
		
		diminuirVetor(tamanho, vet);
		
		
		sc.close();
		
	}

}
