package exercicios;
import java.util.Scanner;


public class ex3 {
	
	public static void main(String[]args) {
		
			
int num, cont = 1, soma=0;
		
Scanner leitor = new Scanner (System.in);
			
while(cont <=20) {
	
	System.out.println("Digite um número");
     num = leitor.nextInt();
     
     cont++;
     
     soma += num;
     

		
		
			
}
System.out.println("a soma é = "+soma);
System.out.println("a média é ="+soma/20);
	}			
	

}
