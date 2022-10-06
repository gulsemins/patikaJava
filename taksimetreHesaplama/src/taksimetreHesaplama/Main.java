package taksimetreHesaplama;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int mesafe;
		double perKm=2.20;
		double total, startPrice =10;
		Scanner input = new Scanner(System.in);
		
		System.out.println("Mesafeyi km cinsinden giriniz: ");
		
		mesafe = input.nextInt();
		
		total = perKm*mesafe;
		total += startPrice;
		
		total = (total < 20 )? 20 : total;
		
		System.out.println(total);
		
		
	
		
	}

}
