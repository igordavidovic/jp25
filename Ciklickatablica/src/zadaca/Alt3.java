package zadaca;

import java.util.Arrays;

import javax.swing.JOptionPane;

public class Alt3 {
	public static void main(String[] args) {
		//U smjeru kazaljke na satu
		int rijedak = Integer.parseInt(JOptionPane.showInputDialog("Upiši broj redaka koji će biti u tablici"));
		int stupac = Integer.parseInt(JOptionPane.showInputDialog("Upiši broj stupaca koji će biti u tablici"));
		int[][] niz = new int [rijedak][stupac];
		int d = 1;
		int proizvod = rijedak * stupac;
		vanjska:
		for(int i = 0;i < rijedak;i++) {
		for(int y = 0 + i ; y <= stupac - (1+i);y++) {
			if(d > proizvod) {
			break vanjska;
			}	
			niz[0+i][y] = d;
			d++;			
				}
		for(int x = 1 + i;x < rijedak - (1+i);x++) {
			if(d > proizvod) {
				break vanjska;
			}		
				niz[x][stupac - (1+i)] = d;
				d++;
			}
		
		for(int y = stupac - (1+i);y > (0 + i);y--) {
			if(d > proizvod) {
				break vanjska;
			}		
				niz[rijedak - (1+i)][y] = d;
				d++;
		}
		for(int x = rijedak - (1+i);x > (0 + i) ;x--) {
			if(d > proizvod) {
				break vanjska;
			}	
				niz[x][(0 + i)] = d;
				d++;
		}
	}

		for(int i = 0; i < rijedak;i++){
			System.out.println(Arrays.toString(niz[i]));
		}
	
	}
}
