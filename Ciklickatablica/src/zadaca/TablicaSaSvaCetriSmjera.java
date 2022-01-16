package zadaca;

import javax.swing.JOptionPane;

public class TablicaSaSvaCetriSmjera {
	private static void donjiDesniKut() {
		TablicaSMetodama.main(null);
	}

	private static void donjiLijeviKut() {
		Alt1SMetodama.main(null);
	}

	private static void gornjiDesniKut() {
		Alt2SMetodama.main(null);
	}

	private static void gornjiLijeviKut() {
		Alt3SMetodama.main(null);
	}

	private static void izborSmjera() {
		int izbor;
		int izbor1;
		while (true) {
			izbor1 = Integer.parseInt(JOptionPane.showInputDialog(
					"Izaberi u kojem smjeru će tablica ići \n1. U smjeru kazaljke na satu \n2. Suprotno smjera kazaljke na satu"));
			if (izbor1 != 1 && izbor1 != 2) {
				continue;
				}
			izbor = Integer.parseInt(JOptionPane.showInputDialog(
					"Upisom broja izaberi odakle će tablica krenuti : \n1. Donji desni kut \n2. Donji lijevi kut \n3. Gornji desni kut \n4. Gornji lijevi kut "));
			if (izbor1 == 1) {
				if (izbor == 1) {
					donjiDesniKut();
				} else if (izbor == 2) {
					donjiLijeviKut();
				} else if (izbor == 3) {
					gornjiDesniKut();
				} else if (izbor == 4) {
					gornjiLijeviKut();
				} else {
					continue;
				}
			} else {
				if (izbor == 1) {
					MetodeZaSuprotniSmjer.suprotnaDesniDonjiKut();
				} else if (izbor == 2) {
					MetodeZaSuprotniSmjer.suprotnaDonjiLijeviKut();
				} else if (izbor == 3) {
					MetodeZaSuprotniSmjer.suprotnaGornjiDesniKut();
				} else if (izbor == 4) {
					MetodeZaSuprotniSmjer.suprotnaGornjiLijeviKut();
				} else {
					continue;
				}
			}
			break;
		}
	}

	public static void main(String[] args) {
		izborSmjera();
	}
}
