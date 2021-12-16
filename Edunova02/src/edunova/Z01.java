package edunova;

import javax.swing.JOptionPane;

public class Z01 {
	
	// Program unosi dva cijela broja
	// Ako je njihov zbroj paran broj ispisuje Osijek
	// inače ispisuje Zagreb

	public static void main(String[] args) {
		
		int prviCijeliBroj = Integer.parseInt(JOptionPane.showInputDialog("Upiši prvi cijeli broj"));
		
		int drugiCijeliBroj = Integer.parseInt(JOptionPane.showInputDialog("Upiši drugi cijeli broj"));
		
		int zbroj = prviCijeliBroj + drugiCijeliBroj;
		
		if(zbroj % 2 == 0) {
			System.out.println("Osijek");
		}else {
			System.out.println("Zagreb");
		}
		
	}
	
}
