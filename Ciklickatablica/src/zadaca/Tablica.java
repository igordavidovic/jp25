package zadaca;

import java.util.Arrays;

import javax.swing.JOptionPane;

public class Tablica {
	public static void main(String[] args) {
		int redak = Integer.parseInt(JOptionPane.showInputDialog("Upiši broj redaka koji će biti u tablici"));
		int stupac = Integer.parseInt(JOptionPane.showInputDialog("Upiši broj stupaca koji će biti u tablici"));
		int[][] niz = new int [redak][stupac];
		int d = 1;
		int proizvod = redak * stupac;
		vanjska:
		for(int i = 0;i < redak;i++) {
		for(int y = stupac - (1+i) ; y >= (0+i);y--) {
			if(d > proizvod) {
			break vanjska;
			}	
			niz[redak - (1+i)][y] = d;
			d++;			
				}
		for(int x = redak - (2+i);x > (0+i);x--) {
			if(d > proizvod) {
				break vanjska;
			}		
				niz[x][(0+i)] = d;
				d++;
			}
		
		for(int y = (0+i);y < stupac - i;y++) {
			if(d > proizvod) {
				break vanjska;
			}		
				niz[(0+i)][y] = d;
				d++;
		}
		for(int x = (1+i);x < redak - (1+i) ;x++) {
			if(d > proizvod) {
				break vanjska;
			}	
				niz[x][stupac - (1+i)] = d;
				d++;
		}
	}

		for(int i = 0; i < redak;i++){
			System.out.println(Arrays.toString(niz[i]));
		}
	}
}
