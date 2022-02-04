package zavrsnirad.aplikacija;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

import zavrsnirad.utility.Unos;
import zavrsnirad.model.Djelatnik;
import zavrsnirad.model.Korisnik;
import zavrsnirad.model.Posjeta;
import zavrsnirad.model.Usluga;

public class Start {
	private List<Korisnik> korisnici;
	private List<Djelatnik> djelatnici;
	private List<Usluga> usluge;
	private List<Posjeta> posjete;
	private Scanner scanner;
	private Korisnik korisnik;
	private Djelatnik djelatnik;
	private Usluga usluga;
	private Posjeta posjeta;

	public Start() {
		korisnici = new ArrayList<>();
		djelatnici = new ArrayList<>();
		usluge = new ArrayList<>();
		posjete = new ArrayList<>();
		scanner = new Scanner(System.in);
		naslov();
		glavniIzbornik();
		scanner.close();
	}

	private void glavniIzbornik() {
		System.out.println("\n1. Rad s korisnicima");
		System.out.println("2. Rad s djelatnicima");
		System.out.println("3. Rad s uslugama");
		System.out.println("4. Rad s posjetama");
		System.out.println("5. Kraj rada");
		switch (Unos.unesiInt(scanner, "Odaberite", 1, 5)) {
		case 1 -> korisnikIzbornik();
		case 2 -> djelatnikIzbornik();
		case 3 -> uslugaIzbornik();
		case 4 -> posjetaIzbornik();
		}

	}

	private void posjetaIzbornik() {

	}

	private void uslugaIzbornik() {

	}

	private void djelatnikIzbornik() {
		System.out.println("\n1. Pregled djelatnika");
		System.out.println("2. Unos novog djelatnika");
		System.out.println("3. Promjena djelatnika");
		System.out.println("4. Brisanje djelatnika");
		System.out.println("5. Povratak na glavni izbornik");
		switch (Unos.unesiInt(scanner, "Odaberi akciju", 1, 5)) {
		case 1 -> {
			djelatnikPregled();
			djelatnikIzbornik();
		}
		case 2 -> djelatnikUnos();
		case 3 -> djelatnikPromjena();
		case 4 -> djelatnikBrisanje();
		case 5 -> glavniIzbornik();
		}
	}

	private void djelatnikUnos() {
		djelatnik = new Djelatnik();
		djelatnik.setSifra(Unos.unesiInt(scanner, "Unesite šifru djelatnika"));
		djelatnik.setIme(Unos.unesiString(scanner, "Unesite ime djelatnika"));
		djelatnik.setPrezime(Unos.unesiString(scanner, "Unesite prezime djelatnika"));
		djelatnik.setUloga(Unos.unesiString(scanner, "Unesite ulogu djelatnika"));
		djelatnik.setEmail(Unos.unesiString(scanner, "Unesite email djelatnika"));
		djelatnik.setPlaca(Unos.unesiBigDecimal(scanner, "Unesite plaću djelatnika"));
		djelatnici.add(djelatnik);
		djelatnikIzbornik();
	}

	private void djelatnikBrisanje() {
		djelatnikPregled();
		djelatnici.remove(Unos.unesiInt(scanner, "Unesite redni broj djelatnika kojega želite izbristati")-1);
		djelatnikIzbornik();
	}

	private void djelatnikPromjena() {
		djelatnikIzbornik();
		int a = Unos.unesiInt(scanner, "Unesite redni broj djelatnika kojega želite mjenjati");
		djelatnik = djelatnici.get(a - 1);
		djelatnik.setSifra(Unos.unesiInt(scanner, "Unesite novu šifru djelatnika"));
		djelatnik.setIme(Unos.unesiString(scanner, "Unesite novo ime djelatnika"));
		djelatnik.setPrezime(Unos.unesiString(scanner, "Unesite nov prezime djelatnika"));
		djelatnik.setUloga(Unos.unesiString(scanner, "Unesite novu ulogu djelatnika"));
		djelatnik.setEmail(Unos.unesiString(scanner, "Unesite novi email djelatnika"));
		djelatnik.setPlaca(Unos.unesiBigDecimal(scanner, "Unesite novu plaću djelatnika"));
		djelatnikIzbornik();
	}

	private void djelatnikPregled() {
		int a = 1;
		for (Djelatnik d : djelatnici) {
			System.out.println(a++ + ". " + d);
		}
	}

	private void korisnikIzbornik() {
		System.out.println("\n1. Pregled korisnika");
		System.out.println("2. Unos novog korisnika");
		System.out.println("3. Promjena korisnika");
		System.out.println("4. Brisanje korisnika");
		System.out.println("5. Povratak na glavni izbornik");
		switch (Unos.unesiInt(scanner, "Odaberi akciju", 1, 5)) {
		case 1 -> {
			korisnikPregled();
			korisnikIzbornik();
		}
		case 2 -> korisnikUnos();
		case 3 -> korisnikPromjena();
		case 4 -> korisnikBrisanje();
		case 5 -> glavniIzbornik();
		}
	}

	private void korisnikBrisanje() {
		korisnikPregled();
		korisnici.remove(Unos.unesiInt(scanner, "Unesite redni broj korisnika kojega želite izbrisati") - 1);
		korisnikIzbornik();
	}

	private void korisnikPromjena() {
		korisnikPregled();
		int a = Unos.unesiInt(scanner, "Unesite redni broj korisnika kojega želite mjenjati");
		korisnik = korisnici.get(a - 1);
		korisnik.setSifra(Unos.unesiInt(scanner, "Unesite novu šifru korisnika"));
		korisnik.setIme(Unos.unesiString(scanner, "Unesite novo ime korisnika"));
		korisnik.setPrezime(Unos.unesiString(scanner, "Unesite novo prezime korisnika"));
		korisnik.setEmail(Unos.unesiString(scanner, "Unesite novi email korisnika"));
		korisnik.setOib(Unos.unesiString(scanner, "Unesite novi OIB korisnika"));
		korisnik.setDatumRodenja(new Date());
		korisnikIzbornik();
	}

	private void korisnikUnos() {
		korisnik = new Korisnik();
		korisnik.setSifra(Unos.unesiInt(scanner, "Unesite šifru korisnika"));
		korisnik.setIme(Unos.unesiString(scanner, "Unesite ime korisnika"));
		korisnik.setPrezime(Unos.unesiString(scanner, "Unesite prezime korisnika"));
		korisnik.setEmail(Unos.unesiString(scanner, "Unesite email korisnika"));
		korisnik.setOib(Unos.unesiString(scanner, "Unesite OIB korisnika"));
		korisnik.setDatumRodenja(new Date());
		korisnici.add(korisnik);
		korisnikIzbornik();
	}

	private void korisnikPregled() {
		int a = 1;
		for (Korisnik k : korisnici) {
			System.out.println(a++ + ". " + k);
		}
	}

	private void naslov() {
		System.out.println("***************************");
		System.out.println("****** Recepcija APP ******");
		System.out.println("***************************");
		System.out.println();

	}

	public static void main(String[] args) {
		new Start();
	}
}
