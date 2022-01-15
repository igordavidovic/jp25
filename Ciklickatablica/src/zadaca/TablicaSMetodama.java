package zadaca;

import java.util.Arrays;

import javax.swing.JOptionPane;

public class TablicaSMetodama {
	private static int[][] niz;
	private static int brojac = 1;	
	private static int brojac1 = 0;
	
	private static int unesiBroj() {
		int a = 0;
		while(true) {
			a = Integer.parseInt(JOptionPane.showInputDialog("Unesi pozitivan broj"));
			if(a > 0) {
				break;
			}
		}
		return a;
	}
	
	private static int[][] ucitanjeMatrice(int r,int s){
		niz = new int[r][s];
		
		return niz;
	}
	
	private static int proizvod() {
		int proizvod = niz.length * niz[0].length;
		
		return proizvod;
	}
	
	private static void ispisMatrice() {
		for(int i = 0;i < niz.length;i++) {
		System.out.println(Arrays.toString(niz[i]));
		}
	}
	
	private static void dlDesnoLijevo() {
		for(int y = niz[0].length - (1+brojac1) ; y >= brojac1;y--) {
			if(brojac > proizvod()) {
			break;
			}	
			niz[niz.length - (1+brojac1)][y] = brojac;
			brojac++;			
		}
	}
	
	private static void ddLijevoGore() {
		for(int x = niz.length - (2+brojac1);x > brojac1;x--) {
			if(brojac > proizvod()) {
				break;
			}		
				niz[x][brojac1] = brojac;
				brojac++;
		}
	}
	
	private static void gdLijevoDesno() {
		for(int y = brojac1;y < niz[0].length - brojac1;y++) {
			if(brojac > proizvod()) {
				break;
			}		
				niz[brojac1][y] = brojac;
				brojac++;
		}
	}
	
	private static void glDesnoDolje() {
		for(int x = (1+brojac1);x < niz.length - (1+brojac1) ;x++) {
			if(brojac > proizvod()) {
				break;
			}	
				niz[x][niz[0].length - (1+brojac1)] = brojac;
				brojac++;
		}
	}
	
	public static void main(String[] args) {
		ucitanjeMatrice(unesiBroj(), unesiBroj());
		while(brojac <= proizvod()) {
			dlDesnoLijevo();
			ddLijevoGore();
			gdLijevoDesno();
			glDesnoDolje();
			brojac1++;
		}
		ispisMatrice();
	}
}
