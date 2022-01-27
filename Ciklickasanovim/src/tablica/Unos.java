package tablica;

import java.util.Scanner;

public class Unos {
	
	protected static int unosRijedka(Scanner scanner) {
		int r;
		while (true) {
			System.out.print("Upišite broj rijedaka u matrici : ");
			r = scanner.nextInt();
			if (r > 0) {
				return r;
			}
		}
	}
	
	protected static int unosStupca(Scanner scanner) {
		int s;
		while (true) {
			System.out.print("Upišite broj stupaca u matrici : ");
			s = scanner.nextInt();
			if (s > 0) {
				return s;
			}
		}
	}
	
	protected static int unosKuta(Scanner scanner) {
		int kut;
		while (true) {
			System.out.println("Izaberite početni kut matrice \n1.Donji desni kut \n2.Donji lijevi kut \n3.Gornji lijevi kut \n4.Gornji desni kut");
			kut = scanner.nextInt();
			if (kut > 0 && kut < 5) {
				return kut;
			}
		}
	}
	
	protected static int unosSmjera(Scanner scanner) {
		int smjer;
		while (true) {
			System.out.println("U kojem će se smjeru brojevi u matrici kretati \n1.U smjeru kazaljke na satu \n2.Suprotno od smjera kazaljke na satu");
			smjer = scanner.nextInt();
			if (smjer == 1 || smjer == 2) {
				return smjer;
			}
		}
	}
}
