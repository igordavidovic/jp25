package vjezba;

import javax.swing.JOptionPane;

public class Vjezba04 {
	public static void main(String[] args) {
		//#66
	/*	int suma = 0;
		int zbroj = 0;
			vanjska:
			for(int i = 2; suma < 100;i++) {
				for(int j = 2;j < i;j++) {
				if((i % j == 0)) {
					continue vanjska;
				}
			}
				zbroj += i;
				suma++;
		}
			System.out.println(suma);
			System.out.println(zbroj);*/
		//#98 -- Mogu ga bolje napraviti
/*		int broj = Integer.parseInt(JOptionPane.showInputDialog("Upiši broj"));
		int[] niz = new int [broj];
		int suma1 = 0;
		boolean prv = false;
		int prov = 0;
		for(int i = 0;i < niz.length;i++) {
			niz[i] = Integer.parseInt(JOptionPane.showInputDialog("Upiši broj"));
		}
		vanjska:
		for(int i = 0;i < niz.length - 2;i++) {
		if(niz[i] == 20 && niz[i+1] == 20 && niz[i+2] == 20) {
			prv = false;
			prov++;
			break vanjska;
		}
	}
		for(int i = 0;i < niz.length;i++) {
			if(niz[i] == 20) {
				suma1++;
			}
			if(suma1 == 3 && prov == 0) {
				prv = true;
			}
		}

		System.out.println(prv);
		*/
		//#99
		/*int broj1 = Integer.parseInt(JOptionPane.showInputDialog("Upiši koliko će brojeva biti u nizu"));
		int izbroj = Integer.parseInt(JOptionPane.showInputDialog("Upiši broj koji će se tražiti"));
		int suma1 = 0;
		int[] niz1 = new int [broj1];
		for(int i = 0;i < niz1.length;i++) {
			niz1[i] = Integer.parseInt(JOptionPane.showInputDialog("Upiši broj"));
		}
		vanjska1:
		for(int i = 0;i < niz1.length -1;i++) {
			if(niz1[i] != izbroj && niz1[i + 1] != izbroj) {
				suma1++;
				break vanjska1;
			}
			
		}
		if(suma1 == 0) {
			System.out.println("True");
		}else {
			System.out.println("False");
		}
		*/
		//#101
		/*int broj2 = Integer.parseInt(JOptionPane.showInputDialog("Upiši koliko će brojeva biti u nizu"));
		int[] niz2 = new int [broj2];
		int suma2 = 0;
		int suma3 = 0;
		for(int i = 0;i < niz2.length;i++) {
			niz2[i] = Integer.parseInt(JOptionPane.showInputDialog("Upiši broj"));
			if(niz2[i] == 10) {
				suma2++;
			}
			if(niz2[i] == 20) {
				suma3++;
			}
		}
		if(suma2 > suma3) {
			System.out.println("Broj 10 se pojavljuje više puta od broja 20" );
		}else {
			System.out.println("Broj 10 se pojavljuje : " + suma2 + " puta");
			System.out.println("Broj 20 se pojavljuje : " + suma3 + " puta");
		}*/
		//#102
		int broj3 = Integer.parseInt(JOptionPane.showInputDialog("Upiši koliko će brojeva biti u nizu"));
		int[] niz3 = new int [broj3];
		for(int i = 0;i < niz3.length;i++) {
			niz3[i] = Integer.parseInt(JOptionPane.showInputDialog("Upiši broj"));
			}
	}
}
