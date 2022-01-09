package zadaca;

import java.util.Arrays;

import javax.swing.JOptionPane;

public class Tablica {
	public static void main(String[] args) {
		int rijedak; 
		int stupac; 
		int d;
		int proizvod;
		while(true) {
			rijedak = Integer.parseInt(JOptionPane.showInputDialog("Upiši broj rijedaka koji će biti u tablici"));
			stupac = Integer.parseInt(JOptionPane.showInputDialog("Upiši broj stupaca koji će biti u tablici"));
			if(rijedak <= 0 || stupac <= 0) {
				JOptionPane.showMessageDialog(null, "Brojevi nisu ispravni");
				continue;
			}
			int[][] niz = new int [rijedak][stupac];
			proizvod = rijedak * stupac;
			d = 1;
		vanjska:
		for(int i = 0;i < rijedak;i++) {
		for(int y = stupac - (1+i) ; y >= (0+i);y--) {
			if(d > proizvod) {
			break vanjska;
			}	
			niz[rijedak - (1+i)][y] = d;
			d++;			
				}
		for(int x = rijedak - (2+i);x > (0+i);x--) {
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
		for(int x = (1+i);x < rijedak - (1+i) ;x++) {
			if(d > proizvod) {
				break vanjska;
			}	
				niz[x][stupac - (1+i)] = d;
				d++;
		}
	}
		for(int i = 0; i < rijedak;i++){
			System.out.println(Arrays.toString(niz[i]));
		}
		break;
		}
	}
}
