import java.util.Scanner;

public class ex1 {

public static void main(String[]args) {
	
	Scanner leitor = new Scanner (System.in);
	
	
	
	int num;
int cont=1;
	
	
	while(cont <=10) {
		System.out.println();
		System.out.println(" Digite um numero");
		num = leitor.nextInt();
		
		if(num<0) {
			System.out.println("Este numero é negativo");
					}else {
						System.out.println("Este numero é positivo");
						
}		
}
}
}		

