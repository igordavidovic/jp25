package zavrsnirad.startentitet;

import java.util.ArrayList;
import java.util.Date;
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
		pocetniPodaci();
		program();
		scanner.close();
	}
	
	private void pocetniPodaci() {
		for(int i = 0;i < 10;i++) {
			korisnici.add(new Korisnik(12+i,"A" + (i+1), "B" + (i+1), "E"+(i+1)+"@.com", "OIB"+(i+1), new Date()));
		}
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

	private void pregled() {
		int a = 1;
		for(Korisnik k : korisnici) {
			System.out.println(a++ + ". " + k);
		}
	}

	private void brisanje() {
		pregled();
		korisnici.remove(Unos.unesiInt(scanner, "Unesite redni broj korisnika kojeg želite ukloniti") - 1);
		izbornik();
	}

	private void promjena() {
		pregled();
		int a = Unos.unesiInt(scanner, "Unesite redni broj korisnika koji želite mjenjati");
		korisnik = korisnici.get(a - 1);
		korisnik.setSifra(Unos.unesiInt(scanner, "Unesite novu šifru "));
		korisnik.setIme(Unos.unesiString(scanner, "Unesite novo ime"));
		korisnik.setPrezime(Unos.unesiString(scanner, "Unesite novo prezime"));
		korisnik.setOib(Unos.unesiString(scanner, "Unesite novi OIB"));
		korisnik.setEmail(Unos.unesiString(scanner, "Unesite novi email"));
		izbornik();
	}

	private void unos() {
		korisnik = new Korisnik();
		korisnik.setSifra(Unos.unesiInt(scanner, "Unesite novu šifru"));
		korisnik.setIme(Unos.unesiString(scanner, "Unesite ime korisnika"));
		korisnik.setPrezime(Unos.unesiString(scanner, "Unesite prezime korisnika"));
		korisnik.setOib(Unos.unesiString(scanner, "Unesite OIB korisnika"));
		korisnik.setEmail(Unos.unesiString(scanner, "Unesite email korisnika"));
		korisnici.add(korisnik);
		izbornik();
	}

	private void naslov() {
		System.out.println("*********************");
		System.out.println("**** Korisnik V1 ****");
		System.out.println("*********************");
	}
	
	public static void main(String[] args) {
		new StartKorisnik();
	}
}


