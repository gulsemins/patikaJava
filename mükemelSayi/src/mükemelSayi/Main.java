package mükemelSayi;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		 int result= 0;
		 
		Scanner input = new Scanner(System.in);
		 System.out.println("Enter a number: ");
		 int number = input.nextInt();
		 
		
		 if(number<1) {
			 System.out.println("The number should be greater than zero.");
		 }
		 for(int i=1; i<number; i++ ) {
			 if( number% i == 0) {
				 result= result+i;
		 }
	}
		 if(number == result) {
			 System.out.println(number +" is a perfect number.");
		 }else {
			 System.out.println(number+ " is not a perfect number.");
		 }
		 }
}
