package vjezba;

import javax.swing.JOptionPane;

public class Vjezba02 {
	public static void main(String[] args) {
		// #52
	/*	int[] niz = new int [3];
		
		for(int i = 0;i < niz.length;i++) {
			niz[i] = Integer.parseInt(JOptionPane.showInputDialog("Upiši broj"));
		}
		if(niz[2] == niz[0] + niz[1]) {
			System.out.println("True");
			}
	
		
		//#53
		
		int [] niz1 = new int [3];
		
		for(int i = 0; i < niz1.length;i++) {
			niz1[i] = Integer.parseInt(JOptionPane.showInputDialog("Upiši cijeli broj"));
		}
		
		if(niz1[1] > niz1[0] && niz1[2] > niz1[1]) {
			System.out.println("True");
			
		}
		
		//#54
		int [] niz2 = new int [3];
		for(int i = 0;i < niz2.length;i++) {
			niz2[i] = Integer.parseInt(JOptionPane.showInputDialog("Upiši broj"));
		}

		if((niz2[0]%10 == niz2[1] % 10) || (niz2[0] % 10 == niz2[2] % 10) || (niz2[1]%10 == niz2[2] % 10)) {
			System.out.println("True");
		}
		*/
		// #55
		int sekunde = Integer.parseInt(JOptionPane.showInputDialog("Upiši broj sekundi \nMax : 86399"));
		
		int sati = sekunde / 3600;
		
		int sekunde1 = sekunde - (sati * 3600);
		
		int minute = sekunde1 / 60;
		
		int sekunde2 = sekunde1 - (minute * 60);
		
		System.out.println(sati + " : " + minute + " : " + sekunde2);
	}
}
