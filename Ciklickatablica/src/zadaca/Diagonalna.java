package zadaca;

import java.util.Scanner;

public class Diagonalna {
	private Scanner scanner;
	private int r;
	private int s;
	private int[][] niz;
	private int p;
	private int d;

	public Diagonalna() {
		scanner = new Scanner(System.in);
		punjenjeTablice();
		ispisTablice();
		scanner.close();
	}

	private void ispisTablice() {
		int broj = p;
		int temp = 1;
		while(broj > 0) {
			broj /= 10;
			temp++;
		}
		
		for (int i = 0; i < r; i++) {
			for (int j = 0; j < s; j++) {
				System.out.print(String.format("%" + temp + "d", niz[i][j]));
			}
			System.out.println();
		}
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
	private void punjenjeTablice() {
		r = unos();
		s = unos();
		d = 1;
		p = r * s;
		niz = new int[r][s];
		int a , b;
		for (int i = 0; i < r; i++) {
			System.out.println(i + ". KOLO");
			b = i;
			for (int j = 0; j <= i; j++) {
				if (j >= s && d == p) {
					niz[r - 1][s - 1] = d;
					System.out.println("Postavlja : " + d + " na " + " x = " + (r-1) + " y = " + (s-1));
					break;
				}else if(j >= s) {
					System.out.println("PRESKACE");
					break;
				}
				niz[b][j] = d;
				System.out.println("Postavlja : " + d + " na " + " x = " + b + " y = " + j);
				b--;
				d++;
			}
		}
		System.out.println("--------------------------------");
		for (int i = 1; i < s - 1; i++) {
			System.out.println(i + ". KOLO");
			a = i;
			for (int j = r - 1; j >= 0; j--) {
				if (a == s && d == p) {
					niz[r - 1][s - 1] = d;
					System.out.println("Postavlja : " + d + " na " + " x = " + (r-1) + " y = " + (s-1));
					break;
				}else if(a == s) {
					System.out.println("PRESKACE");
					break;
				}
				niz[j][a] = d;
				System.out.println("Postavlja : " + d + " na " + " x = " + j + " y = " + a);
				a++;
				d++;
			}
		}
	}

	public static void main(String[] args) {
		new Diagonalna();
	}
}
