import java.util.Locale;
import java.util.Scanner;

public class Exerc2 {

	public static double media(double vet[]) {

		double media;
		double soma=0;
		int i = 0;
		for (i = 0; i < vet.length; i++) {

			soma += vet[i];

		}

		media = soma / i;

		return media;

	}

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		double vet[] = new double[2];

		System.out.println("informe as notas do aluno: \n");
		for (int i = 0; i < vet.length; i++) {

			System.out.println("informe a nota: ");
			vet[i] = sc.nextDouble();

		}
		double med=media(vet);
		
		System.out.println("media: " + med);

		sc.close();

	}

}
