package zavrsnirad.utility;

import java.math.BigDecimal;
import java.util.Scanner;

public class Unos {
	public static int unesiInt(Scanner ulaz, String opis) {
		int i = 0;
		while (true) {
			try {
				System.out.print(opis + ": ");
				i = Integer.parseInt(ulaz.nextLine());
				if (i < 1) {
					System.out.println("Broj mora biti pozitivan");
					continue;
				}
				return i;
			} catch (Exception e) {
				System.out.println("Greška : " + e.getMessage());
			}

		}
	}

	public static BigDecimal unesiBigDecimal(Scanner ulaz, String opis) {
		BigDecimal i = BigDecimal.ZERO;
		while (true) {
			try {
				System.out.print(opis + ": ");
				i = new BigDecimal(ulaz.nextLine());
				if (i.compareTo(BigDecimal.ONE) < 0) {
					System.out.println("Broj mora biti pozitivan");
					continue;
				}
				return i;
			} catch (Exception e) {
				System.out.println("Greška : " + e.getMessage());
			}
		}
	}

	public static String unesiString(Scanner ulaz, String opis) {
		String s = "";
		while (true) {
			try {
				System.out.print(opis + ": ");
				s = ulaz.nextLine();
				if (s.length() == 0) {
					System.out.println("Obavezan unos");
					continue;
				}
				return s;
			} catch (Exception e) {
				System.out.println("Greška : " + e.getMessage());
			}

		}
	}
}
