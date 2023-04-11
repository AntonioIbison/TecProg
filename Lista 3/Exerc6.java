import java.util.Arrays;
import java.util.Scanner;

public class Exerc6 {

	public static void ordenar(int vet[], int tamanho) {
		Arrays.sort(vet);
		System.out.println("vetor ordenado:");
		for (int i = 0; i < vet.length; i++) {
			System.out.println(vet[i]);
		}

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Qual o tamanho do vetor? ");
		int tamanho = sc.nextInt();
		int vet[] = new int[tamanho];

		System.out.println("Insira valores ao vetor:");

		for (int i = 0; i < vet.length; i++) {
			System.out.println("Valor do vetor " + (i + 1) + ": ");
			vet[i] = sc.nextInt();
		}
		System.out.println("Vetor atual: ");
		for (int i = 0; i < vet.length; i++) {
			System.out.println(vet[i]);
		}

		ordenar(vet, tamanho);

		sc.close();
	}
}
