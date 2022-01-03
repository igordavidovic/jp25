package vjezba;

import java.util.Arrays;

import javax.swing.JOptionPane;

public class Vjezba07 {
	public static void main(String[] args) {
		//#152
		/*int a = Integer.parseInt(JOptionPane.showInputDialog("Upiši broj"));
		int b = Integer.parseInt(JOptionPane.showInputDialog("Upiši broj"));
		int c = Integer.parseInt(JOptionPane.showInputDialog("Upiši broj"));
		int d = Integer.parseInt(JOptionPane.showInputDialog("Upiši broj"));
		
		if(a == b && b == c && c == d) {
			System.out.println("Brojevi su jednaki");
		}else {
			System.out.println("Brojevi nisu jednaki");
		}*/
		
		//#153
	/*	double e = Double.parseDouble(JOptionPane.showInputDialog("Upiši broj"));
		double f = Double.parseDouble(JOptionPane.showInputDialog("Upiši broj"));
		
		if((e > 0 && e < 1) && (f > 0 && f < 1)) {
			System.out.println("True");
		}else {
			System.out.println("False");
		}*/
		
		//#154
	/*	boolean[][] niz4 = {{true,false,true},
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
		}*/
		
		//#155
	/*	int[][] niz5 = {
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
		}*/
		
		//#162
	/*	int[] niz7 = {1,4,17,7,25,3,100};
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
		*/
	/*	int[] niz8 = {-2, 3, 4, -1, -3, 1, 2, -4, 0};
		
		for(int i = niz8.length-1;i >= 0;i--) {
			for(int j = 1;j <= i;j++) {
				if(niz8[j - 1] > niz8[j]) {
					int temp = niz8[j-1];
					niz8[j-1]=niz8[j];
					niz8[j] = temp;
				}
			}
		}
		System.out.println(Arrays.toString(niz8));*/
		
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
	}
}


