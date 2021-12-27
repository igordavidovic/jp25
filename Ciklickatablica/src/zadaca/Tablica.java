package zadaca;

import javax.swing.JOptionPane;

public class Tablica {
	public static void main(String[] args) {
		int redak = Integer.parseInt(JOptionPane.showInputDialog("Upiši broj redaka koji će biti u tablici"));
		
		int stupac = Integer.parseInt(JOptionPane.showInputDialog("Upiši broj stuapaca koji će biti u tablici"));
		
		int[][] niz = new int [redak][stupac];
	}
}
