package zavrsnirad.startentitet;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

import zavrsnirad.entiteti.Korisnik;
import zavrsnirad.entiteti.Posjeta;

public class StartPosjeta {
	private List<Posjeta> posjete;
	private List<Korisnik> korisnici;
	private Posjeta posjeta;
	private Scanner scanner;

	public StartPosjeta() {
		posjete = new ArrayList<>();
		korisnici = new ArrayList<>();
		scanner = new Scanner(System.in);
		pocetniPodaci();
		program();
		scanner.close();
	}

	private void pocetniPodaci() {
		for (int i = 0; i < 10; i++) {
			korisnici.add(
					new Korisnik("A" + (i + 1), "B" + (i + 1), "E" + (i + 1) + "@.com", "OIB" + (i + 1), new Date()));
			posjete.add(new Posjeta(korisnici.get(i), new Date(), new Date(), i + 1, i + 1, i));
		}
	}

	private void program() {
		naslov();
		izbornik();
	}

	private void izbornik() {
		System.out.println("\n1. Unos posjete");
		System.out.println("2. Promjena posjete");
		System.out.println("3. Brisanje posjete");
		System.out.println("4. Pregled posjete");
		System.out.println("5. Izlaz iz programa");
		switch (Unos.unesiInt(scanner, "Izaberite akciju")) {
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
		for (Posjeta p : posjete) {
			System.out.println(a++ + ". " + p);
		}
	}

	private void brisanje() {
		pregled();
		posjete.remove(Unos.unesiInt(scanner, "Unesite redni broj posjete koju želite ukloniti") - 1);
		izbornik();
	}

	private void promjena() {
		pregled();
		int a = Unos.unesiInt(scanner, "Unesite redni broj posjete koju želite promjeniti");
		posjeta = posjete.get(a - 1);
		pregledKorisnik();
		int b = Unos.unesiInt(scanner, "Unesite redni broj korisnika s kojim želite zamjeniti staroga");
		posjeta.setKorisnik(korisnici.get(b - 1));
		posjeta.setDatumPrijave(new Date());
		posjeta.setDatumOdjave(new Date());
		posjeta.setBrojSoba(Unos.unesiInt(scanner, "Unesite novi broj soba"));
		posjeta.setBrojOdraslih(Unos.unesiInt(scanner, "Unesite novi broj odraslih osoba"));
		posjeta.setBrojDjece(Unos.unesiInt(scanner, "Unesite novi broj djece"));
		izbornik();
	}

	private void unos() {
		pregledKorisnik();
		int a = Unos.unesiInt(scanner, "Unesite redni broj korisnika kojega želite izabrati");
		posjeta = new Posjeta();
		posjeta.setKorisnik(korisnici.get(a - 1));
		posjeta.setDatumPrijave(new Date());
		posjeta.setDatumOdjave(new Date());
		posjeta.setBrojSoba(Unos.unesiInt(scanner, "Unesite broj soba kojih želite rezervirati"));
		posjeta.setBrojOdraslih(Unos.unesiInt(scanner, "Unesite broj odraslih osoba koji će biti u posjeti"));
		posjeta.setBrojDjece(Unos.unesiInt(scanner, "Unesite broj djece koja će biti u posjeti"));
		posjete.add(posjeta);
		izbornik();
	}

	private void pregledKorisnik() {
		int a = 1;
		for (Korisnik k : korisnici) {
			System.out.println(a++ + ". " + k);
		}
	}

	private void naslov() {
		System.out.println("********************");
		System.out.println("**** Posjeta V1 ****");
		System.out.println("********************");
	}

	public static void main(String[] args) {
		new StartPosjeta();
	}
}
