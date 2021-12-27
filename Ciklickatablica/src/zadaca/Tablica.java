package zadaca;

import java.util.Arrays;

import javax.swing.JOptionPane;

public class Tablica {
	public static void main(String[] args) {
		int redak = Integer.parseInt(JOptionPane.showInputDialog("Upiši broj redaka koji će biti u tablici"));
		int redak1 = redak - 1;
		int stupac = Integer.parseInt(JOptionPane.showInputDialog("Upiši broj stupaca koji će biti u tablici"));
		int stupac1 = stupac - 1;
		int[][] niz = new int [redak][stupac];
		
		int d = 1;

		for(int y = stupac - 1; y >= 0;y--) {
				niz[redak1][y] = d;
				d++;			
			}

		for(int x = redak - 2;x >= 0;x--) {
				niz[x][0] = d;
				d++;
			}
		
		for(int x = 1;x < stupac;x++) {
				niz[0][x] = d;
				d++;
			
		}
		for(int x = 1;x < redak - 1 ;x++) {
				niz[x][stupac - 1] = d;
				d++;
		}
		// prva četiri koja valjaju
		// ova moram još
		/*for(int i = stupac - 2;i > 0;i--) {
			niz[redak - 2][i] = d;
			d++;
		}
		for(int i = redak - 3;i > 0;i--) {
			niz[i][1] = d;
			d++;
		}
		for(int i = stupac - (stupac - 2);i < stupac - 1;i++) { //stupac - 2 // redak - 3  
			niz[1][i] = d;
			d++;
		}*/
		
		
		
		
		
		
		for(int i = 0; i < redak;i++){
			System.out.println(Arrays.toString(niz[i]));
		}
	}
}
