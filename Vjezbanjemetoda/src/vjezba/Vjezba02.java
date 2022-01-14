package vjezba;

import javax.swing.JOptionPane;

public class Vjezba02 {
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
	
	private static int sumaBrojeva(int a,int b,int c) {
		int suma = a + b + c;
		
		return suma;
	}
	
	private static double avgBrojeva(int suma) {
		double avg = (double)suma / 3;
		
		return avg;
	}
	
	public static void main(String[] args) {
		System.out.println(avgBrojeva(sumaBrojeva(unesiBroj(), unesiBroj(), unesiBroj())));
	}
}
