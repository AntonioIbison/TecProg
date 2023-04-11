import java.util.Arrays;
import java.util.Scanner;

public class Exerc8 {

	public static int maiorK(int[] vet, int k) {

		Arrays.sort(vet);
		return vet[vet.length - k];

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int k = 1;
		System.out.println("qual o tamanho do vetor?");
		int n = sc.nextInt();
		int vet[] = new int[n];

		System.out.println("insira dados ao vetor:");
		for (int i = 0; i < vet.length; i++) {
			System.out.println("valores de " + (i + 1) + ":");
			vet[i] = sc.nextInt();
		}
		int maior = maiorK(vet, k);
		System.out.println(maior);

		sc.close();
	}

}
