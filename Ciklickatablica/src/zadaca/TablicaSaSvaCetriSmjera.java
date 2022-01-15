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
		while (true) {
			izbor = Integer.parseInt(JOptionPane.showInputDialog(
					"Upisom broja izaberi odakle će tablica krenuti : \n1. Donji desni kut \n2. Donji lijevi kut \n3. Gornji desni kut \n4. Gornji lijevi kut "));
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
			break;
		}
	}

	public static void main(String[] args) {
		izborSmjera();
	}
}
