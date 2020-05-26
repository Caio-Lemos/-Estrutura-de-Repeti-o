package exercicios;

import java.util.Scanner;

public class ex5 {

	public static void main(String[]args) {	
		 Scanner leitor = new Scanner(System.in);
		 float salario;
		 float altura=0;
		 String sexo;
	     int cont= 1;
	     int soma=0;
	     int soma2=0;
	 double media=0;
		float maisde100000 = 0;
		float maior = 0;
		float menor = 1999999999;
		float pm= maior;
		
  
while(cont<=20) { 
			
				
		     System.out.println(" Digite seu sexo 'm/f' ");
			 sexo = leitor.next();
			 
			 System.out.println(" Digite sua altura ");
			altura = leitor.nextInt();
			
			System.out.println(" Digite seu salário ");
			salario = leitor.nextFloat();
			 			 

 if(sexo.trim().equals("m")) {
				 ++soma;  }
			 else {
					++soma2;
				 }
System.out.println("-----------------------------"); 	 
                
                        media+=salario;
                        
System.out.println("-----------------------------"); 
if(sexo.trim().equals("f")&(salario<=100000)) {  
	 	 ++maisde100000;	}

       





            if(maior<altura) {
	 	    
	 		 maior = altura; 	
	 		 
	 	 } 
            
            
            if (menor>altura) {
            	menor=altura;
            }
            
            
        
            	
                        
       
	 	
	 	 
	

                      

                     cont++;
	}
	
		 System.out.println("sexo masculino =  "+soma);  
		 System.out.println("sexo feminino =  "+soma2);
		 System.out.println("");
		 System.out.println("a media de salário é = "+media/20);
		 System.out.println();
		 System.out.println("O numero de mulheres que ate: R$ 1.00000 é = "+maisde100000);
		 System.out.println("A maior altura é = "+maior);
		 System.out.println("A menor altura é = "+menor);
		 
	
	}
}

