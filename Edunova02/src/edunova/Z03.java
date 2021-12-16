package edunova;

import javax.swing.JOptionPane;

public class Z03 {

	// Program unosi dvije logičke vrijednosti
	// u slučaju da su obje istinite ispisuje DA

	public static void main(String[] args) {
		boolean prvaVrijednost = Boolean.parseBoolean(JOptionPane.showInputDialog("True/False"));

		boolean drugaVrijednost = Boolean.parseBoolean(JOptionPane.showInputDialog("True/False"));

		if (prvaVrijednost == true && drugaVrijednost == true) {
			System.out.println("DA");
		}

		System.out.println(prvaVrijednost == true && drugaVrijednost == true ? "DA" : "");

	}
}
