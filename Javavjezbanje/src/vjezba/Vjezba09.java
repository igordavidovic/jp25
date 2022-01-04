package vjezba;

import java.util.Arrays;

import javax.swing.JOptionPane;

public class Vjezba09 {
	public static void main(String[] args) {
	/*	int broj;
		int suma = 0;
		while(true) {
			broj = Integer.parseInt(JOptionPane.showInputDialog("Upiši broj"));
			if(broj <= 0 || broj >= 1000000) {
				JOptionPane.showMessageDialog(null, "Broj koji ste unijeli nije između 0 i 999999 pokušajte ponovno");
				continue;
			}
			for(int i = 2; i <= broj;i++) {
				int brojac = 0;
				for(int j = 1;j <= broj;j++) {
					if(i % j == 0) {
						brojac++;
					}
				}
				if(brojac == 2) {
					suma++;
				}
			}
			System.out.println("Broj prim brojeva koji su manji od " + broj + " ili jednaki sa " + broj +  " je " + suma);
			break;
		}*/
		
		//#221
	/*	int[] niz = new int[6];
		vanjska:
		while(true) {
			for(int i = 0;i < niz.length;i++) {
				niz[i] = Integer.parseInt(JOptionPane.showInputDialog("Upiši broj"));
				if(niz[i] < -100000 || niz[i] > 100000) {
					JOptionPane.showMessageDialog(null, "Broj koji ste unijeli nije između -100000 i 100000 pokušajte ponovno");
					continue vanjska;
				}
			}
			for(int i = 0;i < niz.length;i++) {
				for(int j = 0;j < niz.length;j++) {
					if(niz[i] > niz[j]) {
						int temp = niz[j];
						niz[j] = niz[i];
						niz[i] = temp;
					}
				}
			}
			for(int i = 0;i < niz.length;i++) {
				System.out.print(niz[i] + " ");
			}
			break vanjska;
		}*/
		
		//#226
	/*	int broj1;
		vanjska1:
		while(true) {
			broj1 = Integer.parseInt(JOptionPane.showInputDialog("Upiši broj int koji će se unositi"));
			if(broj1 <= 0 || broj1 > 100) {
				JOptionPane.showMessageDialog(null, "Broj koji ste unijeli nije između 0 i 100 pokušajte ponovno");
				continue;
			}
			int [] niz3 = new int [broj1];
			int[] niz4 = new int[1];
			for(int i = 0;i < niz3.length;i++) {
				niz3[i] = Integer.parseInt(JOptionPane.showInputDialog("Upiši broj"));
			}
			int temp = 0;
			int temp1 = 0;
			for(int i = 0;i < niz3.length;i++) {
				int suma1 = 0;
				
				for(int j = 0;j < niz3.length;j++) {
					if(niz3[i] == niz3[j]) {
						suma1++;
						temp = niz3[i];
					}
				}
				if(suma1 > niz4[0]) {
					niz4[0] = suma1;
					temp1 = temp;
				}
			}
			if(niz4[0] > 1) {
				System.out.println(temp1);
				break vanjska1;
			}
			for(int i = 0;i < niz3.length;i++) {
				for(int j = 0;j < niz3.length;j++) {
					if(niz3[j] > niz3[i]) {
						int temp2 = niz3[j];
						niz3[j] = niz3[i];
						niz3[i] = temp2;	
					}
				}
			}
			System.out.println(Arrays.toString(niz3));
			break vanjska1;
		}
		*/
	}
}
