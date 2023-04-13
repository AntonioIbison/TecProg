import java.util.Locale;
import java.util.Scanner;

public class Exerc18 {

	public static double montante(double cap, double taxa, double time) {
		double mont = cap * Math.pow((taxa + 1), time);
		return mont;
	}

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.println("Insira o capital: ");
		double cap = sc.nextDouble();
		System.out.println("Insira a taxa: ");
		double taxa = sc.nextDouble();
		System.out.println("Insira o tempo: ");
		double time = sc.nextDouble();

		double mont= montante(cap, taxa, time);
		System.out.printf("O montante é: %.2f", mont);
		
		sc.close();

	}

}
