package atmProject;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		String userName, password;
		int right = 3;
		int select, price;
		int balance = 1500;

		while (right > 0) {
			Scanner scan = new Scanner(System.in);
			System.out.println("Lutfen kullanici adini giriniz: ");
			userName = scan.nextLine();
			System.out.println("Lutfen sifrenizi giriniz: ");
			password = scan.nextLine();

			if (userName.equals("banka") && password.equals("1234")) {
				System.out.println("Merhaba bankamiza hosgeldiniz!");
				do {
					System.out.println("1-Para yatırma\n " + "2-Para Çekme\n" + "3-Bakiye Sorgula\n" + "4-Çıkış Yap");
					System.out.print("Lütfen yapmak istediğiniz işlemi seçiniz : ");
					select = scan.nextInt();

					switch (select) {
					case 1:
						System.out.println("Para miktari: ");
						price = scan.nextInt();
						balance = balance + price;
						 System.out.println("Para yatırma işleminiz başarı ile gerçekleşmiştir. Yeni bakiyeniz: " + balance);
						break;
					case 2:
						System.out.println("Para miktari: ");
						price = scan.nextInt();
						if (price > balance) {
							System.out.println("Bakiye yetersiz!");
						} else {
							balance = balance - price;
						}
						break;
					case 3:
						System.out.println("Bakiyeniz: " + balance);
						break;
					}
				} while (select != 4);
				System.out.println("Tekrar gorusmek uzere!");
				break;

			} else {
				right--;
				if (right == 0) {
                    System.out.println("Hesabınız bloke olmuştur lütfen banka ile iletişime geçiniz.");
                } else {
                    System.out.println("Kalan Hakkınız : " + right);
                    break;
				}
			}

		}

	}
}
