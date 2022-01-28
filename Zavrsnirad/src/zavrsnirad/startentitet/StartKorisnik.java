package zavrsnirad.startentitet;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import zavrsnirad.entiteti.Korisnik;

public class StartKorisnik {
	private List<Korisnik> korisnici;
	private Korisnik korisnik;
	private Scanner scanner;
	
	public StartKorisnik() {
		korisnici = new ArrayList<>();
		scanner = new Scanner(System.in);
		program();
		scanner.close();
	}

	private void program() {
		naslov();
		izbornik();
	}

	private void izbornik() {
		System.out.println("\n1. Unos korisnika");
		System.out.println("2. Promjena korisnika");
		System.out.println("3. Brisanje korisnika");
		System.out.println("4. Pregled korisnika");
		System.out.println("5. Izlaz iz programa");
		switch(Unos.unesiInt(scanner, "Izaberi akciju")) {
		case 1:
			unos();
			break;
		case 2:
			promjena();
			break;
		case 3:
			brisanje();
			break;
		case 4:
			pregled();
			izbornik();
			break;
		case 5:
			System.out.println("\nHvala što ste koristili naš program, doviđenja!");
			break;
		default:
			System.out.println("Izabrana akcija nije moguća");
			izbornik();
		}
		
	}

	private void naslov() {
		System.out.println("*********************");
		System.out.println("**** Korisnik V1 ****");
		System.out.println("*********************");
	}
}
