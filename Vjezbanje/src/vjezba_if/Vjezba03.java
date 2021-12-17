package vjezba_if;

import javax.swing.JOptionPane;

public class Vjezba03 {
	public static void main(String[] args) {
		double a = Double.parseDouble(JOptionPane.showInputDialog("Upiši prvi decimalni broj"));

		if (a == 0) {
			System.out.println("Nula");
		} else if (a < 0 && a > -1) {
			System.out.println("Negativan mali broj");
		} else if (a < 0 && a <= -1 && a >= -1000000) {
			System.out.println("Negativan broj");
		} else if (a < 0 && a < -1000000) {
			System.out.println("Negativan veliki broj");
		} else if (a > 0 && a < 1) {
			System.out.println("Pozitivan mali broj");
		} else if (a > 0 && a >= 1 && a <= 1000000) {
			System.out.println("Pozitivan broj");
		} else {
			System.out.println("Pozitivan veliki broj");
		}

		System.out
				.println(
						a == 0 ? "Nula"
								: (a < 0 && a > -1 ? "Negativan mali broj"
										: (a < 0 && a <= -1
												&& a >= -1000000
														? "Negativan broj"
														: (a < 0 && a < -1000000 ? "Negativan veliki broj"
																: (a > 0 && a < 1 ? "Pozitivan mali broj"
																		: (a > 0 && a >= 1 && a <= 1000000
																				? "Pozitivan broj"
																				: "Pozitivan veliki broj"))))));
	}
}
