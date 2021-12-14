package edunova;

import javax.swing.JOptionPane;

public class Z03 {
	
	//Susjed kopa septičku jamu. Traži tebe da mu osiguraš odvoz zemlje.
	//Napiši program koji za unesene podatke izračunava koliko
	//kubika zemlje treba odvesti.
	public static void main(String[] args) {
	
		double duzina = Double.parseDouble(JOptionPane.showInputDialog("Upiši dužinu septičke jame"));
		
		double sirina = Double.parseDouble(JOptionPane.showInputDialog("Upiši širinu septičke jame"));
		
		double dubina = Double.parseDouble(JOptionPane.showInputDialog("Upiši dubinu septičke jame"));
		
		double kubikaza = duzina * sirina * dubina;
		
		System.out.println(kubikaza);
		
	}

}
