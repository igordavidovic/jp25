package tablica;

public class GornjiLijeviKut {
	private static int[][] niz;
	private static int proizvod;
	private static int d;
	private static int m;

	public static void smjer(int r, int s, boolean izbor) {

		niz = new int[r][s];
		proizvod = r * s;
		d = 0;
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
			glLijevoDesno();
			if (d > proizvod) {
				break;
			}
			gdGoreDolje();
			if (d > proizvod) {
				break;
			}
			ddDesnoLijevo();
			if (d > proizvod) {
				break;
			}
			dlDoljeGore();
			m++;
			if (d > proizvod) {
				break;
			}
		}
	}

	private static void suprotnoOdKazaljke() {
		while (true) {
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
			if (d > proizvod) {
				break;
			}
				gdSuprotno();
			m++;
			if (d > proizvod) {
				break;
			}
		}
	}

	private static void glLijevoDesno() {
		for (int y = m; y <= niz[0].length - (1 + m); y++) {
			if (d > proizvod) {
				break;
			}
			niz[m][y] = d;
			d++;
		}
	}

	private static void gdGoreDolje() {
		for (int x = 1 + m; x < niz.length - (1 + m); x++) {
			if (d > proizvod) {
				break;
			}
			niz[x][niz[0].length - (1 + m)] = d;
			d++;
		}
	}

	private static void ddDesnoLijevo() {
		for (int y = niz[0].length - (1 + m); y > m; y--) {
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

	private static void glSuprotno() {
		for (int x = m; x < niz.length - (1 + m); x++) {
			if (d > proizvod) {
				break;
			}
			niz[x][m] = d;
			d++;
		}
	}

	private static void dlSuprotno() {
		for (int y = m; y < niz[0].length - (1 + m); y++) {
			if (d > proizvod) {
				break;
			}
			niz[niz.length - (1 + m)][y] = d;
			d++;
		}
	}

	private static void ddSuprotno() {
		for (int x = niz.length - (1 + m); x >= m; x--) {
			if (d > proizvod) {
				break;
			}
			niz[x][niz[0].length - (1 + m)] = d;
			d++;
		}
	}

	private static void gdSuprotno() {
		for (int y = niz[0].length - (2 + m); y > m; y--) {
			if (d > proizvod) {
				break;
			}
			niz[m][y] = d;
			d++;
		}
	}

}
