package vjezba;

import java.util.Arrays;

import javax.swing.JOptionPane;

public class Vjezba14 {
	public static void main(String[] args) {
		//#1
	/*	int broj = Integer.parseInt(JOptionPane.showInputDialog("Upiši duljinu niza"));
		int[] niz = new int[broj];
		for(int i = 0;i < broj;i++) {
			niz[i] = Integer.parseInt(JOptionPane.showInputDialog("Upiši broj"));
		}
		for(int i = 0;i < broj;i++) {
			for(int j = 0;j < broj;j++) {
				if(niz[i] < niz[j]) {
					int temp = niz[j];
					niz[j] = niz[i];
					niz[i] = temp;
				}
			}
		}
		System.out.println(Arrays.toString(niz));*/
		
		//#2
		/*int broj1 = Integer.parseInt(JOptionPane.showInputDialog("Upiši duljinu niza"));
		int[] niz1 = new int[broj1];
		int suma = 0;
		for(int i = 0;i < broj1;i++) {
			niz1[i] = Integer.parseInt(JOptionPane.showInputDialog("Upiši broj"));
			suma += niz1[i];
		}
		System.out.println(suma);*/
		
		//#3
		/*int[][] niz2 = new int[10][10];
		for(int i = 0;i < niz2.length;i++) {
			for(int j = 0;j < niz2[0].length;j++) {
				System.out.print("-" + " ");
			}
			System.out.println();
		}*/
		
		//#4
		/*int broj2 = Integer.parseInt(JOptionPane.showInputDialog("Upiši duljinu niza"));
		int[] niz3 = new int [broj2];
		int suma1 = 0;
		for(int i = 0;i < niz3.length;i++) {
			niz3[i] = Integer.parseInt(JOptionPane.showInputDialog("Upiši broj"));
			suma1 += niz3[i];
		}
		double avg = suma1 / broj2;
		System.out.println(avg);*/
		
		//#5
	/*	int broj3 = Integer.parseInt(JOptionPane.showInputDialog("Upiši duljinu niza"));
		int[] niz4 = new int[broj3];
		for(int i = 0;i < niz4.length;i++) {
			niz4[i] = Integer.parseInt(JOptionPane.showInputDialog("Upiši broj"));
		}
		boolean prv = false;
		int tb = Integer.parseInt(JOptionPane.showInputDialog("Upiši broj koji će se tražiti"));
		for(int i = 0;i < niz4.length;i++) {
			if(niz4[i] == tb) {
				prv = true;
				break;
			}else {
				prv = false;
			}
		}
		System.out.println(prv);*/
		//#6
		/*int[] niz5 = {25,14,56,15,36};
		int tb1 = Integer.parseInt(JOptionPane.showInputDialog("Upiši broj koji će se tražiti"));
		for(int i = 0;i < niz5.length;i++) {
			if(niz5[i] == tb1) {
				System.out.println("Index broja " + tb1 + " je " + i);
			}
		}*/
		
		//#7
		/*int[] niz6 = {25, 14, 56, 15, 36, 56, 77, 15, 29, 49};
		int tb2 = Integer.parseInt(JOptionPane.showInputDialog("Upiši broj koji će se ukloniti"));
		int t = 0;
		for(int i = 0;i < niz6.length;i++) {
			if(niz6[i] == tb2) {
				t++;
			}
		}
		int[] niz7 = new int [niz6.length - t];
		int br = 0;
		for(int i = 0;i < niz6.length;i++) {
			if(niz6[i] != tb2) {
				niz7[br] = niz6[i];
				br++;
			}
		}
		System.out.println(Arrays.toString(niz6));
		System.out.println(Arrays.toString(niz7));*/
		
		//#8
	/*	int[] niz8 = {25, 14, 56, 15, 36, 56, 77, 15, 29, 49};
		int[] niz9 = new int [niz8.length];
		for(int i = 0;i < niz8.length;i++) {
			niz9[i] = niz8[i];
		}
		System.out.println(Arrays.toString(niz8));
		System.out.println(Arrays.toString(niz9));*/
		
		//#9
	/*	int[] niz10 = {25, 14, 56, 15, 36, 56, 77, 15, 29, 49};
		int poz = 2;
		int brojPoz = 5;
		for(int i = 9;i > 2;i--) {
			niz10[i] = niz10[i-1];
		}
		niz10[2] = 5;
		System.out.println(Arrays.toString(niz10));*/
		
		//#10
		/*int broj4 = Integer.parseInt(JOptionPane.showInputDialog("Upiši duljinu niza"));
		int[] niz11 = new int[broj4];
		for(int i = 0;i < niz11.length;i++) {
			niz11[i] = Integer.parseInt(JOptionPane.showInputDialog("Upiši broj"));
		}
		for(int i = 0;i < niz11.length;i++) {
			for(int j = 0;j < niz11.length;j++) {
				if(niz11[i] < niz11[j]) {
					int temp = niz11[j];
					niz11[j] = niz11[i];
					niz11[i] = temp;
				}
			}
		}
		System.out.println("Najmanji broj u nizu je " + niz11[0]);
		System.out.println("Najveći broj u nizu je " + niz11[niz11.length-1]);
		*/
		
		//#11
	/*  int[] niz12 = {5,2,7,9,6,3,4,5,2,1,0,3,4,5,3};
		int temp1;
		int zadnji = niz12.length-1;
		for(int i = 0;i < niz12.length/2;i++) {
			temp1 = niz12[i];
			niz12[i] = niz12[zadnji - i];
			niz12[zadnji - i] = temp1;
		}
		System.out.println(Arrays.toString(niz12));*/
		
		//#12
		int[] niz13 = {5,2,7,7,5,3,4,10,1,11,12,13,3,3,3};
		for(int i = 0;i < niz13.length-1;i++) {
			for(int j = 0+i;j < niz13.length;j++) {
				if(niz13[i] == niz13[j] && i !=j) {
					System.out.println(niz13[j]);
				}
			}
		}
	}
}
