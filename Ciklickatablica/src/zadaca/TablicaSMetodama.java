package zadaca;

import java.util.Arrays;

import javax.swing.JOptionPane;

public class TablicaSMetodama {
	static int[][] niz;
	static int brojac = 1;	
	static int brojac1 = 0;
	
	static int unesiBroj() {
		int a = 0;
		while(true) {
			a = Integer.parseInt(JOptionPane.showInputDialog("Unesi pozitivan broj"));
			if(a > 0) {
				break;
			}
		}
		return a;
	}
	
	 static int[][] ucitanjeMatrice(int r,int s){
		niz = new int[r][s];
		
		return niz;
	}
	
	static int proizvod() {
		int proizvod = niz.length * niz[0].length;
		
		return proizvod;
	}
	
	static void ispisMatrice() {
		for(int i = 0;i < niz.length;i++) {
		System.out.println(Arrays.toString(niz[i]));
		}
	}
	
	static void dlDesnoLijevo() {
		for(int y = niz[0].length - (1+brojac1) ; y >= brojac1;y--) {
			if(brojac > proizvod()) {
			break;
			}	
			niz[niz.length - (1+brojac1)][y] = brojac;
			brojac++;			
		}
	}
	
	static void ddLijevoGore() {
		for(int x = niz.length - (2+brojac1);x > brojac1;x--) {
			if(brojac > proizvod()) {
				break;
			}		
				niz[x][brojac1] = brojac;
				brojac++;
		}
	}
	
	static void gdLijevoDesno() {
		for(int y = brojac1;y < niz[0].length - brojac1;y++) {
			if(brojac > proizvod()) {
				break;
			}		
				niz[brojac1][y] = brojac;
				brojac++;
		}
	}
	
	static void glDesnoDolje() {
		for(int x = (1+brojac1);x < niz.length - (1+brojac1) ;x++) {
			if(brojac > proizvod()) {
				break;
			}	
				niz[x][niz[0].length - (1+brojac1)] = brojac;
				brojac++;
		}
	}
	
	private static void punjenjeTablice() {
		while(brojac <= proizvod()) {
			dlDesnoLijevo();
			ddLijevoGore();
			gdLijevoDesno();
			glDesnoDolje();
			brojac1++;
		}
	}
	
	public static void main(String[] args) {
		ucitanjeMatrice(unesiBroj(), unesiBroj());
		punjenjeTablice();
		ispisMatrice();
	}
}
