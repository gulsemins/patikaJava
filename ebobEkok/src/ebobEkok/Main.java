package ebobEkok;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int n1 = scan.nextInt();
		System.out.println("Enter a second number: ");
		int n2 = scan.nextInt();
		int ebob =1;
		int ekok = 1;
    	/*	
		for( int i=1; i<=n1;i++) {
			if(n1%i==0 && n2%i==0) {
				ebob=i;
			}
			
		}
		System.out.println(ebob);
		*/
		
		int i=1;
		
		if(n1<n2) {
		while( i<=n1) {
			if(n1%i==0 && n2%i==0) {
				ebob=i;
			}
			i++;
		}
	
		}else {
			while(i<=n2) {
				if(n1%i==0 && n2%i==0) {
					ebob=i;
				}
				i++;
				
			}
			int j=1;
			 while (n1 * n2 >= j) {
		            if (j % n1 == 0 && j % n2 == 0) {
		                ekok = j;
		                break;
		            }
		            j++;
		}
			
	}
		System.out.println("sayilarin ebobu: "+ ebob);	
		System.out.print("Sayilarin ekoku: " + ekok);
	}}
