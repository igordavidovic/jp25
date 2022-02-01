package tablica;

import java.util.Scanner;

public class Unos {

	protected static int unosRijedka(Scanner scanner) {

		while (true) {
			try {
				System.out.print("Upišite broj rijedaka u matrici : ");
				var r = Integer.parseInt(scanner.nextLine());
				if (r < 0) {
					System.out.println("Broj mora biti veći od nule");
					continue;
				}
				return r;
			} catch (Exception e) {
				System.out.println("Greška : " + e.getMessage());
			}
		}
	}

	protected static int unosStupca(Scanner scanner) {
		while (true) {
			try {
				System.out.print("Upišite broj stupaca u matrici : ");
				var s = Integer.parseInt(scanner.nextLine());
				if (s < 0) {
					System.out.println("Broj mora biti veći od nule");
					continue;
				}
				return s;
			} catch (Exception e) {
				System.out.println("Greška : " + e.getMessage());
			}
		}
	}

	protected static int unosKuta(Scanner scanner) {
		while (true) {
			try {
				System.out.println(
						"Izaberite početni kut matrice \n1.Donji desni kut \n2.Donji lijevi kut \n3.Gornji lijevi kut \n4.Gornji desni kut");
				var kut = Integer.parseInt(scanner.nextLine());
				if (kut < 1 || kut > 4) {
					System.out.println("Broj mora biti od jedan do četiri");
					continue;
				}
				return kut;
			} catch (Exception e) {
				System.out.println("Greška : " + e.getMessage());
			}
		}
	}

	protected static int unosSmjera(Scanner scanner) {
		while (true) {
			try {
				System.out.println(
						"U kojem će se smjeru brojevi u matrici kretati \n1.U smjeru kazaljke na satu \n2.Suprotno od smjera kazaljke na satu");
				var smjer = Integer.parseInt(scanner.nextLine());
				if (smjer < 1 || smjer > 2) {
					System.out.println("Broj mora biti jedan ili dva");
					continue;
				}
				return smjer;
			} catch (Exception e) {
				System.out.println("Greška : " + e.getMessage());
			}
		}
	}
}
