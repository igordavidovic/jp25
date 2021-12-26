package vjezba;

import java.util.Arrays;

import javax.swing.JOptionPane;

public class Vjezba03 {
	public static void main(String[] args) {
		//#81
	/*	int[] niz = new int [3];
		
		for(int i = 0;i<niz.length;i++) {
			niz[i] = Integer.parseInt(JOptionPane.showInputDialog("Upiši broj"));
		}
		
		int[] swniz = new int[3];
		swniz[0] = niz[niz.length-1];
		swniz[1] = niz[1];
		swniz[2] = niz[0];
		
		System.out.println(Arrays.toString(niz));
		System.out.println(Arrays.toString(swniz));*/
		
		//#82
	/*	int[] niz2 = new int [5];
		for(int i = 0;i<niz2.length;i++) {
			niz2[i] = Integer.parseInt(JOptionPane.showInputDialog("Upiši broj"));
		}
		
		if(niz2[0] >= niz2[1] && niz2[0] >= niz2[2] && niz2[0] >= niz2[3] && niz2[0] >= niz2[4]) {
			System.out.println(niz2[0]);
		}else if(niz2[1] >= niz2[0] && niz2[1] >= niz2[2] && niz2[1] >= niz2[3] && niz2[1] >= niz2[4]) {
			System.out.println(niz2[1]);
		}else if(niz2[2] >= niz2[0] && niz2[2] >= niz2[1] && niz2[2] >= niz2[3] && niz2[2] >= niz2[4]){
			System.out.println(niz2[2]);
		}else if(niz2[3] >= niz2[0] && niz2[3] >= niz2[1] && niz2[3] >= niz2[2] && niz2[3] >= niz2[4]) {
			System.out.println(niz2[3]);
		}else {
			System.out.println(niz2[4]);
		}*/
		
		//#83
		
	/*	int[] niz3 = new int [4];
		int[] niz4 = new int [4];
		
		for(int i = 0;i < niz3.length;i++) {
			niz3[i] = Integer.parseInt(JOptionPane.showInputDialog("Upiši broj"));
		}
		for(int i = 0;i < niz4.length;i++) {
			niz4[i] = Integer.parseInt(JOptionPane.showInputDialog("Upiši broj"));
		}
		System.out.println("Rezultati" + " = " + niz3[0] * niz4[0] + " " + niz3[1] * niz4[1] + " " + niz3[2] * niz4[2] + " " + niz3[3] * niz4[3] );
		*/
		
		//#86
	/*	int n = Integer.parseInt(JOptionPane.showInputDialog("Upiši broj"));
		vanjska0:
		while(n != 1) {
			if(n == 0) {
				System.out.println("Broj je nula upiši drugi broj");
				break vanjska0;
			}else if(!(n % 2 == 0)) {
				n *= 3;
				n++;
			}else {
				n /= 2;
			}
			System.out.println(n);
		}
		*/
		
		//#92
	/*	int a = Integer.parseInt(JOptionPane.showInputDialog("Upiši koliko će niz biti dug"));
		int[] niz5 = new int [a];
		int parni = 0;
		int neparni = 0;
		for(int i = 0;i < niz5.length;i++) {
			niz5[i] = Integer.parseInt(JOptionPane.showInputDialog("Upiši broj"));
			if(niz5[i] == 0) {
				continue;
			}else if(niz5[i] % 2 == 0) {
				parni++;
			}else {
				neparni++;
			}
		}
		System.out.println("Broj parnih brojeva je : " + parni);
		System.out.println("Broj neparnih brojeva je : " + neparni);*/
		
		//#93
	/*	int b = Integer.parseInt(JOptionPane.showInputDialog("Upiši koliko će niz biti dug"));
		
		int[] niz6 = new int [b];
		boolean prv1 = false;
		boolean prv2 = false;
		for(int i = 0;i < niz6.length;i++) {
			niz6[i] = Integer.parseInt(JOptionPane.showInputDialog("Upiši broj"));
		}
		for(int i = 0;i < niz6.length;i++) {
			if(niz6[i] == 10 && niz6[i+1] == 10) {
				prv1 = true;
			}else if(niz6[i] == 20 && niz6[i+1] == 20) {
				prv2 = true;
			}
		}
		if(prv1 == true && prv2 == true) {
			System.out.println();
		}else {
			System.out.println("Broj 10 se nalazi jedan pokraj drugoga u nizu: " + prv1);
			System.out.println("Broj 20 se nalazi jedan pokraj drugoga u nizu: " + prv2);
		}
		*/
		
		//#94
	/*	int c = Integer.parseInt(JOptionPane.showInputDialog("Upiši koliko dug će biti niz"));
		int[] niz7 = new int [c];
		int[] niz8 = new int [c];
		int d = 0;
		for(int i = 0;i < niz7.length;i++) {
			niz7[i] = Integer.parseInt(JOptionPane.showInputDialog("Upiši broj"));
			if(!(niz7[i] % 2 == 0)) {
				niz8[d] = niz7[i];
				d++;
			}else {
				continue;
			}
		}
		
		for(int i = 0;i<niz7.length;i++) {
			if(niz7[i] % 2 == 0) {
				niz8[d] = niz7[i];
				d++;
			}
		}
		System.out.println(Arrays.toString(niz7));
		System.out.println(Arrays.toString(niz8));*/
		
		//#96
	/*	int cc = Integer.parseInt(JOptionPane.showInputDialog("Upiši koliko dug će biti niz"));
		int brojac = 0;
		int[] niz9 = new int [cc];
		boolean prv3 = false;
		boolean prv4 = false;
		for(int i = 0;i < niz9.length;i++) {
			niz9[i] = Integer.parseInt(JOptionPane.showInputDialog("Upiši broj"));
		}
		vanjska:
		for(int i = 0;i < niz9.length;i++) {
			if(niz9[i] == 10) {
				prv3 = true;
				brojac = i;
				break vanjska;
			}
		}
		vanjska1:
		for(int i = brojac;i<niz9.length;i++) {
			if(niz9[i] == 20) {
				prv4 = true;
				break vanjska1;
			}
		}
		if(prv3 == true && prv4 == true) {
			System.out.println("True");
		}else {
			System.out.println("False");
		}
		*/
		
		//#97
		int ccc = Integer.parseInt(JOptionPane.showInputDialog("Upiši koliko dug će biti niz"));
		int izbroj = Integer.parseInt(JOptionPane.showInputDialog("Upiši broj koji tražiš"));
		int[] niz10 = new int [ccc];
		boolean prv5 = false;
		for(int i = 0;i < niz10.length;i++) {
			niz10[i] = Integer.parseInt(JOptionPane.showInputDialog("Upiši broj"));
		}
		vanjska2:
		for(int i = 0;i < niz10.length;i++) {
			if((niz10[i] == izbroj && niz10[i+1] == izbroj) || (niz10[i] == izbroj && niz10[i+2] == izbroj)) {
				prv5 = true;
				break vanjska2;
			}
		}
		System.out.println(prv5);
	}
}

