package yildizlarlaElmas;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int i,k,j;
		Scanner scan = new Scanner(System.in);
		System.out.println("Bir sayi giriniz: ");
		int n = scan.nextInt();

		for ( i = 1; i <= n; i++) {
            for ( j = 1; j <= (n - i); j++) {
                System.out.print(" ");
                
            }
            for ( k = 1; k <= ( 2* i - 1 ); k++) {
                System.out.print("*");
                
            }
            System.out.println(" ");
		}
		
		for ( i = 1; i < n; i++) {
            for ( j = 1; j <= i; j++) {
                System.out.print(" ");
                
            }
            for ( k = 1; k <= ( 2 * n - (2 * i + 1) ); k++) {
                System.out.print("*");
                
            }
            System.out.println(" ");
		}

	}
}
