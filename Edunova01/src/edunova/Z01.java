package edunova;

import javax.swing.JOptionPane;

public class Z01 {
	
	// Program učitava dva cijela broja i ispisuje njihovu razliku
	public static void main(String[] args) {
		int prviCijeliBroj = Integer.parseInt(JOptionPane.showInputDialog("Unesi prvi cijeli broj"));
		
		int drugiCijeliBroj = Integer.parseInt(JOptionPane.showInputDialog("Unesi drugi cijeli broj"));
		
		int razlika = prviCijeliBroj - drugiCijeliBroj;
		
		System.out.println(razlika);
	}

}
