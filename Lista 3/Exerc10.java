import java.util.Locale;
import java.util.Scanner;

public class Exerc10 {

	public static boolean comparacao(int vet1[], int vet2[]) {

		//tamanho
		if (vet1.length != vet2.length) {
			return false;
		}
		//dados
		for (int i = 0; i < vet2.length; i++) {
			if (vet1[i] != vet2[i]) {
				return false;
			}
		}

		return true;
	}

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.println("Insira a quantidade de termos no vetor 1: ");
		int v1 = sc.nextInt();
		int vet1[] = new int[v1];
		System.out.println("Insira valores ao vetor 1: ");
		for (int i = 0; i < vet1.length; i++) {
			System.out.println("valores de " + (i + 1) + ":");
			vet1[i] = sc.nextInt();
		}

		System.out.println("Insira a quantidade de termos no vetor 2: ");
		int v2 = sc.nextInt();
		int vet2[] = new int[v2];
		System.out.println("Insira valores ao vetor 2: ");
		for (int i = 0; i < vet2.length; i++) {
			System.out.println("valores de " + (i + 1) + ":");
			vet2[i] = sc.nextInt();
		}

		boolean comp = comparacao(vet1, vet2);

		if (comp) {
			System.out.println("iguais");
		} else {
			System.out.println("diferentes");

		}

		sc.close();

	}

}
