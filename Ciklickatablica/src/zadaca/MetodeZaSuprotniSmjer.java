package zadaca;

public class MetodeZaSuprotniSmjer {
	static void ddSuprotno() {
		for (int x = TablicaSMetodama.niz.length - (1 + TablicaSMetodama.brojac1); x >= TablicaSMetodama.brojac1; x--) {
			if (TablicaSMetodama.brojac > TablicaSMetodama.proizvod()) {
				break;
			}
			TablicaSMetodama.niz[x][TablicaSMetodama.niz[0].length
					- (1 + TablicaSMetodama.brojac1)] = TablicaSMetodama.brojac;
			TablicaSMetodama.brojac++;
		}
	}

	static void gdSuprotno() {
		for (int y = TablicaSMetodama.niz[0].length
				- (2 + TablicaSMetodama.brojac1); y > TablicaSMetodama.brojac1; y--) {
			if (TablicaSMetodama.brojac > TablicaSMetodama.proizvod()) {
				break;
			}
			TablicaSMetodama.niz[TablicaSMetodama.brojac1][y] = TablicaSMetodama.brojac;
			TablicaSMetodama.brojac++;
		}
	}

	static void glSuprotno() {
		for (int x = TablicaSMetodama.brojac1; x < TablicaSMetodama.niz.length - TablicaSMetodama.brojac1; x++) {
			if (TablicaSMetodama.brojac > TablicaSMetodama.proizvod()) {
				break;
			}
			TablicaSMetodama.niz[x][TablicaSMetodama.brojac1] = TablicaSMetodama.brojac;
			TablicaSMetodama.brojac++;
		}
	}

	static void dlSuprotno() {
		for (int y = (1 + TablicaSMetodama.brojac1); y < TablicaSMetodama.niz[0].length
				- (1 + TablicaSMetodama.brojac1); y++) {
			if (TablicaSMetodama.brojac > TablicaSMetodama.proizvod()) {
				break;
			}
			TablicaSMetodama.niz[TablicaSMetodama.niz.length
					- (1 + TablicaSMetodama.brojac1)][y] = TablicaSMetodama.brojac;
			TablicaSMetodama.brojac++;
		}
	}
	//Suprotna iz desnog kuta donjeg
	static void punjenjeTablice() {
		while(TablicaSMetodama.brojac <= TablicaSMetodama.proizvod()) {
			ddSuprotno();
			gdSuprotno();
			glSuprotno();
			dlSuprotno();
			TablicaSMetodama.brojac1++;
		}
	}
	
	public static void suprotnaDesniDonjiKut() {
		TablicaSMetodama.ucitanjeMatrice(TablicaSMetodama.unesiBroj(), TablicaSMetodama.unesiBroj());
		punjenjeTablice();
		TablicaSMetodama.ispisMatrice();
	}
	
	static void dlSuprotno1() {
		for (int y = TablicaSMetodama.brojac1; y < TablicaSMetodama.niz[0].length
				- (1 + TablicaSMetodama.brojac1); y++) {
			if (TablicaSMetodama.brojac > TablicaSMetodama.proizvod()) {
				break;
			}
			TablicaSMetodama.niz[TablicaSMetodama.niz.length
					- (1 + TablicaSMetodama.brojac1)][y] = TablicaSMetodama.brojac;
			TablicaSMetodama.brojac++;
		}
	}
	
	static void glSuprotno1() {
		for (int x = TablicaSMetodama.brojac1; x < TablicaSMetodama.niz.length - (1 + TablicaSMetodama.brojac1); x++) {
			if (TablicaSMetodama.brojac > TablicaSMetodama.proizvod()) {
				break;
			}
			TablicaSMetodama.niz[x][TablicaSMetodama.brojac1] = TablicaSMetodama.brojac;
			TablicaSMetodama.brojac++;
		}
	}
	//Suprotna iz lijevog kuta donjeg
	static void punjenjeTablice1() {
		while(TablicaSMetodama.brojac <= TablicaSMetodama.proizvod()) {
			dlSuprotno1();
			ddSuprotno();
			gdSuprotno();
			glSuprotno1();
			TablicaSMetodama.brojac1++;
		}
	}
	
	public static void suprotnaDonjiLijeviKut() {
		TablicaSMetodama.ucitanjeMatrice(TablicaSMetodama.unesiBroj(), TablicaSMetodama.unesiBroj());
		punjenjeTablice1();
		TablicaSMetodama.ispisMatrice();
	}
}
