import java.util.Scanner;

public class Exerc14 {

	public static void novo(int vetor[], int removido) {
		
		int novoVet[]=new int[vetor.length];
		for (int i = 0; i < vetor.length; i++) {
			if(vetor[i]!=removido) {
				novoVet[i]+=vetor[i];
				System.out.println(novoVet[i] + " ");
			}
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Insira o tamanho do vetor: ");
		int size = sc.nextInt();

		System.out.println("Insira dados ao vetor: ");
		int vetor[]=new int[size];
		for (int i = 0; i < vetor.length; i++) {
			vetor[i]=sc.nextInt();
		}
		
		System.out.println("Elemento a ser removido: ");
		int removido = sc.nextInt();
		
		System.out.println("Novo vetor: ");
		novo(vetor, removido);
		sc.close();
	}

}
