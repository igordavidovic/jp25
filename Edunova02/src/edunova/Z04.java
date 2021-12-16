package edunova;

import javax.swing.JOptionPane;

public class Z04 {

	// Napišite program koji za danu širinu i dužinu igrališta ispisuje
	// koji se sportovi na tom igralištu mogu igrati
	// Sportovi se igraju na sljedećim površinama igrališta
	// Nogomet 6500 – 7000 m2
	// Rukomet 800 m2
	// Ragbi 7000 m2
	public static void main(String[] args) {

		double sirina = Double.parseDouble(JOptionPane.showInputDialog("Upiši širinu igrališta"));

		double duzina = Double.parseDouble(JOptionPane.showInputDialog("Upiši dužinu igrališta"));

		double kvadratura = sirina * duzina;

		if (kvadratura >= 800 && kvadratura < 6500) {
			System.out.println("Rukomet");
		} else if (kvadratura >= 6500 && kvadratura < 7000) {
			System.out.println("Rukomet i nogomet");
		} else if (kvadratura >= 7000) {
			System.out.println("Rukomet, nogomet i ragbi");
		} else {
			System.out.println("Na zadanoj kvadraturi se ne igra niti jedan on ponuđenih sportova");
		}

		System.out.println(kvadratura >= 800 && kvadratura < 6500 ? "Rukomet"
				: (kvadratura >= 6500 && kvadratura < 7000 ? "Rukomet i nogomet"
						: (kvadratura >= 7000 ? "Rukomet, nogomet i ragbi"
								: "Na zadanoj kvadraturi se ne igra niti jedan on ponuđenih sportova")));
	}

}
