package edunova;

import javax.swing.JOptionPane;

public class Z05 {
	
	//Program učitava od korisnika cijeli broj između 10 i 20.
	//Program ispisuje jedinični dio upisanog broja
	public static void main(String[] args) {
		int cijeliBroj = Integer.parseInt(JOptionPane.showInputDialog("Upiši cijeli broj između 10 i 20"));
		
		int jedinicniDio = cijeliBroj % 10;
		
		System.out.println(jedinicniDio);
	}

}
