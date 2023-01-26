package fibonacci;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		 Scanner input = new Scanner(System.in);
	        System.out.print("Kaç elemanlı Fibonacci Serisi istiyorsunuz : ");
	        int sayi = input.nextInt();
	        int firstTerm = 0, secondTerm = 1, result;

		System.out.println(firstTerm + " " + secondTerm);

		for (int i = 2; i <= sayi; i++) {
			result = firstTerm + secondTerm;
			firstTerm = secondTerm;
			secondTerm = result;

			System.out.println("" + result);
		}

	}

}
