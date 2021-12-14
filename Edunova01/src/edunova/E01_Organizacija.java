// paket je direktorij na disku. Uobičajno je da svaka klasa bude u nekom paketu
package edunova;

import javax.swing.JOptionPane;

// Klasa je datoteka na disku - osnovna organizacijka struktura koda
public class E01_Organizacija {
	
	// meotda je cjelina koja odrađuje određenu zadaću
	public static void main(String[] args) {
		
		//komunikacija s korisnikom prema van
		System.out.println("Hello");
		
		//komunikacija s korisnikom prema unutra
		// Preduvjet korištenja JOptionPane klase je dodavanje java.deskop modula
		JOptionPane.showInputDialog("Daj mi vrijednost");
	}

}
