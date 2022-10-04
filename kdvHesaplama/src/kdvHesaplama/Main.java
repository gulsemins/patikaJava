package kdvHesaplama;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		double kdvOran= 0.18;
		Scanner input = new Scanner(System.in);
		
		System.out.println("Ücret tutarini giriniz: ");
		 double tutar = input.nextDouble();
		
		double kdvTutar = tutar*kdvOran;
		double kdvliTutar = tutar+kdvTutar;
		
		System.out.println("KDV orani: " + kdvOran);
		System.out.println("KDV tutari: "+ kdvTutar);
		System.out.println("KDV'li tutar: " + kdvliTutar);
		System.out.println(kdvliTutar);
		
		
		

	}

}
