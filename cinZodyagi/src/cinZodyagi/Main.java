package cinZodyagi;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int dogumYili;
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Dogum yilinizi giriniz: ");
		dogumYili = scan.nextInt();
		
		if(dogumYili%12 == 0) {
			System.out.println("Cin zodyagi burcunuz: Maymun");
		} else if(dogumYili%12== 1){
			System.out.println("Cin zodyagi burcunuz: Horoz");
			
		}else if(dogumYili%12== 2){
			System.out.println("Cin zodyagi burcunuz: Kopek");
			
		}else if(dogumYili%12== 3){
			System.out.println("Cin zodyagi burcunuz: Domuz");
			
		}else if(dogumYili%12== 4){
			System.out.println("Cin zodyagi burcunuz: Fare");
			
		}else if(dogumYili%12== 5){
			System.out.println("Cin zodyagi burcunuz: Okuz");
			
		}else if(dogumYili%12== 6){
			System.out.println("Cin zodyagi burcunuz: Kaplan");
			
		}else if(dogumYili%12== 7){
			System.out.println("Cin zodyagi burcunuz: Tavsan");
			
		}else if(dogumYili%12== 8){
			System.out.println("Cin zodyagi burcunuz: Ejderha");
			
		}else if(dogumYili%12== 9){
			System.out.println("Cin zodyagi burcunuz: Yilan");
			
		}else if(dogumYili%12== 10){
			System.out.println("Cin zodyagi burcunuz: At");
			
		}else if(dogumYili%12== 11){
			System.out.println("Cin zodyagi burcunuz: Koyun");
			
		}else {
			System.out.println("Hatali veri girdiniz");
		}
	}

}
