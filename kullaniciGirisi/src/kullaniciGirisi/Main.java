package kullaniciGirisi;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		String username,password;
		
		Scanner input = new Scanner(System.in);
		System.out.println("Kullanici adini giriniz: ");
		username = input.nextLine();
		
		System.out.println("Şifreniz: ");
		password = input.nextLine();
		
		if(username.equals("gulsemin") && password.equals("1234")) {
			System.out.println("Giris yaptiniz!");
						
		}else {
			System.out.println("Bilgileriniz yanlis!");
		}
		

	}

}
