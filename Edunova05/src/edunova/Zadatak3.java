package edunova;

import javax.swing.JOptionPane;

public class Zadatak3 {

	// Program unosi brojeve sve dok se ne unese broj -1
	// ostali negativno upisani brojevi se preskaču
	// program ispisuje:
	// 1. Sumu svih bojeva
	// 2. Prosjek svih brojeva
	// 3. Najmanji broj
	// 4. Najveći broj
	// 5. Jedan slučajno odabran uneseni broj

	public static void main(String[] args) {
		int slucajniBroj=0;
		while(slucajniBroj==0) {
			slucajniBroj = (int) (Math.random() * 10);
		}
		 
		System.out.println(slucajniBroj);
		int slucajnaVrijednost = 0;
		int brojac = 0, b;
		while (true) {
			b = Integer.parseInt(JOptionPane.showInputDialog("b"));
			if (b == -1) {
				break;
			}
			if (b < 0) {
				continue;
			}
			
			brojac++;
			if (brojac == 1 || brojac % slucajniBroj == 0) {
				slucajnaVrijednost = b;
				System.out.println("Postavljam: " + slucajnaVrijednost);
			}
		}
		System.out.println(slucajnaVrijednost);
	}

}
