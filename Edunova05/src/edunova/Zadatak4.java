package edunova;

import javax.swing.JOptionPane;

public class Zadatak4 {
	
	// Program prvo nudi izbornik
	// 1. Zbrajanje
	// 2. Oduzimanje
	// 3. Množenje
	// 4. Djeljenje
	// 5. Eksponent

	// zatim unosi dva broja

	// Program ispisuje odabranu operaciju većeg broja s manjim
	public static void main(String[] args) {
		int a = Integer.parseInt(JOptionPane.showInputDialog("1. Zbrajanje \n2. Oduzimanje \n3. Množenje \n4. Djeljenje \n5. Eksponent"));
		int b;
		int c;
		switch (a) {
		case 1:
			b = Integer.parseInt(JOptionPane.showInputDialog("Upiši broj"));
			c = Integer.parseInt(JOptionPane.showInputDialog("Upiši broj"));
			if(b >= c) {
				System.out.println(b + c);
			}else {
				System.out.println(c + b);
			}
			break;
		case 2:
			b = Integer.parseInt(JOptionPane.showInputDialog("Upiši broj"));
			c = Integer.parseInt(JOptionPane.showInputDialog("Upiši broj"));
			if(b >= c) {
				System.out.println(b - c);
			}else {
				System.out.println(c - b);
			}
			break;
		case 3:
			b = Integer.parseInt(JOptionPane.showInputDialog("Upiši broj"));
			c = Integer.parseInt(JOptionPane.showInputDialog("Upiši broj"));
			System.out.println(b * c);
			break;
		case 4:
			b = Integer.parseInt(JOptionPane.showInputDialog("Upiši broj"));
			c = Integer.parseInt(JOptionPane.showInputDialog("Upiši broj"));
			if(b >= c) {
				System.out.println(b / c);
			}else {
				System.out.println(c / b);
			}
			break;
		case 5:
			b = Integer.parseInt(JOptionPane.showInputDialog("Upiši broj"));
			c = Integer.parseInt(JOptionPane.showInputDialog("Upiši broj"));
			if(b >= c) {
				double eksp = Math.pow(b, c);
				System.out.println((int)eksp);
			}else {
				double eksp = Math.pow(c, b);
				System.out.println((int)eksp);
			}
			break;
		default:
			System.out.println("Unesni broj nije ispravan");
			break;
		}
	}
}
