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
		    	if (num%2==0) { System.out.println("Esse n�mero � Par!");}
		    	
		    	else  { System.out.println("Esse n�mero � Impar!");}
		    	
		    	System.out.println("Escreva um numero qualquer: ");
		    	num=sc.nextInt();
		    	
		    }
		    
		    System.out.println("Voc� encerrou o processo.");
		    
	sc.close();
	}
	}
		       


		