package edunova;

import javax.swing.JOptionPane;

public class Zadatak1 {
	
	// Program prima dva broja i ispisuje sve brojeve jedno ispod drugog
	// između dva primljena broja od manjeg prema većem
	public static void main(String[] args) {
	int a = Integer.parseInt(JOptionPane.showInputDialog("Upiši broj"));
	int b = Integer.parseInt(JOptionPane.showInputDialog("Upiši broj"));
	int max = 0;
	int min = 0;
	if(a > b) {
		max = a;
		min = b;
	}else if(b > a) {
		max = b;
		min = a;
	}else {
		System.out.println("Brojevi su jednaki");
		}
	for(int i = min + 1;i < max;i++) {
		System.out.println(i);
		}
	}
}
