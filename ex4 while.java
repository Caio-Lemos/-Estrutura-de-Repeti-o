package exercicios;

import java.util.Scanner;
public class ex4 {

	public static void main(String[]args) {
		
		
		
        float num;
   int count=1;
   float maior =0;
   Scanner entrada = new Scanner(System.in);

   System.out.print("Seja bem vindo \n");
   System.out.print("");

   while(count <= 15){
    System.out.print("digite o " + count + "° numero :");
    num = entrada.nextFloat();
   
    maior = num;
    
    if(num > maior){
     maior = num;
    }

    count++;
   }

   System.out.println("O maior numero digitado é: "+maior);

  }
}