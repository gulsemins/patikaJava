package vucudKitleIndeksi;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		double boy, kilo, vki;
		
		Scanner input = new Scanner(System.in);
		System.out.println("Lütfen boyunuzu metre cinsinden girinz: ");
		boy = input.nextDouble();
		
		System.out.println("Lütfen kilonuzu girniz: ");
		kilo= input.nextDouble();
		
		vki = kilo/(boy*boy);
		
		System.out.println(vki);
	}

}
