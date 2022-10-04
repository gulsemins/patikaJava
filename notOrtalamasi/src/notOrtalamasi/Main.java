package notOrtalamasi;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("Matematik notunuzu giriniz: ");
		int m = scan.nextInt();

		System.out.println("Fizik notunuzu giriniz: ");
		int f = scan.nextInt();

		System.out.println("Kimya notunuzu giriniz: ");
		int k = scan.nextInt();

		System.out.println("Türkçe notunuzu giriniz: ");
		int t = scan.nextInt();

		System.out.println("Tarih notunuzu giriniz: ");
		int ta = scan.nextInt();

		System.out.println("Müzik notunuzu giriniz: ");
		int mu = scan.nextInt();

		int toplam = (m + f + k + t + ta + mu);
		double result = toplam / 6;
		System.out.println("Ortalamaniz" + result);
		
		String durum = result > 60 ? "Geçtiniz" : "Kaldınız";
		System.out.println(durum);

	}

}
