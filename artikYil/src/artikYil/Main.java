package artikYil;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int girilenYil;
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Yil giriniz: ");
		
		girilenYil = scan.nextInt();
		
		if(girilenYil %4 ==0) {
			
			if(girilenYil%100 != 0 ) {
				System.out.println("Artik yildir.");
				
			}else {
				if(girilenYil%400==0) {
					System.out.println("Artik yildir.");
				}else {
					System.out.println("Artik yil degildir.");
				}
			}
		}else {
			System.out.println("Artik yil degildir!");
		}
	}

}
