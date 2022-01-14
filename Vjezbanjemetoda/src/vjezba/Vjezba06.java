package vjezba;

import javax.swing.JOptionPane;

public class Vjezba06 {
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
	
	private static boolean prijestupnaGodina(int godina) {
		if(godina % 400 == 0 || (godina % 4 == 0 && godina % 100 != 0)) {
			return true;
		}
			
		return false;
	}
	
	public static void main(String[] args) {
		System.out.println(prijestupnaGodina(unesiBroj()));
	}
}
