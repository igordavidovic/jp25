package zadaca;

import java.util.Arrays;

public class Alt1SMetodama {
	static int[][] niz;
	static int brojac = 1;
	static int brojac1 = 0;
	
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
		
	static void dlLijevoGore(){
		for(int x = niz.length - (1+brojac1) ; x >= brojac1;x--) {
			if(brojac > proizvod()) {
			break;
			}	
			niz[x][brojac1] = brojac;
			brojac++;			
		}
	}
	
	static void glLijevoDesno() {
		for(int y = (1+brojac1);y < niz[0].length - (1 + brojac1);y++) {
			if(brojac > proizvod()) {
				break;
			}		
				niz[brojac1][y] = brojac;
				brojac++;
			}
	}
	
	static void gdDesnoDolje() {
		for(int x = brojac1;x < niz.length - (1+brojac1);x++) {
			if(brojac > proizvod()) {
				break;
			}		
				niz[x][niz[0].length - (1+brojac1)] = brojac;
				brojac++;
		}
	}
	
	static void ddDesnoLijevo() {
		for(int y = niz[0].length - (1+brojac1);y > brojac1;y--) {
			if(brojac > proizvod()) {
				break;
			}	
				niz[niz.length - (1+brojac1)][y] = brojac;
				brojac++;
		}
	}
	public static void main(String[] args) {
		ucitanjeMatrice(TablicaSMetodama.unesiBroj(), TablicaSMetodama.unesiBroj());
		while(brojac <= proizvod()) {
			dlLijevoGore();
			glLijevoDesno();
			gdDesnoDolje();
			ddDesnoLijevo();
			brojac1++;
		}
		ispisMatrice();
	}
}
