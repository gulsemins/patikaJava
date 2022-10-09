package girilenSayiyaKadar;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		int a;
		int count = 0;
		int total = 0;

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number: ");
		a = scan.nextInt();
		
		for(int i = 0;i<=a;i++){
			if(i % 3==0 && i%4 ==0) {
				count++;
				total = total+i;
				
			}
		}
		double result = total/(count-1);
		
		System.out.println(result);
		scan.close();
	}

}
