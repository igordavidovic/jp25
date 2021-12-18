package vjezba_if;

import javax.swing.JOptionPane;

public class Vjezba04 {
	public static void main(String[] args) {

		int x = Integer.parseInt(JOptionPane.showInputDialog("Upiši cijeli broj od 1 do 30"));

		if (x == 1) {
			System.out.println("A");
		} else if (x == 2) {
			System.out.println("B");
		} else if (x == 3) {
			System.out.println("C");
		} else if (x == 4) {
			System.out.println("Č");
		} else if (x == 5) {
			System.out.println("Ć");
		} else if (x == 6) {
			System.out.println("D");
		} else if (x == 7) {
			System.out.println("DŽ");
		} else if (x == 8) {
			System.out.println("Đ");
		} else if (x == 9) {
			System.out.println("E");
		} else if (x == 10) {
			System.out.println("F");
		} else if (x == 11) {
			System.out.println("G");
		} else if (x == 12) {
			System.out.println("H");
		} else if (x == 13) {
			System.out.println("I");
		} else if (x == 14) {
			System.out.println("J");
		} else if (x == 15) {
			System.out.println("K");
		} else if (x == 16) {
			System.out.println("L");
		} else if (x == 17) {
			System.out.println("LJ");
		} else if (x == 18) {
			System.out.println("M");
		} else if (x == 19) {
			System.out.println("N");
		} else if (x == 20) {
			System.out.println("NJ");
		} else if (x == 21) {
			System.out.println("O");
		} else if (x == 22) {
			System.out.println("P");
		} else if (x == 23) {
			System.out.println("R");
		} else if (x == 24) {
			System.out.println("S");
		} else if (x == 25) {
			System.out.println("Š");
		} else if (x == 26) {
			System.out.println("T");
		} else if (x == 27) {
			System.out.println("U");
		} else if (x == 28) {
			System.out.println("V");
		} else if (x == 29) {
			System.out.println("Z");
		} else if (x == 30) {
			System.out.println("Ž");
		} else {
			System.out.println("Nisi unio cijeli broj od 1 do 30");
		}

		System.out.println(x == 1 ? "A"
				: (x == 2 ? "B"
						: (x == 3 ? "C"
								: (x == 4 ? "Č"
										: (x == 5 ? "Ć"
												: (x == 6 ? "D"
														: (x == 7 ? "DŽ"
																: (x == 8 ? "Đ"
																		: (x == 9 ? "E"
																				: (x == 10 ? "F"
																						: (x == 11 ? "G"
																								: (x == 12 ? "H"
																										: (x == 13 ? "I"
																												: (x == 14
																														? "J"
																														: (x == 15
																																? "K"
																																: (x == 16
																																		? "L"
																																		: (x == 17
																																				? "LJ"
																																				: (x == 18
																																						? "M"
																																						: (x == 19
																																								? "N"
																																								: (x == 20
																																										? "NJ"
																																										: (x == 21
																																												? "O"
																																												: (x == 22
																																														? "P"
																																														: (x == 23
																																																? "R"
																																																: (x == 24
																																																		? "S"
																																																		: (x == 25
																																																				? "Š"
																																																				: (x == 26
																																																						? "T"
																																																						: (x == 27
																																																								? "U"
																																																								: (x == 28
																																																										? "V"
																																																										: (x == 29
																																																												? "Z"
																																																												: (x == 30
																																																														? "Ž"
																																																														: "Nisi unio cijeli broj od 1 do 30"))))))))))))))))))))))))))))));

	}
}
