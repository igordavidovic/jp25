package vjezba;

import javax.swing.JOptionPane;

public class Vjezba10 {
	private static int unesiBroj() {
		int a = 0;
		while(true) {
			a = Integer.parseInt(JOptionPane.showInputDialog("Unesi pozitivan broj"));
			if(a == 0) {
				continue;
			}
			break;
		}
		return a;
	}
	
	private static boolean parnost(int a) {
		if(a % 2 == 0) {
			return true;
		}else {
			return false;
		}
	}
	
	public static void main(String[] args) {
		System.out.println(parnost(unesiBroj()));
	}
}
