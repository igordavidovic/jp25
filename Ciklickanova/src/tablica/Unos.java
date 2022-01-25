package tablica;

import java.util.Scanner;

public class Unos {
	static int unosRijedka() {
		int r;
		Scanner scanner = new Scanner(System.in);
		while (true) {
			System.out.print("Upišite broj rijedaka u matrici : ");
			r = scanner.nextInt();
			if (r > 0) {
				scanner.close();
				return r;
			}
		}
	}

	static int unosStupca() {
		int s;
		Scanner scanner = new Scanner(System.in);
		while (true) {
			System.out.print("Upišite broj stupaca u matrici : ");
			s = scanner.nextInt();
			if (s > 0) {
				scanner.close();
				return s;
			}
		}
	}

	static int unosKuta() {
		int kut = 0;
		Scanner scanner = new Scanner(System.in);
		while (true) {
			System.out.println(
					"Izaberite početni kut matrice \n1.Donji desni kut \n2.Donji lijevi kut \n3.Gornji lijevi kut \n4.Gornji desni kut");
			kut = scanner.nextInt();
			if (kut > 0 && kut < 5) {
				scanner.close();
				return kut;
			}
		}
	}

	static int unosSmjera() {
		int smjer;
		Scanner scanner = new Scanner(System.in);
		while (true) {
			System.out.println(
					"U kojem će se smjeru brojevi u matrici kretati \n1.U smjeru kazaljke na satu \n2.Suprotno od smjera kazaljke na satu");
			smjer = scanner.nextInt();
			if (smjer == 1 || smjer == 2) {
				scanner.close();
				return smjer;
			}
		}
	}
}
