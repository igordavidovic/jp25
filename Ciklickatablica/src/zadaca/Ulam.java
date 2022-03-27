package zadaca;

import java.util.Scanner;

public class Ulam {
	private int[][] niz;
	private Scanner scanner;
	private int r;
	private int s;
	private int[] prime;
	private int p;

	public Ulam() {
		scanner = new Scanner(System.in);
		punjenjeTablice();
		ispisTablice();
		scanner.close();
	}

	private int unos() {
		int broj = 0;
		while (true) {
			try {
				System.out.println("Upiši broj");
				broj = Integer.parseInt(scanner.nextLine());
			} catch (Exception e) {
				System.out.println(e.getMessage());
				continue;
			}
			if (broj < 1 || broj > 1000) {
				System.out.println("Broj mora biti veći od 0 i manji od 1000");
				continue;
			}
			return broj;
		}
	}

	private int[] prime() {
		r = unos();
		s = unos();
		p = r * s;
		int brojac = 0;
		int[] temp = new int[p];
		vanjska: for (int i = 1; i < Integer.MAX_VALUE; i++) {
			if (brojac == p) {
				break;
			}
			for (int j = 2; j < i; j++) {
				if (i % j == 0) {
					continue vanjska;
				}
			}
			temp[brojac] = i;
			brojac++;
		}

		return temp;
	}

	private void ispisTablice() {
		int broj = prime[prime.length - 1];
		int temp = 1;
		while (broj > 0) {
			broj /= 10;
			temp++;
		}
		for (int i = 0; i < niz.length; i++) {
			for (int j = 0; j < niz[0].length; j++) {
				System.out.print(String.format("%" + temp + "d", niz[i][j]));
			}
			System.out.println();
		}
	}

	private void punjenjeTablice() {
		prime = prime();
		int brojac = 0;
		niz = new int[r][s];
		vanjska: for (int i = 0; i < r; i++) {
			for (int j = niz[0].length - (1 + i); j >= i; j--) {
				if (brojac == p) {
					break vanjska;
				}
				niz[niz.length - (1 + i)][j] = prime[brojac];
				brojac++;
			}
			for (int k = niz.length - (2 + i); k >= i; k--) {
				if (brojac == p) {
					break vanjska;
				}
				niz[k][i] = prime[brojac];
				brojac++;
			}
			for (int l = 1 + i; l < niz[0].length - (1 + i); l++) {
				if (brojac == p) {
					break vanjska;
				}
				niz[i][l] = prime[brojac];
				brojac++;
			}
			for (int m = i; m < niz.length - (1 + i); m++) {
				if (brojac == p) {
					break vanjska;
				}
				niz[m][niz[0].length - (1 + i)] = prime[brojac];
				brojac++;
			}
		}
	}

	public static void main(String[] args) {
		new Ulam();
	}
}
