package vjezba;

import java.util.Arrays;

import javax.swing.JOptionPane;


public class Vjezba02 {
	public static void main(String[] args) {
		// #52
		int[] niz = new int [3];
		
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
		
		// #55
		int sekunde = Integer.parseInt(JOptionPane.showInputDialog("Upiši broj sekundi \nMax : 86399"));
		
		int sati = sekunde / 3600;
		
		int sekunde1 = sekunde - (sati * 3600);
		
		int minute = sekunde1 / 60;
		
		int sekunde2 = sekunde1 - (minute * 60);
		
		System.out.println(sati + " : " + minute + " : " + sekunde2);
		
		//#56
		int x = Integer.parseInt(JOptionPane.showInputDialog("x ≤ i ≤ y, i mod p = 0\nUpiši x"));
		int y = Integer.parseInt(JOptionPane.showInputDialog("x ≤ i ≤ y, i mod p = 0\nUpiši y"));
		int p = Integer.parseInt(JOptionPane.showInputDialog("x ≤ i ≤ y, i mod p = 0\nUpiši p"));
		int suma = 0;
		
		for(int i = x;i <= y;i++) {
			if(i % p == 0) {
				suma++;
			}
		}
		System.out.println(suma);
		
		//#57
		
		int broj2 = Integer.parseInt(JOptionPane.showInputDialog("Upiši broj"));
		int faktori = 0;
		for(int i = 1;i <=broj2;i++) {
			if(broj2 % i ==0) {
				faktori++;
			}
		}
		System.out.println(faktori);
		
		//#62
		/*int[] niz3 = new int[3];
		
		for(int i = 0;i<niz3.length;i++) {
			niz3[i] = Integer.parseInt(JOptionPane.showInputDialog("Upiši broj"));
		}
		
		if(niz3[0] >= 20 || niz3[1] >= 20 || niz3[2] >= 20) {
			if(niz3[0] < (niz3[1] - niz3[2] ) || niz3[0] < (niz3[2] - niz3[1])) {
				System.out.println("True " + niz3[0]);
			}
			
			if(niz3[1] < (niz3[2] - niz3[0] ) || niz3[1] < (niz3[0] - niz3[2])) {
				System.out.println("True " + niz3[1]);
			}
			
			if(niz3[2] < (niz3[1] - niz3[0] ) || niz3[2] < (niz3[0] - niz3[1])) {
				System.out.println("True " + niz3[2]);
			}
			
		}
		*/
		//#63
		int broj4 = Integer.parseInt(JOptionPane.showInputDialog("Upiši broj"));
		int broj5 = Integer.parseInt(JOptionPane.showInputDialog("Upiši broj"));
		
		if(broj4 == broj5) {
			System.out.println("0");
		}
		
		if(broj4 < broj5 && (broj4 % 6 == broj5 % 6) ) {
			System.out.println(broj4);
		}else if(broj5 < broj4 && (broj5 % 6 == broj4 % 6)) {
			System.out.println(broj5);
		}else if(broj4 > broj5) {
			System.out.println(broj4);
		}else if(broj5 > broj4) {
			System.out.println(broj5);
		}
		
		//#64
		
		int broj6 = Integer.parseInt(JOptionPane.showInputDialog("Upiši broj između 25 i 75"));
		int broj7 = Integer.parseInt(JOptionPane.showInputDialog("Upiši broj između 25 i 75"));
		if((broj6 <=75 && broj6 >=25) && (broj7 <= 75 && broj7>=25)) {
		while((broj6 != 0 || broj7 !=0) && broj6 != broj7) {
			int b6 = broj6 % 10;
			int b7 = broj7 % 10;
			broj6 /= 10;
			broj7 /= 10;
			
			if(b6 == b7) {
				System.out.println("True");
			}
		}
	}
		
	//#65
		int broj8 = Integer.parseInt(JOptionPane.showInputDialog("Upiši broj"));
		int broj9 = Integer.parseInt(JOptionPane.showInputDialog("Upiši broj"));
		
		int ostatak = broj8 - broj9 * (broj8 / broj9);
		
		System.out.println(ostatak); 
		//#74
		int[] niz4 = {10,20,-10,40,50,30,20,10,15,25,25,24,54,34,10}; 
		if(niz4[0] == 10 || niz4[niz4.length-1] == 10) {
			System.out.println("True");
		}
		//#75
		int[] niz5 = {20,30,40,50,60,70,80,90,1000};
		
		if(niz5[0] == niz5[niz5.length-1]) {
			System.out.println("True");
		}else {
			System.out.println("False");
		}
		
		//#76
		int[] niz6 = {20,30,40,50,60,70,80,80,70,60};
		int[] niz7 = {20,30,40,40,40,45,0,40,30,30,30};
		
		if((niz6[0] == niz7[0]) || (niz6[niz6.length-1] == niz7[niz7.length-1])) {
			System.out.println("True");
		}else {
			System.out.println("False");
		}
		
		//#77
		int [] niz8 = new int[3];
		int [] niz9 = new int [3];
		int [] niz10 = new int [2];
		
		for(int i = 0;i < niz8.length;i++) {
			niz8[i] = Integer.parseInt(JOptionPane.showInputDialog("Upiši broj"));
		}
		for(int i = 0;i< niz9.length;i++) {
			niz9[i] = Integer.parseInt(JOptionPane.showInputDialog("Upiši broj"));
		}
		System.out.println(Arrays.toString(niz8));
		System.out.println(Arrays.toString(niz9));
		
		niz10[0] = niz8[0];
		niz10[niz10.length-1] = niz9[niz9.length-1];
		
		System.out.println(Arrays.toString(niz10)); 
		//#78
		int[] niz11 = {5,7};
		if((niz11[0] == 4 || niz11[0] == 7) || (niz11[niz11.length-1] == 4 || niz11[niz11.length-1] == 7)) {
			System.out.println("True");
		}else {
			System.out.println("False");
		}
		//#79
		int[] niz12 = {20,30,40};
		System.out.println(Arrays.toString(niz12));
		int[] niz13 = {niz12[1],niz12[2],niz12[0]};
		System.out.println(Arrays.toString(niz13));
		//#80
		int[] niz14 = {50,60,70};
		if(niz14[0] > niz14[2]) {
			System.out.println(niz14[0]);
		}else if(niz14[2] > niz14[0]) {
			System.out.println(niz14[2]);
		}else {
			System.out.println(niz14[0] + " = " + niz14[2]);
		}
		
}
}
