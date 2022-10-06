package daireDilimi;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		double alan, a, pi = 3.14;
		int r;
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Lütfen dairenin yarıcapını giriniz: ");
		r = input.nextInt();
		
		System.out.println("Lütfen merkez açının ölçüsünü yazınız: ");
		a= input.nextDouble();
		
		alan= (pi*(r*r)*a)/360;
		
		System.out.println(alan);
		
		
	}

}
