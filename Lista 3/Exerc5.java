import java.util.Locale;
import java.util.Arrays;
import java.util.Scanner;

public class Exerc5 {
	
	public static int[] copia(int vet[]) {
		return Arrays.copyOf(vet, vet.length);
		
	}

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("insira o tamanho do vetor: ");
		int n=sc.nextInt();
		int vet[]=new int[n];
		
		for (int i = 0; i < vet.length; i++) {
			System.out.println("insira o dado do vetor " + (i+1) + ":");
			vet[i]=sc.nextInt();
		}
		int []cola=copia(vet);
		
		System.out.println("vetor inicial: "+ Arrays.toString(vet));
		System.out.println("vetor copiado: " + Arrays.toString(cola));
		
		sc.close();

	}

}
