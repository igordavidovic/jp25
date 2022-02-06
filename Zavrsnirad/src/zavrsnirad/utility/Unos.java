package zavrsnirad.utility;

import java.math.BigDecimal;
import java.util.Scanner;

public class Unos {
	public static int unesiInt(Scanner ulaz, String opis) {
		int i = 0;
		while (true) {
			System.out.print(opis + ": ");
			try {	
				i = Integer.parseInt(ulaz.nextLine());
			} catch (Exception e) {
				System.out.println("Unos mora biti broj");
				continue;
			}
			if (i < 1) {
				System.out.println("Broj mora biti pozitivan");
				continue;
			}
			return i;
		}
	}
	
	public static int unesiInt( Scanner ulaz, String opis, int min, int max) {
		int i=0;
		while(true) {
			System.out.print(opis + ": ");
			try {
				i = Integer.parseInt(ulaz.nextLine());
			} catch (Exception e) {
				System.out.println("Unos mora biti broj");
				continue;
			}
			
			if(i<min || i>max) {
				System.out.println("Broj mora biti između " + min + " i " + max);
				continue;
			}
			return i;
		}
	}
	
	
	public static BigDecimal unesiBigDecimal(Scanner ulaz, String opis) {
		BigDecimal i = BigDecimal.ZERO;
		while (true) {
			System.out.print(opis + ": ");
			try {
				i = new BigDecimal(ulaz.nextLine());
			} catch (Exception e) {
				System.out.println("Unos mora biti broj");
			}
			if (i.compareTo(BigDecimal.ONE) < 0) {
				System.out.println("Broj mora biti pozitivan");
				continue;
			}
			return i;
		}
	}

	public static String unesiString(Scanner ulaz, String opis) {
		String s = "";
		while (true) {
				System.out.print(opis + ": ");
				s = ulaz.nextLine();
				if (s.length() == 0) {
					System.out.println("Obavezan unos");
					continue;
				}
				return s;
			} 
		}
	
		public static boolean unesiBoolean(Scanner ulaz, String opis) {
			String s;
			while (true) {
				System.out.println(opis + ": ");
				s = ulaz.nextLine();
				s.toUpperCase();
				if (s == "DA") {
					return true;
				} else if (s == "NE") {
					return false;
				} else {
					System.out.println("Unos mora biti da ili ne");
					continue;
				}
			}
		}
}
