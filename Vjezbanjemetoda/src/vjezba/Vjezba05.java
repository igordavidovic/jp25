package vjezba;

import javax.swing.JOptionPane;

public class Vjezba05 {
	private static int buducaKolicina;
	
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
	
	private static int rateInteres(int investicija, int rata, int godine) {
	buducaKolicina = investicija;
	System.out.println("Godina " + " Buduca količina");
	for(int i = 1;i <= godine;i++) {
		buducaKolicina += buducaKolicina/10;
		System.out.println(i + "       " + buducaKolicina);
	}
	
	return buducaKolicina;
	}
	
	public static void main(String[] args) {
		rateInteres(unesiBroj(), unesiBroj(), unesiBroj());
	}
}
