package zavrsnirad.startentitet;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

import zavrsnirad.entiteti.Djelatnik;
import zavrsnirad.entiteti.Korisnik;
import zavrsnirad.entiteti.Posjeta;
import zavrsnirad.entiteti.Posjeta_usluga;
import zavrsnirad.entiteti.Usluga;

public class StartPosjeta_Usluga {
	private List<Posjeta_usluga> posjete_usluge;
	private List<Posjeta> posjete;
	private List<Usluga> usluge;
	private List<Korisnik> korisnici;
	private List<Djelatnik> djelatnici;
	private Posjeta_usluga posjeta_usluga;
	private Scanner scanner;

	public StartPosjeta_Usluga() {
		posjete_usluge = new ArrayList<>();
		korisnici = new ArrayList<>();
		djelatnici = new ArrayList<>();
		posjete = new ArrayList<>();
		usluge = new ArrayList<>();
		scanner = new Scanner(System.in);
		pocetniPodaci();
		program();
		scanner.close();
	}

	private void pocetniPodaci() {
		for (int i = 0; i < 10; i++) {
			korisnici.add(
					new Korisnik(12+i,"A" + (i + 1), "B" + (i + 1), "E" + (i + 1) + "@.com", "OIB" + (i + 1), new Date()));
			posjete.add(new Posjeta(34+i,korisnici.get(i), new Date(), new Date(), i + 1, i + 1, i));
			djelatnici.add(new Djelatnik(12+i,"A" + (i + 1), "B" + (i + 1), "R" + (i + 1), "E" + (i + 1) + "@.com",
					new BigDecimal(i * 1000)));
			usluge.add(new Usluga(23+i,djelatnici.get(i), "U" + (i + 1), new BigDecimal(i * 100)));
			posjete_usluge.add(new Posjeta_usluga(100+i,usluge.get(i), posjete.get(i)));
		}
	}

	private void program() {
		naslov();
		izbornik();
	}

	private void izbornik() {
		System.out.println("\n1. Unos posjete_usluge");
		System.out.println("2. Promjena posjete_usluge");
		System.out.println("3. Brisanje posjete_usluge");
		System.out.println("4. Pregled posjete_usluge");
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
		for (Posjeta_usluga pu : posjete_usluge) {
			System.out.println(a++ + ". " + pu);
		}
	}

	private void brisanje() {
		pregled();
		posjete_usluge.remove(Unos.unesiInt(scanner, "Unesite redni broj posjete_usluge koju želite ukloniti") - 1);
		izbornik();
	}

	private void promjena() {
		pregled();
		int a = Unos.unesiInt(scanner, "Unesite posjetu_uslugu koju želite promjeniti");
		posjeta_usluga = posjete_usluge.get(a-1);
		pregledPosjeta();
		int b = Unos.unesiInt(scanner, "Unesite posjetu s kojom želite zamjeniti staru");
		posjeta_usluga.setPosjeta(posjete.get(b-1));
		pregledUsluga();
		int c = Unos.unesiInt(scanner, "Unesite uslugu s kojom želite zamjeniti staru");
		posjeta_usluga.setUsluga(usluge.get(c-1));
		izbornik();
	}

	private void unos() {
		pregledPosjeta();
		int a = Unos.unesiInt(scanner, "Unesite posjetu koju želite izabrati");
		posjeta_usluga = new Posjeta_usluga();
		posjeta_usluga.setPosjeta(posjete.get(a-1));
		pregledUsluga();
		int b = Unos.unesiInt(scanner, "Unesite uslugu koju želite izabrati");
		posjeta_usluga.setUsluga(usluge.get(b-1));
		posjete_usluge.add(posjeta_usluga);
		izbornik();
	}
	
	private void pregledUsluga() {
		int a = 1;
		for(Usluga u : usluge) {
			System.out.println(a++ + ". " + u);
		}
	}
	
	private void pregledPosjeta() {
		int a = 1;
		for(Posjeta p : posjete) {
			System.out.println(a++ + ". " + p);
		}
	}
	
	private void naslov() {
		System.out.println("***************************");
		System.out.println("**** Posjeta_usluga V1 ****");
		System.out.println("***************************");
	}
	
	public static void main(String[] args) {
		new StartPosjeta_Usluga();
	}
}
