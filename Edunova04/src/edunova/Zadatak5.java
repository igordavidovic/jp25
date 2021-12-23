package edunova;

import javax.swing.JOptionPane;

public class Zadatak5 {
	
	// Program učitava 5 cjelih brojeva
	// foreach petljom ispisuje sve učitane brojeve
	// ispisuje prosjek učitanih brojeva
	public static void main(String[] args) {
		int[] niz = new int[5];
		int zbroj = 0;
		for(int i = 0;i<niz.length;i++) {
			niz[i]=Integer.parseInt(JOptionPane.showInputDialog("Upiši cijeli broj"));
			zbroj+=niz[i];
		}
		for(int i = 0;i<niz.length;i++) {
			System.out.println(niz[i]);
		}
		System.out.println();
		System.out.println("Zbroj upisanih brojeva je " + (zbroj / niz.length));
	}
}
