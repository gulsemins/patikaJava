package faktoriyelHesaplama;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int n, r, x;
		int total1 = 1;
		int total2 = 1;
		int total3 = 1;
		int result;
		Scanner scan = new Scanner(System.in);
		System.out.println("Lütfen n için değer giriniz: ");
		n = scan.nextInt();
		System.out.println("Lütfen r için değer giriniz: ");
		r = scan.nextInt();

		if (n >= r) {
			for (int i = 1; i <= n; i++) {
				total1 = total1 * i;
			}
			System.out.println(n + "! = " + total1);

			for (int j = 1; j <= r; j++) {
				total2 = total2 * j;

			}
			System.out.println(r + "! = " + total2);
			
			x = n - r;
			for (int k = 1; k <= x; k++) {
				total3 = total3 * k;

			}

			result = total1 / (total2 * total3);
			System.out.println(result);
		}else {
			System.out.println("Birinci sayı ikinci sayıdan büyük veya eşit olmalıdır");
		}

	}
}
