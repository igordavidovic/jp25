package zadaca;

public class Alt3SMetodama {
	static void glLijevoDesno() {
		for(int y = TablicaSMetodama.brojac1 ; y <= TablicaSMetodama.niz[0].length - (1+TablicaSMetodama.brojac1);y++) {
			if(TablicaSMetodama.brojac > TablicaSMetodama.proizvod()) {
			break;
			}	
			TablicaSMetodama.niz[TablicaSMetodama.brojac1][y] = TablicaSMetodama.brojac;
			TablicaSMetodama.brojac++;			
			}
	}
		static void gdGoreDolje(){
			for(int x = 1 + TablicaSMetodama.brojac1;x < TablicaSMetodama.niz.length - (1+TablicaSMetodama.brojac1);x++) {
				if(TablicaSMetodama.brojac > TablicaSMetodama.proizvod()) {
					break;
				}		
					TablicaSMetodama.niz[x][TablicaSMetodama.niz[0].length - (1+TablicaSMetodama.brojac1)] = TablicaSMetodama.brojac;
					TablicaSMetodama.brojac++;
			}
	}
		
	static void ddDesnoLijevo(){
		for(int y = TablicaSMetodama.niz[0].length - (1+TablicaSMetodama.brojac1);y > TablicaSMetodama.brojac1;y--) {
			if(TablicaSMetodama.brojac > TablicaSMetodama.proizvod()) {
				break;
			}		
				TablicaSMetodama.niz[TablicaSMetodama.niz.length - (1+TablicaSMetodama.brojac1)][y] = TablicaSMetodama.brojac;
				TablicaSMetodama.brojac++;
		}
	}
	
	static void dlDoljeGore() {
		for(int x = TablicaSMetodama.niz.length - (1+TablicaSMetodama.brojac1);x > TablicaSMetodama.brojac1 ;x--) {
			if(TablicaSMetodama.brojac > TablicaSMetodama.proizvod()) {
				break;
			}	
				TablicaSMetodama.niz[x][TablicaSMetodama.brojac1] = TablicaSMetodama.brojac;
				TablicaSMetodama.brojac++;
		}
	}
	
	public static void main(String[] args) {
		TablicaSMetodama.ucitanjeMatrice(TablicaSMetodama.unesiBroj(), TablicaSMetodama.unesiBroj());
		while(TablicaSMetodama.brojac <= TablicaSMetodama.proizvod()) {
			glLijevoDesno();
			gdGoreDolje();
			ddDesnoLijevo();
			dlDoljeGore();
			TablicaSMetodama.brojac1++;
		}
		TablicaSMetodama.ispisMatrice();
	}
}
