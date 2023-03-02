package usluSayilarRecursive;

import java.util.Scanner;

public class Main {

		
		 static int recursiveMetod(int taban, int ust){
		        if (ust == 0){
		            return 1;
		        } else if (ust == 1 ) {
		            return taban;
		        }
		        return taban * recursiveMetod(taban, (ust-1));
		    }
		    public static void main(String[] args) {
		        Scanner scan = new Scanner(System.in);

		        System.out.print("ust: ");
		        int ust = scan.nextInt();

		        System.out.print("taban: ");
		        int taban = scan.nextInt();
		        System.out.println(recursiveMetod(taban, ust));
		    }
		
	}
