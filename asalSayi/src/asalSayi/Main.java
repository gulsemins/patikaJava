package asalSayi;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("1'den 100 e kadar bir sayi giriniz");
		int sayi = scan.nextInt();
		
		int sayac = 0;
		for(int i =2; i<=100;i++) {
			if(sayi %i == 0) {
				sayac++;
				
			}
		}
		if (sayac==1) {
			System.out.println("asal sayidir");
		}else {
			System.out.println("asal sayi değildir");
		}
			
		}
	}


