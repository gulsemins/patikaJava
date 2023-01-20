package armstrongSayilar;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		/*
		int a = 2451, basamakSayisi = 0, numberCounter = 0;
		// Basamak Sayisi Bulma İşlemi
		// 2451/10 = 245
		// 245/10 = 24
		// 24/10 = 2
		// 2/10 = 0
		// 0/10 = 0

		while (a != 0) {
			a = a / 10;
			System.out.println(a);
			numberCounter++;

		}
		// Bir sayinin son basamağını bulma
		// 2451%10 = 1
		int b = 2451;
		int c = b % 10;
	

	// üs alma işlemi

	int sub = 2, sup = 3;
	int result = 1;

	for(int i = 1;i<=sup;i++){
		result *= sub;
	}
System.out.println(result);
*/
		Scanner scan = new Scanner (System.in);
		System.out.println("Bir sayi giriniz: ");
		int number = scan.nextInt();
		int tempNumber = number;
		int basValue;
		int numberCounter= 0;
		int result=0;
		int basPow;
	
	
		while( tempNumber!=0 ) {
			tempNumber/=10;
			
			numberCounter++;
			
		}
		
		tempNumber = number; // yukarda söngüden sonra tempnumber 0 oldu biz burda tekrar eşitleyip değeri geri aldık.
		while( tempNumber!=0 ) {
			basValue = tempNumber%10;
			basPow =1;
		//	System.out.println(basValue);
			for( int i = 1; i<=numberCounter; i++ ) {
				basPow *= basValue;
			}
			result += basPow;
			tempNumber/=10;
			
		}
		if(result == number) {
			System.out.println(number + " sayisi bir armstrong sayidir");
		}else {
			System.out.println(number + " sayisi bir amrstrong sayi degildir.");
		}
}}