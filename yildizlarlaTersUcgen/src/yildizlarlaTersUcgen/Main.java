package yildizlarlaTersUcgen;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
	
		  Scanner input = new Scanner(System.in);
		  
		  System.out.println("Basamak sayisini girininiz: "); 
		  int n = input.nextInt();
	
	        for (int i = 0; i < n; i++) {
	            for (int j = 0; j <= n+i; j++) {
	                System.out.print(" ");
	            }
	            for (int k = 1; k <= 2 * n - (2 * i + 1) ; k++) {
	                System.out.print("*");
	            }
	            System.out.println(" ");
			  }
		 
	}

}