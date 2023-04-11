import java.util.Locale;
import java.util.Scanner;

public class Exerc3 {

	public static double mediaP(double nota[], double peso[]) {

		double soma = 0.0, somaP = 0.0, media = 0.0;

		for (int i = 0; i < nota.length; i++) {
			soma += nota[i] * peso[i];
			somaP += peso[i];

		}
		media = soma / somaP;
		return media;

	}

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.println("quantas notas:");
		int qtd = sc.nextInt();

		double nota[] = new double[qtd];
		double peso[] = new double[qtd];

		for (int i = 0; i < peso.length; i++) {
			System.out.println("nota: ");
			nota[i] = sc.nextDouble();
			System.out.println("peso: ");
			peso[i] = sc.nextDouble();
		}

		double media = mediaP(nota, peso);

		System.out.println("a media é: " + media);
		sc.close();

	}

}
