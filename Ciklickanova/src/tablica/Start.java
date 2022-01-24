package tablica;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class Start {

	public static void main(String[] args) {
		int r;
		int s;
		int smjer;
		int kut;
		boolean provjera;
		Scanner scanner = new Scanner(System.in);

		while (true) {
			System.out.print("Upišite broj rijedaka u matrici : ");
			r = scanner.nextInt();
			if (r < 0) {
				JOptionPane.showMessageDialog(null, "Broj nije isprvan unesite broj veći od 0");
				continue;
			}
			break;
		}

		while (true) {
			System.out.print("Upišite broj stupaca u matrici : ");
			s = scanner.nextInt();
			if (s < 0) {
				JOptionPane.showMessageDialog(null, "Broj nije isprvan unesite broj veći od 0");
				continue;
			}
			break;
		}

		while (true) {
			System.out.println(
					"Izaberite početni kut matrice \n1.Donji desni kut \n2.Donji lijevi kut \n3.Gornji lijevi kut \n4.Gornji desni kut");
			kut = scanner.nextInt();
			if (!(kut < 5 && kut > 0)) {
				JOptionPane.showMessageDialog(null, "Broj nije isprvan unesite broj između 1 i 4");
				continue;
			}
			break;
		}

		while (true) {
			System.out.println(
					"U kojem će se smjeru brojevi u matrici kretati \n1.U smjeru kazaljke na satu \n2. Suprotno od smjera kazaljke na satu");
			smjer = scanner.nextInt();
			if (smjer != 1 && smjer != 2) {
				JOptionPane.showMessageDialog(null, "Broj nije isprvan unesite 1 ili 2");
				continue;
			}
			if (smjer == 1) {
				provjera = true;
			} else {
				provjera = false;
			}
			break;
		}
		scanner.close();
		switch (kut) {
		case 1:
			DonjiDesniKut.smjer(r, s, provjera);
			break;
		case 2:
			DonjiLijeviKut.smjer(r, s, provjera);
			break;
		case 3:
			GornjiLijeviKut.smjer(r, s, provjera);
			break;
		case 4:
			GornjiDesniKut.smjer(r, s, provjera);
			break;
		default:
			break;
		}
	}
}
