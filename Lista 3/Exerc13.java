import java.util.Arrays;
import java.util.Scanner;

public class Exerc13 {

	public static void novo(int vet1[], int vet2[]) {
		int[] novo = new int[vet1.length];
		Arrays.sort(vet1);
		Arrays.sort(vet2);
		for (int i = 0; i < vet1.length; i++) {
			if (vet1[i] == vet2[i]) {
				novo[i] = vet1[i];
				System.out.println(novo[i] + " ");

			}
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Insira o tamanho dos 2 vetores: ");
		int tamanho = sc.nextInt();

		System.out.println("Insira valores aos vetor 1: ");
		int vet1[] = new int[tamanho];
		for (int i = 0; i < vet1.length; i++) {
			System.out.println("Valor " + (i + 1) + " do vetor: ");
			vet1[i] = sc.nextInt();
		}

		System.out.println("Insira valores aos vetor 2: ");
		int vet2[] = new int[tamanho];
		for (int i = 0; i < vet2.length; i++) {
			System.out.println("Valor " + (i + 1) + " do vetor: ");
			vet2[i] = sc.nextInt();
		}

		System.out.println("Vetor com as ocorrencias: ");
		novo(vet1, vet2);

		sc.close();

	}

}
