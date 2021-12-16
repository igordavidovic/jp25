package edunova;

import javax.swing.JOptionPane;

public class Z02 {

	// Program unosi 3 cijela broja i ispisuje najmanji
	public static void main(String[] args) {
		int prviCijeliBroj = Integer.parseInt(JOptionPane.showInputDialog("Upiši prvi cijeli broj"));

		int drugiCijeliBroj = Integer.parseInt(JOptionPane.showInputDialog("Upiši drugi cijeli broj"));

		int treciCijeliBroj = Integer.parseInt(JOptionPane.showInputDialog("Upiši treći cijeli broj"));

		if (prviCijeliBroj <= drugiCijeliBroj && prviCijeliBroj <= treciCijeliBroj) {
			System.out.println(prviCijeliBroj);
		} else if (drugiCijeliBroj <= prviCijeliBroj && drugiCijeliBroj <= treciCijeliBroj) {
			System.out.println(drugiCijeliBroj);
		} else {
			System.out.println(treciCijeliBroj);
		}
		System.out.println(prviCijeliBroj <= drugiCijeliBroj && prviCijeliBroj <= treciCijeliBroj ? prviCijeliBroj
				: (drugiCijeliBroj <= prviCijeliBroj && drugiCijeliBroj <= treciCijeliBroj ? drugiCijeliBroj
						: treciCijeliBroj));

	}

}
