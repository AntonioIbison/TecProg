import java.util.Locale;
import java.util.Scanner;

public class Exerc4 {

	public static int contador(int vet1[], int vet2[], int nContado) {

		int cont = 0;

		for (int i = 0; i < vet1.length; i++) {
			if (nContado == vet1[i]) {
				cont++;
			}

		}

		for (int i = 0; i < vet2.length; i++) {
			if (nContado == vet2[i]) {
				cont++;
			}
		}

		return cont;

	}

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.println("Insira o tamanho do vetor 1: ");
		int size1 = sc.nextInt();
		int vet1[] = new int[size1];
		for (int i = 0; i < vet1.length; i++) {
			System.out.println("Insira o dado " + (i + 1) + " ao vetor 1: ");
			vet1[i] = sc.nextInt();
		}
		System.out.println("Insira o tamanho do vetor 2: ");
		int size2 = sc.nextInt();
		int vet2[] = new int[size2];
		for (int i = 0; i < vet2.length; i++) {
			System.out.println("Insira o dado " + (i + 1) + " ao vetor 2: ");
			vet2[i] = sc.nextInt();
		}

		System.out.println("O numero a ser contado é: ");
		int nContado = sc.nextInt();

		int aparicoes = contador(vet1, vet2, nContado);
		System.out.println("O numero " + nContado + " apareceu " + aparicoes + " vezes nos vetores.");

		sc.close();
	}

}
