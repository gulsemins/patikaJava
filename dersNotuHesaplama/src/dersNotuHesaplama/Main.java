package dersNotuHesaplama;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		int mat, fizik, turkce,kimya,muzik;
		double ortalama;
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Matematik notunuzu giriniz: ");
		mat = input.nextInt();
		
		if(mat<0 || mat>100){		
			System.out.print("Geçersiz not girdiniz");
		}
		
		System.out.println("Fizik notunuzu giriniz: ");
		fizik = input.nextInt();
		
		if(fizik<0 || fizik>100){		
			System.out.print("Geçersiz not girdiniz");
		}
		
		System.out.println("Turkce notunuzu giriniz: ");
		turkce = input.nextInt();
		if(turkce<0 || turkce>100){		
			System.out.print("Geçersiz not girdiniz");
			}
		
		System.out.println("Kimya notunuzu giriniz: ");
		kimya = input.nextInt();
		if(kimya<0 || kimya>100){		
			System.out.print("Geçersiz not girdiniz");
		}
		System.out.println("Muzik notunuzu giriniz: ");
		muzik = input.nextInt();
		if(muzik<0 || muzik>100){		
			System.out.print("Geçersiz not girdiniz");
		}
		ortalama = (mat+fizik+turkce+kimya+muzik)/5;
		
		if(ortalama>=55) {
			System.out.println("Tebrikler notunuz: "+ortalama + " Sinifi gectiniz");
		}else {
			System.out.println("Sinifta kaldiniz!");
			
		}
		
		

	}
		}
		
	
		
	

