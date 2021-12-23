package edunova;

import javax.swing.JOptionPane;

public class Zadatak2 {

	// Za upisani cijeli broj ispisati samo prvu znamenku

	// 15262 -> 1
	// 874 -> 8
	public static void main(String[] args) {
		int i = Integer.parseInt(JOptionPane.showInputDialog("Upiši cijeli broj"));
		while (i > 10) {
			i /= 10;
		}
		System.out.println(i);
		
		int x = Integer.parseInt(JOptionPane.showInputDialog("Upiši cijeli broj"));
		// podzadatak: Ispisati broj na mjestu jedinice (zadnji broj)
		// 15262 -> 2
		// 874 -> 4
		while(x > 10) {
			x %= 10;
		}
		System.out.println(x);
	}
}
