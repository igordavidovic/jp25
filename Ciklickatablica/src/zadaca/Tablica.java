package zadaca;

import java.util.Arrays;

import javax.swing.JOptionPane;

public class Tablica {
	public static void main(String[] args) {
		int redak = Integer.parseInt(JOptionPane.showInputDialog("Upiši broj redaka koji će biti u tablici"));
		
		int stupac = Integer.parseInt(JOptionPane.showInputDialog("Upiši broj stupaca koji će biti u tablici"));
		
		int[][] niz = new int [redak][stupac];
		
		int zbroj = redak * stupac;
		int zbroj1 = redak + stupac;
		int zbroj2 = zbroj1 + redak;
		int zbroj3 = zbroj2 + stupac;
		int d = 1;
		for(int x = redak - 1;x >= 0;x--) {
			for(int y = stupac - 1; y >= 0;y--) {
				if(d <= x + 1) {
				niz[x][y] = d;
				d++;
				}
				
			}
				
		}
		for(int x = redak - 2;x >= 0;x--) {
			if(d < zbroj1) {
				niz[x][0] = d;
				d++;
			}
		}
		for(int x = 1;x < stupac;x++) {
			if(d < zbroj2) {
				niz[0][x] = d;
				d++;
			}
		}
		for(int x = 1;x < redak - 1;x++) {
			if(d < zbroj3) {
				niz[x][stupac - 1] = d;
				d++;
			}
		}
		
		
		
		
		for(int i = 0; i < redak;i++){
			System.out.println(Arrays.toString(niz[i]));
		}
	}
}
