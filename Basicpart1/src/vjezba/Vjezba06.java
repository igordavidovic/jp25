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
	}
}
