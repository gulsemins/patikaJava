package tekSayiToplami;

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		int a;
		double total=0;
				
			
		do {
			Scanner scan = new Scanner(System.in);
			System.out.println("Enter numbers: ");
			a = scan.nextInt();
			
			if(a%2==0 && a%4==0) {
				total +=a;
			}
			
		}while(a%2==0);
		
		double result= total ;
		
		System.out.println("Tek Sayı Girdiğiniz için program durdu.");
		System.out.println("Tplam: " + result);
	}

}
