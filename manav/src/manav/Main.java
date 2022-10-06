package manav;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		 double 
         armutKilosu = 2.14,
          elmaKilosu =3.67,
         domatesKilosu = 1.11 ,
         muzKilosu = 0.95,
         patlıcanKilosu = 5.00,
         armut, elma,domates,muz,patlican;

         Scanner input = new Scanner(System.in);
         System.out.println("Armut Kaç Kilo ? ");
         armut= input.nextDouble();
          
         Scanner inputt = new Scanner(System.in);
         System.out.println("Elma Kaç Kilo ?   ");
         elma= input.nextDouble();

         Scanner inputtt = new Scanner(System.in);
         System.out.println("Domates Kaç Kilo ?   ");
         domates= input.nextDouble();

         Scanner inputttt = new Scanner(System.in);
         System.out.println("Muz Kaç Kilo ?   ");
         muz= input.nextDouble();

         Scanner inputtttt = new Scanner(System.in);
         System.out.println("Patlican Kaç Kilo ?   ");
         patlican= input.nextDouble();
         
         double toplamTutar;
         toplamTutar=((armut*armutKilosu)+(elma*elmaKilosu)+(domates*domatesKilosu)+(muz*muzKilosu)+(patlican*patlıcanKilosu)) ;
         System.out.println("Toplam Tutar ? "  +toplamTutar);

	}

}
