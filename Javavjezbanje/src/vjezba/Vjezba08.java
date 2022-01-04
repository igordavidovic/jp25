package vjezba;

import java.util.Arrays;

import javax.swing.JOptionPane;

public class Vjezba08 {
	public static void main(String[] args) {
		//#198
		int broj;
		int suma = 0;
		int brojac = 0;
		vanjska:
		while(true) {
		broj = Integer.parseInt(JOptionPane.showInputDialog("Upiši pozitivan broj"));
		int suma1 = 0;
		for(int i = 1;i <= broj;i++) {
			if(broj % i == 0) {
				suma1++;
			}
			if(suma1 > 2) {
				JOptionPane.showMessageDialog(null, "Broj koji ste unijeli nije prim broj");
				continue vanjska;
			}
		}
		for(int i = 2;i <= broj;i++) {
			int suma2 = 0;
			for(int j = 1;j <= broj;j++) {
				if(i % j == 0) {
					suma2++;
				}
			}
			if(suma2 > 2) {
				continue;
			}
			suma++;
			brojac++;	
		}
		System.out.println(suma);
		if(brojac == suma) {
			break vanjska;
			}
		}
	
		//#201
		int k = 4;
		int[] niz = {1,3,3,5,6,6};
		vanjska1:
		for(int i = 0;i < niz.length;i++) {
			if(niz[i] == 6) {
				System.out.println(niz[i] + " + " + "0" + " = " + "6");
				continue;
			}
			for(int j = 0;j < niz.length;j++) {
				if(niz[i] + niz[j] == 6) {
					System.out.println(niz[i] + " + " + niz[j] + " = " + (niz[i] + niz[j]));
					continue vanjska1;
				}
			}
		}
		
		//#202
		int k1 = 6;
		int brojac1 = 0;
		int[] niz1 = {4, 2, 3, 3, 7, 2, 4};
		for(int i = 1;i < niz1.length;i++) {
			int suma3 = 0;
			suma3 = niz1[i-1] + niz1[i];
			if(suma3 == 6) {
				brojac1++;
			}
		}

		System.out.println(brojac1);
		
		
		//#203
		double k2 = 3;
		int[] niz2 = {4, 2, 3, 3, 7, 2, 4};
		double[] niz3 = new double [1];
		for(int i = 0;i < niz2.length - 2;i++) {
			double suma4 = 0;
			double avg = 0;
			for(int j = i;j < i+k2;j++) {
				suma4 += niz2[j];
			}
			avg = suma4 / k2;
			if(niz3[0] < avg) {
				niz3[0] = avg;
			}
		}
		System.out.println(Arrays.toString(niz3));
		
		//#211
		int[] niz4 = new int[8];
		for(int i = 0;i < niz4.length;i++) {
			niz4[i] = Integer.parseInt(JOptionPane.showInputDialog("Upiši broj"));
		}
		for(int i = 0;i < niz4.length;i++) {
			for(int j = 0;j < niz4.length;j++) {
				if(niz4[i] < niz4[j]) {
					int temp = niz4[j];
					niz4[j] = niz4[i];
					niz4[i] = temp;
				}
			}
		}
		System.out.println("Visina tri najvećih zgrada su:");
		for(int i = niz4.length-1;i > niz4.length - 4;i--) {
			System.out.println(niz4[i]);
		}
		
		//#212
		int a = Integer.parseInt(JOptionPane.showInputDialog("Upiši broj"));
		int b = Integer.parseInt(JOptionPane.showInputDialog("Upiši broj"));
		int suma5 = a + b;
		int brojac2 = 0;
		while(suma5 > 0) {
			suma5 /= 10;
			brojac2++;
		}
		System.out.println("Broj znamenki u sumi a i b je : " + brojac2);
	
		//#215
		int n;
		double bm = 100000;
		while(true) {
			n = Integer.parseInt(JOptionPane.showInputDialog("Upiši broj"));
			if(n < 0 || n > 100) {
				JOptionPane.showMessageDialog(null, "Broj koji ste unjeli nije dobar");
				continue;
			}
			for(int i = 1;i <= n;i++) {
				bm += bm * 0.04;
				if(bm % 1000 != 0) {
					bm -= bm % 1000;
					bm += 1000;
				}
			}
			System.out.println(bm);
			break;
		}
		
		//#216
		int n1;
		int suma6 = 0;
		while(true) {
			n1 = Integer.parseInt(JOptionPane.showInputDialog("Upiši broj"));
			if(n1 <= 0 || n1 >= 51) {
				JOptionPane.showMessageDialog(null, "Broj koji ste unijeli nije dobar");
				continue;
			}
			for(int a1 = 0;a1 <= 9;a1++) {
				for(int b1 = 0;b1<=9;b1++) {
					for(int c1 = 0;c1 <=9;c1++) {
						for(int d1 = 0;d1 <= 9;d1++) {
							if(a1 + b1 + c1 + d1 == n1) {
								suma6++;
							}
						}
					}
				}
			}
			System.out.println(suma6);
			break;
		}
		
	}
}
