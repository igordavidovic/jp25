package zadaca;

import java.util.Arrays;

import javax.swing.JOptionPane;

public class Tablica {
	public static void main(String[] args) {
		int redak = Integer.parseInt(JOptionPane.showInputDialog("Upiši broj redaka koji će biti u tablici"));
		int stupac = Integer.parseInt(JOptionPane.showInputDialog("Upiši broj stupaca koji će biti u tablici"));
		int[][] niz = new int [redak][stupac];
		int y1 = 0;
		int x1 = 0;
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
		//for int i = 1 dodaje se 1 na sve ove 

	/*	for(int y = stupac - 2;y > 0;y--) {
			if(d > proizvod) {
				break;
			}
			niz[redak - 2][y] = d;
			d++;
		}
		for(int x = redak - 3;x > 1;x--) {
			if(d > proizvod) {
				break;
			}
			niz[x][1] = d;
			d++;
		}
		for(int y = 1;y < stupac - 1;y++) {
			if(d > proizvod) {
				break;
			}
			niz[1][y] = d;
			d++;
		}
		for(int x = 2;x< redak - 2;x++) {
			if(d > proizvod) {
				break;
			}
			niz[x][stupac - 2] = d;
			d++;
		}
	
		//probati sa while i dve nove varijable
		// prva četiri koja valjaju
		// ova moram još
		for(int i = stupac - 2;i > 0;i--) {
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
