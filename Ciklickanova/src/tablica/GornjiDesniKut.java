package tablica;

public class GornjiDesniKut {
	private static int[][] niz;
	private static int proizvod;
	private static int d;
	private static int m;

	public static void smjer(int r, int s, boolean izbor) {

		niz = new int[r][s];
		proizvod = r * s;
		d = 1;
		m = 0;
		if (izbor) {
			smjerKazaljke();
		} else {
			suprotnoOdKazaljke();
		}
	}

	private static void smjerKazaljke() {
		while (true) {
			if (d > proizvod) {
				break;
			}
			gdDesnoDolje();
			if (d > proizvod) {
				break;
			}
			ddDesnoLijevo();
			if (d > proizvod) {
				break;
			}
			dlDoljeGore();
			if (d > proizvod) {
				break;
			}
			glLijevoDesno();
			m++;
		}
		Ispis.ispisMatrice(niz);
	}

	private static void suprotnoOdKazaljke() {
		while (true) {
			if (d > proizvod) {
				break;
			}
			gdSuprotno();
			if (d > proizvod) {
				break;
			}
			glSuprotno();
			if (d > proizvod) {
				break;
			}
			dlSuprotno();
			if (d > proizvod) {
				break;
			}
			ddSuprotno();
			m++;
		}
		Ispis.ispisMatrice(niz);
	}

	private static void gdDesnoDolje() {
		for (int x = m; x <= niz.length - (1 + m); x++) {
			if (d > proizvod) {
				break;
			}
			niz[x][niz[0].length - (1 + m)] = d;
			d++;
		}
	}

	private static void ddDesnoLijevo() {
		for (int y = niz[0].length - (2 + m); y > m; y--) {
			if (d > proizvod) {
				break;
			}
			niz[niz.length - (1 + m)][y] = d;
			d++;
		}
	}

	private static void dlDoljeGore() {
		for (int x = niz.length - (1 + m); x > m; x--) {
			if (d > proizvod) {
				break;
			}
			niz[x][m] = d;
			d++;
		}
	}

	private static void glLijevoDesno() {
		for (int y = m; y < niz[0].length - (1 + m); y++) {
			if (d > proizvod) {
				break;
			}
			niz[m][y] = d;
			d++;
		}
	}

	private static void gdSuprotno() {
		for (int y = niz[0].length - (1 + m); y > m; y--) {
			if (d > proizvod) {
				break;
			}
			niz[m][y] = d;
			d++;
		}
	}

	private static void glSuprotno() {
		for (int x = m; x < niz.length - m; x++) {
			if (d > proizvod) {
				break;
			}
			niz[x][m] = d;
			d++;
		}
	}

	private static void dlSuprotno() {
		for (int y = (1 + m); y < niz[0].length - (1 + m); y++) {
			if (d > proizvod) {
				break;
			}
			niz[niz.length - (1 + m)][y] = d;
			d++;
		}
	}

	private static void ddSuprotno() {
		for (int x = niz.length - (1 + m); x > m; x--) {
			if (d > proizvod) {
				break;
			}
			niz[x][niz[0].length - (1 + m)] = d;
			d++;
		}
	}

}
