package vjezba;

import javax.swing.JOptionPane;

public class Vjezba11 {
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
	
	private static boolean isPrime(int broj) {
		for(int i = 2;i < broj;i++) {
			if(broj % i == 0) {
				return false;
			}
		}
		return true;
	}
	
	public static void main(String[] args) {
		System.out.println(isPrime(unesiBroj()));
		
		for(int i = 1;i <= 500;i++) {
			if(isPrime(i)) {
				System.out.println(i);
			}
		}
	}
}
