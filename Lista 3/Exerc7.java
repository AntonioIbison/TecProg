import java.util.Locale;
import java.util.Scanner;

public class Exerc7 {

	public static boolean ordena(int vet[], int tamanho) {

		for (int i = 0; i < vet.length - 1; i++) {
			if (vet[i] > vet[i + 1]) {
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.println("Insira o tamanho do vetor: ");
		int tamanho = sc.nextInt();
		System.out.println("Insira os dados do vetor: ");
		int vet[] = new int[tamanho];
		for (int i = 0; i < vet.length; i++) {
			System.out.println("valor do dado " + (i + 1) + " do vetor: ");
			vet[i] = sc.nextInt();
		}
		
		if(ordena(vet, tamanho)) {
			System.out.println("crecente.");
		} else {
			System.out.println("não é crescente.");
		}

		sc.close();

	}

}
