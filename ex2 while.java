package exercicios;
import java.util.Scanner;

public class ex2 {

	public static void main(String[]args) {
		
		Scanner leitor = new Scanner (System.in);
		
		int a = 1;
		int b;
		
		
		System.out.println("digite um número");
		b = leitor.nextInt();
		
		while( a <= b ) {
			System.out.println(a);
			a++;
		}
		System.out.println("Esta foi sua lista de números ate chegar no que você escreveu");
		}
}
