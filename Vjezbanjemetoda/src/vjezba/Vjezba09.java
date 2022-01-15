package vjezba;

import javax.swing.JOptionPane;

public class Vjezba09 {
	private static int unesiBroj() {
		int a = 0;
		while(true) {
			a = Integer.parseInt(JOptionPane.showInputDialog("Unesi pozitivan broj"));
			if(a > 0) {
				break;
			}
		}
		return a;
	}
	
	private static int getTotal() {
		int a = unesiBroj();
		int b = unesiBroj();
		int suma = a + b;
		
		return suma;
	}
	
	public static void main(String[] args) {
		System.out.println(getTotal());
	}
}
