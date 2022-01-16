package zadaca;

public class Alt2SMetodama {
	
	static void gdDesnoDolje() {
		for(int x = TablicaSMetodama.brojac1 ; x <= TablicaSMetodama.niz.length - (1+TablicaSMetodama.brojac1);x++) {
			if(TablicaSMetodama.proizvod() > TablicaSMetodama.proizvod()) {
			break;
			}	
			TablicaSMetodama.niz[x][TablicaSMetodama.niz[0].length - (1 + TablicaSMetodama.brojac1)] = TablicaSMetodama.brojac;
			TablicaSMetodama.brojac++;			
			}
	}
	static void ddDesnoLijevo() {
		for(int y = TablicaSMetodama.niz[0].length - (2+TablicaSMetodama.brojac1);y > TablicaSMetodama.brojac1;y--) {
			if(TablicaSMetodama.proizvod() > TablicaSMetodama.proizvod()) {
				break;
			}		
				TablicaSMetodama.niz[TablicaSMetodama.niz.length - (1+TablicaSMetodama.brojac1)][y] = TablicaSMetodama.brojac;
				TablicaSMetodama.brojac++;
			}
	}
	
	static void dlDoljeGore() {
		for(int x = TablicaSMetodama.niz.length - (1+TablicaSMetodama.brojac1);x > TablicaSMetodama.brojac1;x--) {
			if(TablicaSMetodama.brojac > TablicaSMetodama.proizvod()) {
				break;
			}		
				TablicaSMetodama.niz[x][TablicaSMetodama.brojac1] = TablicaSMetodama.brojac;
				TablicaSMetodama.brojac++;
		}
	}
	
	static void glLijevoDesno() {
		for(int y = TablicaSMetodama.brojac1;y < TablicaSMetodama.niz[0].length - (1+TablicaSMetodama.brojac1) ;y++) {
			if(TablicaSMetodama.brojac > TablicaSMetodama.proizvod()) {
				break;
			}	
				TablicaSMetodama.niz[TablicaSMetodama.brojac1][y] = TablicaSMetodama.brojac;
				TablicaSMetodama.brojac++;
		}
	}
	
	private static void punjenjeTablice() {
		while(TablicaSMetodama.brojac <= TablicaSMetodama.proizvod()) {
			gdDesnoDolje();
			ddDesnoLijevo();
			dlDoljeGore();
			glLijevoDesno();
			TablicaSMetodama.brojac1++;
		}
	}
	public static void main(String[] args) {
		TablicaSMetodama.ucitanjeMatrice(TablicaSMetodama.unesiBroj(), TablicaSMetodama.unesiBroj());
		punjenjeTablice();
		TablicaSMetodama.ispisMatrice();
	}
}
