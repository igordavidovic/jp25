package edunova;

import javax.swing.JOptionPane;

public class E03_Omotaci {

	public static void main(String[] args) {

		int godine;

		System.out.println(Integer.MAX_VALUE + 1);
		//unos
		godine = Integer.parseInt(
				
				JOptionPane.showInputDialog("Učitaj godine")
				
				);
		//algoritam
		int rezultat = godine + 4;

		//ispis
		System.out.println(rezultat);
	}

}
