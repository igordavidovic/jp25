package vjezba;

import java.util.Arrays;

import javax.swing.JOptionPane;

public class Vjezba06 {
	public static void main(String[] args) {
		//#128
		int broj = Integer.parseInt(JOptionPane.showInputDialog("Upiši koliko će brojeva biti u nizu"));
		
		int[] niz = new int[broj];
		int median = 0;
		for(int i = 0;i < niz.length;i++) {
			niz[i] = Integer.parseInt(JOptionPane.showInputDialog("Upiši broj"));
		}
		if(broj % 2 == 0) {
			median = (niz[broj / 2] + niz[(broj / 2) - 1]) / 2;
			System.out.println(median);
		}else {
			median = niz[(broj - 1)/ 2];
			System.out.println(median);
		}
		System.out.println(Arrays.toString(niz));
		
		//#129
		int[] niz1 = {10,20,10,20,30,40,40,30,50};
		boolean prv = false;
		int br = 0;
		vanjska:
		for(int i = 0;i < niz1.length;i++) {
			br = 0;
			for(int j = 0;j < niz1.length;j++) {
				if(niz1[i] == niz1[j]) {
					br++;
				}
			}
			if(br == 1) {
				prv = true;
			}
			if(prv == true) {
				System.out.println(niz1[i]);
				break vanjska;
			}
		}
		
		//#131

		//#144
		int[] niz2 = {1,4,6,7,6,2};
		int broj1 = 6;
		int a = 0;
		for(int i = 0;i < niz2.length;i++) {
			if(niz2[i] != broj1) {
				a++;
			}
		}
		int b = 0;
		int[] niz3 = new int [a];
		for(int i = 0;i < niz2.length;i++) {
			if(niz2[i] != broj1) {
				niz3[b] = niz2[i];
				b++;
			}
		}
		System.out.println(Arrays.toString(niz3));
		
		
	}
}

