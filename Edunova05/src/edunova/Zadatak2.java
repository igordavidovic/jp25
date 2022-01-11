package edunova;

import javax.swing.JOptionPane;

public class Zadatak2 {

	// Program prima jedan broj i ispisuje sve parne brojeve
	// od primljenog broja do broja 2 jedno pokraj drugog odvojeno zarezom.
	// Zadnji zarez se ne ispisuje
	public static void main(String[] args) {
		int a = Integer.parseInt(JOptionPane.showInputDialog("Upiši broj"));
		int b = 2;
		for(int i = a - 1;i > b;i--) {
			if(i == 4) {
				System.out.print(i);
			}else if(i % 2 == 0) {
				System.out.print(i + ", ");
			}
		}
	}
}
