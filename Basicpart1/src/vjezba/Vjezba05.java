package vjezba;

import java.util.Arrays;

import javax.swing.JOptionPane;

public class Vjezba05 {
	public static void main(String[] args) {
		//#104
		/*int broj = Integer.parseInt(JOptionPane.showInputDialog("Upiši koliko će brojeva biti u nizu"));
		int[] niz = new int [broj];
		for(int i = 0;i < niz.length;i++) {
			niz[i] = Integer.parseInt(JOptionPane.showInputDialog("Upiši broj"));
		}
		int d = niz.length - 1;
		vanjska:
		for(int i = d;i>0;i--) {
			if(niz[i] != 10) {
				d--;
			}else {
				break vanjska;
			}
		}
		int[] niz1 = new int [d];
		int a = d - 1;
		for(int i = a;i >= 0;i--) {
			niz1[i] = niz[d - 1];
				d--;
		}
		System.out.println(Arrays.toString(niz1));
		*/
		//#105 Probati na drugi način
	/*	int broj1 = Integer.parseInt(JOptionPane.showInputDialog("Upiši koliko će brojeva biti u nizu"));
		int[] niz2 = new int [broj1];
		for(int i = 0;i < niz2.length;i++) {
			niz2[i] = Integer.parseInt(JOptionPane.showInputDialog("Upiši broj"));
		}
		if((niz2[0] == niz2[niz2.length-2]) && (niz2[1] == niz2[niz2.length-1])) {
			System.out.println("True");
		}else {
			System.out.println("False");
		}*/
		
		//#106
/*		int broj2 = Integer.parseInt(JOptionPane.showInputDialog("Upiši koliko će brojeva biti u nizu"));
		int[] niz3 = new int [broj2];
		for(int i = 0;i < niz3.length;i++) {
			niz3[i] = Integer.parseInt(JOptionPane.showInputDialog("Upiši broj"));
		}
		int[] niz4 = new int [broj2];
		for(int i = 0;i < niz3.length -1;i++) {
			niz4[i] = niz3[i+1];
		}
		niz4[niz4.length-1] = niz3[0];
		System.out.println(Arrays.toString(niz3));
		System.out.println(Arrays.toString(niz4)); */
	
		//#107
	/*	int broj3 = Integer.parseInt(JOptionPane.showInputDialog("Upiši koliko će brojeva biti u nizu"));
		int[] niz5 = new int [broj3];
		boolean prv = false;
		for(int i = 0;i < niz5.length;i++) {
			niz5[i] = Integer.parseInt(JOptionPane.showInputDialog("Upiši broj"));
		}
		vanjska1:
		for(int i = 0;i < niz5.length - 2;i++) {
			if(niz5[i + 2] > niz5[i + 1] && niz5[i + 1] > niz5[i] ) {
				prv = true;
				break vanjska1;
			}
		}
		System.out.println(prv);*/
		
		//#108
	/*	int broj4 = Integer.parseInt(JOptionPane.showInputDialog("Upiši broj"));
		int suma = 0;
		do {
			int b4 = broj4 % 10;
			suma += b4;
			broj4 /= 10;
		}while(broj4 > 0);
		System.out.println(suma);*/
		//#110
	/*	double broj5 = Double.parseDouble(JOptionPane.showInputDialog("Upiši broj"));
		while(broj5 > 4) {
			broj5 /= 4;
		}
		if(broj5 == 4) {
			System.out.println("True");
		}else {
			System.out.println("False");
		}*/
		//#116
/*		for(int i = 1;i <= 100;i++) {
			if(i % 3 == 0 && i % 5 == 0) {
				System.out.println(i + " : Fizz buzz");
			}else if(i % 5 == 0) {
				System.out.println(i + " : Buzz");
			}else if(i % 3 == 0) {
				System.out.println(i + " : Fizz");
			}
		}*/
		//#119
	/*	int broj6 = Integer.parseInt(JOptionPane.showInputDialog("Upiši koliko dug će biti niz"));
		int[] niz6 = new int[broj6];
		for(int i = 0;i < niz6.length;i++) {
			niz6[i] = Integer.parseInt(JOptionPane.showInputDialog("Upiši broj"));
		}
		int se = Integer.parseInt(JOptionPane.showInputDialog("Upiši broji koji će se tražiti"));
		for(int i = 0;i < niz6.length;i++) {
			if(niz6[i] == se) {
				System.out.println("Broj " + se + " se nalazi na " + (i + 1) + ". mjestu u nizu.");
			}
		}*/
		//#120
		int broj7 = Integer.parseInt(JOptionPane.showInputDialog("Upiši broj rijedaka koja će matrica imati"));
		int broj8 = Integer.parseInt(JOptionPane.showInputDialog("Upiši broj stupaca koja će matrica imati"));

		int[][] niz7 = new int[broj7][broj8];
		
		
	
	}
}
