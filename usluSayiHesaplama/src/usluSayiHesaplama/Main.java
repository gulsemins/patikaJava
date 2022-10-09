package usluSayiHesaplama;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int num1,num2;
		int total=1;
		Scanner scan = new Scanner(System.in);
		System.out.println("ussu alinacak sayi: ");
		num1 = scan.nextInt();
		System.out.println("kuvvet saysi: ");
		num2 = scan.nextInt();
		
		for(int i=1;i<=num2;i++) {
			total= total*num1;
			
		}
		System.out.println(total);
	}

}
