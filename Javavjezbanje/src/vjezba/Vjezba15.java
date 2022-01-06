package vjezba;

import java.util.Arrays;

import javax.swing.JOptionPane;

public class Vjezba15 {
	public static void main(String[] args) {
		//#17
	/*	int [] niz = {1,3,5,0,73,42,5,6,86,865,45,234,123,534,546,765,78,0,1,2,3,5,5,2,4};
		for(int i = 0;i < niz.length;i++) {
			for(int j = 0;j < niz.length;j++) {
				if(niz[i] < niz[j]) {
					int temp = niz[j];
					niz[j] = niz[i];
					niz[i] = temp;
				}
			}
		}
		int br = 1;
		while(niz[niz.length-br] == niz[niz.length-1]) {
			br++;
		}
		System.out.println((niz[niz.length-br]));
		*/
		//#18
	/*	int[] niz2 = {-1, 4, 0, 2, 7, -3,-3};
		for(int i = 0;i < niz2.length;i++) {
			for(int j = 0;j < niz2.length;j++) {
				if(niz2[i] < niz2[j]) {
					int temp = niz2[j];
					niz2[j] = niz2[i];
					niz2[i] = temp;
				}
			}
		}
		int br1 = 1;
		while(niz2[br1] == niz2[0]) {
			br1++;
		}
		System.out.println(niz2[br1]);*/
		//#19
	/*	int broj = Integer.parseInt(JOptionPane.showInputDialog("Upiši broj rijedaka"));
		int broj1 = Integer.parseInt(JOptionPane.showInputDialog("Upiši broj stupaca"));
		
		int[][] niz3 = new int[broj][broj1];
		int[][] niz4 = new int[broj][broj1];
		
		for(int i = 0;i < niz3.length;i++) {
			for(int j = 0;j < niz3[0].length;j++) {
				niz3[i][j] = Integer.parseInt(JOptionPane.showInputDialog("Upiši broj"));
			}
		}
		for(int i = 0;i < niz4.length;i++) {
			for(int j = 0;j < niz4[0].length;j++) {
				niz4[i][j] = Integer.parseInt(JOptionPane.showInputDialog("Upiši broj"));
			}
		}
		for(int i = 0;i < broj;i++) {
			for(int j = 0;j < broj1;j++) {
				System.out.println(niz3[i][j] + niz4[i][j]);
			}
		}*/
		
		//#22
	/*	int[] niz5 = {2, 7, 4, -5, 11, 5, 20};
		int sn = Integer.parseInt(JOptionPane.showInputDialog("Upiši broj koji se traži"));
		for(int i = 0;i < niz5.length;i++) {
			for(int j = i + 1;j < niz5.length;j++) {
				if(niz5[i] + niz5[j] == sn) {
					System.out.println(niz5[i] + " + " + niz5[j] + " = " + sn);
				}
			}
		}*/
		//#23
	/*	int[] niz6 = {2, 7, 4, -5, 11, 5, 20};
		int[] niz7 = {2, 7, 4, -5, 11, 5,3};
		int prov = 0;
		for(int i = 0;i < niz6.length;i++) {
			if(niz6[i] == niz7[i]) {
				prov++;
			}
		}
		if(prov == niz6.length) {
			System.out.println("Nizovi su jednaki");
		}else {
			System.out.println("Nizovi nisu jednaki");
		}*/
		
		//#24
		/*int[] niz8 = {1,2,4,3,5,7,8,9,10};
		for(int i = 0;i < niz8.length;i++) {
			for(int j = 0;j<niz8.length;j++) {
				if(niz8[i] < niz8[j]) {
					int temp = niz8[j];
					niz8[j] = niz8[i];
					niz8[i] = temp;
				}
			}
		}
		for(int i = 1;i < niz8.length;i++) {
			if(niz8[i] != (niz8[i-1] + 1)) {
				System.out.println(niz8[i-1] + 1);
				break;
			}
		}*/
		//#25
	/*	int[] niz9 = {2, 4, 8,14,40,45};
		int[] niz10 = {2, 3, 4, 8, 10, 16,45};
		int[] niz11 = {4, 8, 14, 40,45};
		
		int a = 0;
		int b = 0;
		int c = 0;
		while(a < niz9.length && b < niz10.length && c < niz11.length) {
			if(niz9[a] == niz10[b] && niz10[b] == niz11[c]) {
			System.out.println(niz9[a]);	
			a++;
			b++;
			c++;
			}else if(niz9[a] < niz10[b]) {
				a++;
			}else if(niz10[b] < niz11[c]) {
				b++;
			}else {
				c++;
			}
		}*/
		//#26
	/*	int[] niz12 = {0,0,1,0,3,0,5,0,6,8,7,0,0,2};
		int d = 0;
		for(int i = 0;i < niz12.length;i++) {
			for(int j = 0;j < niz12.length;j++) {
				if(niz12[i] != 0 && niz12[j] == 0) {
					int temp = niz12[i];
					niz12[i] = niz12[j];
					niz12[j] = temp;
				}
			}
		}
		System.out.println(Arrays.toString(niz12));*/
		//#27
		int broj2 = Integer.parseInt(JOptionPane.showInputDialog("Upiši duljinu niza"));
		int [] niz13 = new int[broj2];
		int sumap = 0;
		int suman = 0;
		
		for(int i = 0;i < niz13.length;i++) {
			niz13[i] = Integer.parseInt(JOptionPane.showInputDialog("Upiši broj"));
			if(niz13[i] % 2 == 0) {
				sumap++;
			}else {
				suman++;
			}
		}
		System.out.println("Broj parnih je : " + sumap + "\n" + "Broj neparnih je : " + suman);
	}
}
