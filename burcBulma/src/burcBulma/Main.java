package burcBulma;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int day, month;

		Scanner input = new Scanner(System.in);
		System.out.print("Dogdugunuz günü yaziniz: ");
		day = input.nextInt();
		System.out.print("Hangi ay dogdugunuzu yaziniz: ");
		month = input.nextInt();

		if (month == 1) {
			if (day >= 1 && day <= 21) {
				System.out.println("Oğlak burcusunuz.");
			} else if (day > 21 && day <= 31) {
				System.out.println("Kova burcusunuz.");
			} else {
				System.out.println("Doğum tarihinizi doğru girdiğinizden emin olun.");
			}

		}

		if (month == 2) {
			if (day >= 1 && day <= 19) {
				System.out.println("Kova burcusunuz.");
			} else if (day > 20 && day <= 28) {
				System.out.println("Balık burcusunuz.");
			} else {
				System.out.println("Doğum tarihinizi doğru girdiğinizden emin olun.");
			}

		}

		if (month == 3) {
			if (day >= 1 && day <= 20) {
				System.out.println("Balık burcusunuz.");
			} else if (day > 20 && day <= 31) {
				System.out.println("Koç burcusunuz.");
			} else {
				System.out.println("Doğum tarihinizi doğru girdiğinizden emin olun.");
			}

		}

		if (month == 4) {
			if (day >= 1 && day <= 20) {
				System.out.println("Koç burcusunuz.");
			} else if (day > 20 && day <= 30) {
				System.out.println("Boğa burcusunuz.");
			} else {
				System.out.println("Doğum tarihinizi doğru girdiğinizden emin olun.");
			}

		}

		if (month == 5) {
			if (day >= 1 && day <= 21) {
				System.out.println("Boğa burcusunuz.");
			} else if (day > 21 && day <= 31) {
				System.out.println("İkizler burcusunuz.");
			} else {
				System.out.println("Doğum tarihinizi doğru girdiğinizden emin olun.");
			}

		}

		if (month == 6) {
			if (day >= 1 && day <= 22) {
				System.out.println("İkizler burcusunuz.");
			} else if (day > 22 && day <= 31) {
				System.out.println("Yengeç burcusunuz.");
			} else {
				System.out.println("Doğum tarihinizi doğru girdiğinizden emin olun.");
			}

		}

		if (month == 7) {
			if (day >= 1 && day <= 22) {
				System.out.println("Yengeç burcusunuz.");
			} else if (day > 22 && day <= 31) {
				System.out.println("Aslan burcusunuz.");
			} else {
				System.out.println("Doğum tarihinizi doğru girdiğinizden emin olun.");
			}

		}

		if (month == 8) {
			if (day >= 1 && day <= 23) {
				System.out.println("Aslan burcusunuz.");
			} else if (day > 23 && day <= 31) {
				System.out.println("Başak burcusunuz.");
			} else {
				System.out.println("Doğum tarihinizi doğru girdiğinizden emin olun.");
			}

		}

		if (month == 9) {
			if (day >= 1 && day <= 22) {
				System.out.println("Başak burcusunuz.");
			} else if (day > 22 && day <= 30) {
				System.out.println("Terazi burcusunuz.");
			} else {
				System.out.println("Doğum tarihinizi doğru girdiğinizden emin olun.");
			}

		}

		if (month == 10) {
			if (day >= 1 && day <= 22) {
				System.out.println("Terazi burcusunuz.");
			} else if (day > 22 && day <= 31) {
				System.out.println("Akrep burcusunuz.");
			} else {
				System.out.println("Doğum tarihinizi doğru girdiğinizden emin olun.");
			}

		}

		if (month == 11) {
			if (day >= 1 && day <= 21) {
				System.out.println("Akrep burcusunuz.");
			} else if (day > 21 && day <= 30) {
				System.out.println("Yay burcusunuz.");
			} else {
				System.out.println("Doğum tarihinizi doğru girdiğinizden emin olun.");
			}

		}

		if (month == 12) {
			if (day >= 1 && day <= 21) {
				System.out.println("Yay burcusunuz.");
			} else if (day > 21 && day <= 31) {
				System.out.println("Oğlak burcusunuz.");
			} else {
				System.out.println("Doğum tarihinizi doğru girdiğinizden emin olun.");
			}
		}
	}

}
