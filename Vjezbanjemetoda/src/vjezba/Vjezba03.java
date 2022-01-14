package vjezba;

import javax.swing.JOptionPane;

public class Vjezba03 {
	private static int suma;
	
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
	
	private static int sumaZnamenaka(int a) {
		suma = 0;
		while(a != 0) {
			suma += a % 10;
			a /= 10;
		}
		
		return suma;
	}
	
	public static void main(String[] args) {
		System.out.println(sumaZnamenaka(unesiBroj()));
	}
}
