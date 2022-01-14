package vjezba;

import javax.swing.JOptionPane;
//Traži najmanji broj od tri broja
public class Vjezba01 {
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
	
	private static int najmanjiBroj(int a,int b,int c) {
		int min = Integer.MAX_VALUE;
		if(a <= b && a <= c) {
			min = a;
		}else if(b <= a && b <= c) {
			min = a;
		}else {
			min = c;
		}
		
		return min;
	}
	
	public static void main(String[] args) {
		System.out.println(najmanjiBroj(unesiBroj(), unesiBroj(), unesiBroj()));
	}
}
