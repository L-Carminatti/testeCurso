package curso;

import java.util.Locale;
import java.util.Scanner;

public class Programa {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);	

		
		    int num;
		    
		    System.out.println("Escreva um numero qualquer: ");
		    num= sc.nextInt();
		    
		    while (num!=-1) {
		    	if (num%2==0) { System.out.println("Esse número é Par!");}
		    	
		    	else  { System.out.println("Esse número é Impar!");}
		    	
		    	System.out.println("Escreva um numero qualquer: ");
		    	num=sc.nextInt();
		    	
		    }
		    
		    System.out.println("Você encerrou o processo.");
		    
	sc.close();
	}
	}
		       


		