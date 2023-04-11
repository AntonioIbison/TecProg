import java.util.Scanner;

public class Exerc1 {

	public static int somatorio(int vet[]) {

		int soma = 0;
		for (int i = 2; i < vet.length - 2; i++) {
			soma += vet[i];
		}

		return soma;
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int vet[] = new int[10];
		for (int i = 0; i < vet.length; i++) {
			System.out.println("de 10 valores, de o valor ao vetor de numero " + i + ": ");
			vet[i] = sc.nextInt();
		}
		int soma = somatorio(vet);
		System.out.println("valor final" + soma);

		sc.close();

	}

}
