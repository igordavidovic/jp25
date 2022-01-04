package vjezba;

import java.util.Arrays;

import javax.swing.JOptionPane;

public class Vjezba10 {
	public static void main(String[] args) {
		//#232
		int n;
		int suma = 0;
		int sumab = 0;
		vanjska:
		while(true) {
			n = Integer.parseInt(JOptionPane.showInputDialog("Upiši koji broj primova tražiti"));
			if(n > 10000) {
				JOptionPane.showMessageDialog(null, "Broj koji ste unijeli nije dobar pokušajte ponovno");
				continue;
			}
			for(int i = 2;i <= 10000;i++) {
				int brojac = 0;
				for(int j = 1;j <= 10000;j++) {
					if(i % j == 0) {
						brojac++;
					}
				}
				if(brojac == 2) {
					suma+=i;
					sumab++;
				}
				if(sumab == n) {
					System.out.println("Suma prvih " + sumab + " prim brojeva " + "je " + suma);
					break vanjska;
				}
			}
		}
		//#233 - Ne valja
	/*	int broj = Integer.parseInt(JOptionPane.showInputDialog("Upiši parni broj veći od 4"));
		int[] niz = new int[broj];
		int br = 0;
		int komb = 0;
		for(int i = 2;i < broj;i++) {
			int brojac1 = 0;
			for(int j = 1;j < broj;j++) {
				if(i % j == 0) {
					brojac1++;
				}
			}
			if(brojac1 == 2 && i % 2 != 0) {
				niz[br] = i;
				br++;
			}
		}
		System.out.println(Arrays.toString(niz));
		for(int i = 0;i < broj;i++) {
			int temp = 0;
			for(int j = 0;j < broj;j++) {
				if(niz[i] + niz[j] == broj) {
					komb++;
				}	
			}
		}
		System.out.println("Broj kombinacija koje su moguće su : " + komb);*/
		//#242
		int broj1 = Integer.parseInt(JOptionPane.showInputDialog("Upiši broj rijedaka koji će biti u tablici"));
		int[][] niz1 = new int [broj1][broj1];
		int[][] niz2 = new int [broj1+1][broj1+1];
		for(int i = 0;i < broj1;i++) {
			for(int j = 0;j < broj1;j++) {
				niz1[i][j] = Integer.parseInt(JOptionPane.showInputDialog("Upiši broj"));
				niz2[i][j] = niz1[i][j];
			}
		}
		for(int i = 0;i < broj1;i++) {
			for(int j = 0;j < broj1;j++) {
				niz2[i][broj1] += niz1[i][j];
			}
			for(int k = 0;k < broj1;k++) {
				niz2[broj1][i] += niz1[k][i];
			}
		}
		for(int i = 0;i < broj1;i++) {
			niz2[broj1][broj1] += niz2[broj1][i];
		}
		for(int i = 0;i <= broj1;i++) {
			System.out.println(Arrays.toString(niz2[i]));
		}
		
		//#247
		int a = Integer.parseInt(JOptionPane.showInputDialog("Upiši prvi broj"));
		int b = Integer.parseInt(JOptionPane.showInputDialog("Upiši drugi broj"));
		int c = Integer.parseInt(JOptionPane.showInputDialog("Upiši treći broj"));
	
		if(a + b > c) {
			System.out.println("True");
		}else if(a + b < c) {
			System.out.println("False");
		}else {
			System.out.println("Zbroj prva dva broja je jednak trećem broju");
		}
	
	}
}
