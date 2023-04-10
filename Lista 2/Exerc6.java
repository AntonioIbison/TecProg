import java.util.Locale;
import java.util.Scanner;

public class Exerc6 {

	public static boolean sime(int mat[][]) {

		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat.length; j++) {
				if (mat[i][j] != mat[j][i]) {
					return false;
				}
			}
		}
		return true;

	}

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.println("linhas:");
		int numLinha = sc.nextInt();
		System.out.println("colunas:");
		int numColuna = sc.nextInt();

		int mat[][] = new int[numLinha][numColuna];

		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat.length; j++) {
				mat[i][j] = sc.nextInt();
			}
		}

		if (sime(mat)) {
			System.out.println("simetrico");
		} else {
			System.out.println("nao é simetrico.");
		}
		sc.close();

	}

}
