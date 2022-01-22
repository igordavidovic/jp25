package zadaca;

import java.util.Arrays;
import java.util.Scanner;

public class Tablica {
	public static void main(String[] args) {
		int rijedak;
		int stupac;
		int d;
		int proizvod;
		Scanner ulaz = new Scanner(System.in);
		System.out.print("Upiši broj rijedaka koji će biti u tablici : ");
		rijedak = ulaz.nextInt();
		System.out.print("Upiši broj stupaca koji će biti u tablici : ");
		stupac = ulaz.nextInt();
		ulaz.close();
		int[][] niz = new int[rijedak][stupac];
		proizvod = rijedak * stupac;
		d = 1;
		vanjska: for (int i = 0; i < rijedak; i++) {
			for (int y = stupac - (1 + i); y >= i; y--) {
				if (d > proizvod) {
					break vanjska;
				}
				niz[rijedak - (1 + i)][y] = d;
				d++;
			}
			for (int x = rijedak - (2 + i); x > i; x--) {
				if (d > proizvod) {
					break vanjska;
				}
				niz[x][i] = d;
				d++;
			}

			for (int y = i; y < stupac - i; y++) {
				if (d > proizvod) {
					break vanjska;
				}
				niz[i][y] = d;
				d++;
			}
			for (int x = (1 + i); x < rijedak - (1 + i); x++) {
				if (d > proizvod) {
					break vanjska;
				}
				niz[x][stupac - (1 + i)] = d;
				d++;
			}
		}
		for (int i = 0; i < rijedak; i++) {
			System.out.println(Arrays.toString(niz[i]));
		}
	}
}
