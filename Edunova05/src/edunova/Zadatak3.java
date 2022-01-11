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
		int suma = 0;
		int max = Integer.MIN_VALUE;
		int min = Integer.MAX_VALUE;
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
			if(b > max) {
				max = b;
			}
			if(b < min) {
				min = b;
			}
			suma += b;
			brojac++;
			if (brojac == 1 || brojac % slucajniBroj == 0) {
				slucajnaVrijednost = b;
				System.out.println("Postavljam: " + slucajnaVrijednost);
			}
		}
		double avg = suma / brojac;
		System.out.println("Suma je : " + suma);
		System.out.println("Srednja vrijednost je : " + avg);
		System.out.println("Najmanji broj je : " + min);
		System.out.println("Najveći broj je : " + max);
		System.out.println(slucajnaVrijednost);
	}

}
