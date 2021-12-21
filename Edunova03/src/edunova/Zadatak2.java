package edunova;

import javax.swing.JOptionPane;

public class Zadatak2 {
	
	// Program od korisnika traži unos dva cijela broja
	// S vrijednostima unesenih brojeva deklarirajte matricu
	
	// primjer: Čovjek unese 5 i 6, vi napravite matricu 5x6 
	public static void main(String[] args) {
		
		int x = Integer.parseInt(JOptionPane.showInputDialog("Upiši prvi cijeli broj"));
		
		int y = Integer.parseInt(JOptionPane.showInputDialog("Upiši drugi cijeli broj"));
		
		int[][] matrica = new int[x][y];
	}
}
