package ikininKuvveti;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		 int n;
	        Scanner input = new Scanner(System.in);
	        System.out.println("Sayı giriniz: ");
	        n = input.nextInt();

	        System.out.println("Girilen sayıya kadar dördün kuvvetleri: ");
	        for (int i = 1; i < n; i *= 4) {   
	            System.out.println(i);
	        }

	        System.out.println("Girilen sayıya kadar beşin kuvvetleri: ");
	        for (int j = 1; j < n; j *= 5) {
	            System.out.println(j);
		  }
	}

}
