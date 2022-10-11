package harmonikSayilar;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int n;
		double result=0;
		Scanner scan = new Scanner(System.in);
		System.out.println("Bir sayi giriniz:");
		n = scan.nextInt();
		
		for(double i=1;i<=n;i++) {
			result = result+ 1/i;
			
		}
		System.out.println(result);

	}

}
