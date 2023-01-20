package minVeMaxSayi;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int max = 0, min= 99999999, number;
		Scanner input = new Scanner(System.in);
		
		System.out.println("Kaç tane sayi gireceksiniz: ");
		int n= input.nextInt();
		
		for(int i=1;i<=n; i++) {
			System.out.println(i + ".sayiyi giriniz");
			number = input.nextInt();
			if(number>max) {
				max = number;
			}
			if(number<min) {
				min= number;
			}
		}
		
		System.out.println("Max number is: " + max);
		System.out.println("Min number is: " + min);
	
	}

}
