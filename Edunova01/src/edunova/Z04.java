package edunova;

import javax.swing.JOptionPane;

public class Z04 {
	
	//Program učitava od korisnika cijeli broj. 
	//Program ispisuje true ako je učitani broj paran 
	//ili false ako je učitani broj neparan.
	public static void main(String[] args) {
	int cijeliBroj = Integer.parseInt(JOptionPane.showInputDialog("Upiši cijeli broj"));
	
	int modulo = cijeliBroj % 2;
	
	boolean parnost = modulo == 0;
	
	System.out.println(parnost);
	}
}

