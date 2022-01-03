package vjezba;

import java.util.Arrays;

import javax.swing.JOptionPane;

public class Vjezba07 {
	public static void main(String[] args) {
		//#152
		int a = Integer.parseInt(JOptionPane.showInputDialog("Upiši broj"));
		int b = Integer.parseInt(JOptionPane.showInputDialog("Upiši broj"));
		int c = Integer.parseInt(JOptionPane.showInputDialog("Upiši broj"));
		int t = Integer.parseInt(JOptionPane.showInputDialog("Upiši broj"));
		
		if(a == b && b == c && c == t) {
			System.out.println("Brojevi su jednaki");
		}else {
			System.out.println("Brojevi nisu jednaki");
		}
		
		//#153
		double e = Double.parseDouble(JOptionPane.showInputDialog("Upiši broj"));
		double f = Double.parseDouble(JOptionPane.showInputDialog("Upiši broj"));
		
		if((e > 0 && e < 1) && (f > 0 && f < 1)) {
			System.out.println("True");
		}else {
			System.out.println("False");
		}
		
		//#154
		boolean[][] niz4 = {{true,false,true},
							{false,true,false}};
		
		for(int i = 0;i < 2;i++) {
			for(int j = 0;j < 3;j++) {
				if(niz4[i][j] == true) {
					System.out.print("t ");
				}else {
					System.out.print("f ");
				}
			}
			System.out.println();
		}
		
		//#155
		int[][] niz5 = {
				{10,20,30},
				{40,50,60}
		};
		int[][] niz6 = new int [niz5[0].length][niz5.length];
		
		for(int i = 0;i < niz6.length;i++) {
			for(int j = 0;j < niz6[0].length;j++) {
				niz6[i][j] = niz5[j][i];
			}
		}
		for(int i = 0;i < niz6.length;i++) {
			System.out.println(Arrays.toString(niz6[i]));
		}
		
		//#162
		int[] niz7 = {1,4,17,7,25,3,100};
		int sv = 0;
		int suma = 0;
		for(int i = 0;i < niz7.length;i++) {
			suma += niz7[i];
		}
		sv = suma / niz7.length;
		for(int i = 0;i < niz7.length;i++) {
			if(niz7[i] > sv) {
				System.out.println(niz7[i]);
			}
		}
		
		int[] niz8 = {-2, 3, 4, -1, -3, 1, 2, -4, 0};
		
		for(int i = niz8.length-1;i >= 0;i--) {
			for(int j = 1;j <= i;j++) {
				if(niz8[j - 1] > niz8[j]) {
					int temp = niz8[j-1];
					niz8[j-1]=niz8[j];
					niz8[j] = temp;
				}
			}
		}
		System.out.println(Arrays.toString(niz8));
		
		//#167
		int[] niz9 = {0,3,4,0,1,2,5,0};
		int brojac = 0;
		for(int i = 0;i < niz9.length;i++) {
			if(niz9[i] == 0) {
				brojac++;
			}
		}
		for(int j = 1;j <= brojac;j++) {
		for(int i = 1;i < niz9.length;i++) {
			if(niz9[i-1] == 0 && niz9[i] != 0) {
				int temp = niz9[i-1];
				niz9[i-1] = niz9[i];
				niz9[i] = temp;
			}
		}
	}
		System.out.println(Arrays.toString(niz9));
		
		//#170 Radi na ovom primjeru ali trebam pokušati bolje napraviti
		int[] niz10 = {1,1,2,3,3,4,5,2,4,5,6,7,8};
		int brojac1 = 0;
		int brojac2 = 0;
		for(int i = 1;i < niz10.length;i++) {
			if(niz10[i-1] <= niz10[i]) {
				brojac1++;
			}else {
				brojac1++;
				break;
			}
		}
		System.out.println(brojac1);
		for(int i = brojac1;i < niz10.length;i++) {
			if(niz10[i-1] <= niz10[i]) {
				brojac2++;
			}else {
				continue;
			}
		}
		System.out.println(brojac2);
		//#172
		int[] niz11 = {1,2,3,4,5,6,7,8};
		int[] niz12 = {1,4,8};
		System.out.println("Brojevi koji su manji od 1: ");
		for(int i = 0;i < niz11.length;i++) {
			if(niz11[i] < niz12[0]) {
				System.out.print(niz11[i] + " ");
			}
		}
		System.out.println();
		System.out.println("Brojevi koji su manji od 4: ");
		for(int i = 0;i < niz11.length;i++) {
			if(niz11[i] < niz12[1]) {
				System.out.print(niz11[i] + " ");
			}
		}
		System.out.println();
		System.out.println("Brojevi koji su manji od 8: ");
		for(int i = 0;i < niz11.length;i++) {
			if(niz11[i] < niz12[2]) {
				System.out.print(niz11[i] + " ");
			}
		}
		//#173 - Ne valja
		int[] niz13 = {1,2,3,4,5,6,7,8,8};
		int k = 3;
		for(int j = k;j < niz13.length;j++) {
			int median = 0;
			for(int i = j -1;i >= j - k;i--) {
				if(k % 2 == 0) {
					median = (niz13[j / 2] + niz13[(j / 2) - 1]) / 2;
				}else {
					median = niz13[j/2];
				}
			}
			System.out.println(median);
		}
		
		//#176
		int[] niz14 = {7,2,4,1,3,5,6,8,2,10};
		for(int j = 0;j < niz14.length;j++) {
		for(int i = 1;i < niz14.length;i++) {
			if(niz14[i - 1] % 2 != 0) {
				int temp = niz14[i - 1];
				niz14[i - 1] = niz14[i];
				niz14[i] = temp;
			}
		}
	}
		System.out.println(Arrays.toString(niz14));
		
		//#183
		int broj = Integer.parseInt(JOptionPane.showInputDialog("Upiši broj"));
		while (broj > 9) {
   		int suma1 = 0;
   		while (broj != 0) {
    	suma1 += broj % 10;
    	broj /= 10;
   		}
   		broj = suma1;
  	}
	
		//#191
		
		//#194
		int broj1 = Integer.parseInt(JOptionPane.showInputDialog("Upiši koliko će rijedaka matrica imati"));
		int broj2 = Integer.parseInt(JOptionPane.showInputDialog("Upiši koliko će stupaca matrica imati"));
		int[][] niz15 = new int [broj1][broj2];
		int trazeniBroj = Integer.parseInt(JOptionPane.showInputDialog("Upiši broj koji će se tražiti"));
		for(int i = 0;i < broj1;i++) {
			for(int j = 0;j < broj2;j++) {
				niz15[i][j] = Integer.parseInt(JOptionPane.showInputDialog("Upiši broj"));

			}
		}
		for(int i = 0;i < broj1;i++) {
			for(int j = 0;j < broj2;j++) {
				if(niz15[i][j] == trazeniBroj) {
					System.out.println("(" + i + "," + j + ")");
				}
			}
		}
		//#195
		int broj3 = Integer.parseInt(JOptionPane.showInputDialog("Upiši broj"));
		int broj4 = Integer.parseInt(JOptionPane.showInputDialog("Upiši broj"));
		int broj5 = Integer.parseInt(JOptionPane.showInputDialog("Upiši broj"));
		
		if(broj3 + broj4 > broj5 && broj3 + broj5 > broj4 && broj5 + broj4 > broj3) {
			System.out.println("True");
		}else {
			System.out.println("False");
		}
		
		
		//#196
		int broj6 = Integer.parseInt(JOptionPane.showInputDialog("Upiši broj"));
		int broj7 = Integer.parseInt(JOptionPane.showInputDialog("Upiši broj"));
		int[][] niz16 = new int[broj6][broj7];
		int proizvod = broj6 * broj7;
		int d = 1;
		vanjska:
		for(int i = 0;i < broj6;i++) {
			for(int y = 0 + i;y <= broj7 - (1+i);y++) {
				if(d > proizvod) {
					break vanjska;
				}
				niz16[0+i][y] = d;
				d++;
			}
			for(int x = (1 + i);x < broj6 - (1+i);x++) {
				if(d > proizvod) {
					break vanjska;
				}
				niz16[x][broj7-(1+i)] = d;
				d++;
			}
			for(int y = broj7 - (1+i);y > (0+i);y--) {
				if(d > proizvod) {
					break vanjska;
				}
				niz16[broj6-(1+i)][y] = d;
				d++;
			}
			for(int x = broj6 - (1+i);x >= (1+i);x--) {
				if(d > proizvod) {
					break vanjska;
				}
				niz16[x][(0+i)] = d;
				d++;
			}
		}
		for(int i = 0;i < broj6;i++) {
			System.out.println(Arrays.toString(niz16[i]));
		}
		
		
	}
}


