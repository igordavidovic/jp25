package tablica;

import java.util.Scanner;

public class Start {
	
	private static Scanner scanner;
	
	private static void izborPocetka(int r,int s,int smjer) {
		int kut = Unos.unosKuta(scanner);
		switch (kut) {
		case 1:
			DonjiDesniKut.smjer(r, s, smjer);
			break;
		case 2:
			DonjiLijeviKut.smjer(r, s, smjer);
			break;
		case 3:
			GornjiLijeviKut.smjer(r, s, smjer);
			break;
		case 4:
			GornjiDesniKut.smjer(r, s, smjer);
			break;
		default:
			break;
		}
	}
 
	public static void main(String[] args) {
		scanner = new Scanner(System.in);
		int r = Unos.unosRijedka(scanner);
		int s = Unos.unosStupca(scanner);
		int smjer = Unos.unosSmjera(scanner);
		izborPocetka(r, s, smjer);
		scanner.close();
	}
}
