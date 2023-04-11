import java.util.Scanner;

public class Exerc12 {

	public static boolean primo(int numero) {
		
		if(numero%2!=0 && numero%3!=0 && numero%5!=0 && numero%7!=0) {
			return true;
		}
		if(numero==2 ||numero==3 || numero==5 || numero==7) {
			return true;
		}else {
			return false;
		}
		
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Insira um numero para verificar se é primo ou não: ");
		int numero=sc.nextInt();
		
		if(primo(numero)) {
			System.out.println("é primo");
		} else {
			System.out.println("não é primo");
		}
		
		sc.close();

	}

}
