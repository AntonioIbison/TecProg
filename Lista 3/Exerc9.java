import java.util.Locale;
import java.util.Arrays;
import java.util.Scanner;

public class Exerc9 {

	public static int menorK(int[] vet, int k) {

		Arrays.sort(vet);

		return vet[vet.length - k];

	}

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.println("qual o tamanho do vetor?");
		int n = sc.nextInt();
		int k = n;
		int vet[] = new int[n];

		System.out.println("insira dados ao vetor:");
		for (int i = 0; i < vet.length; i++) {
			System.out.println("valores de " + (i + 1) + ":");
			vet[i] = sc.nextInt();
		}
		int menor = menorK(vet, k);
		System.out.println(menor);

		sc.close();
	}

}