package edunova;

import javax.swing.JOptionPane;

public class Z02 {

	// Program učitava Dužinu i širinu prostoriju
	// Program ispisuje kvadraturu prostorije

	public static void main(String[] args) {
		double duzina = Double.parseDouble(JOptionPane.showInputDialog("Upiši dužinu prostorije"));
		
		double sirina = Double.parseDouble(JOptionPane.showInputDialog("Upiši širinu prostorije"));
		
		double kvadratura = duzina * sirina;
		
		System.out.println(kvadratura);
	}
}
