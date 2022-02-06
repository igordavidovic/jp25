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
	private List<Usluga> usluge2;
	private List<Usluga> usluge3;
	private List<Posjeta> posjete;
	private List<Posjeta> posjete2;
	private List<Posjeta> posjete3;
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
		System.out.println("\n1. Pregled posjete");
		System.out.println("2. Unos nove posjete");
		System.out.println("3. Promjena posjete");
		System.out.println("4. Brisanje posjete");
		System.out.println("5. Povratak na glavni izbornik");
		switch (Unos.unesiInt(scanner, "Odaberi akciju", 1, 5)) {
		case 1 -> {
			posjetaPregled();
			posjetaIzbornik();
		}
		case 2 -> posjetaUnos();
		case 3 -> posjetaPromjena();
		case 4 -> posjetaBrisanje();
		case 5 -> glavniIzbornik();
		}
	}

	private void posjetaPregled() {
		int a = 1;
		for (Posjeta p : posjete) {
			System.out.println(a++ + ". " + p);
		}
	}

	private void posjetaPromjena() {
		posjetaIzbornik();
		while(true) {
		try {
			posjeta = posjete.get(Unos.unesiInt(scanner, "Unesite redni broj posjete koju želite mijenjati"));
		} catch (Exception e) {
			System.out.println("Greška : " + e.getMessage());
			continue;
		}
		break;
		}
		posjeta.setSifra(Unos.unesiInt(scanner, "Unesite novu šifru posjete"));
		posjeta.setBrojSoba(Unos.unesiInt(scanner,"Unesite novi broj soba posjete"));
		posjeta.setBrojOdraslih(Unos.unesiInt(scanner, "Unesite novi broj odraslih posjete"));
		posjeta.setBrojDjece(Unos.unesiInt(scanner, "Unesite novi broj djece posjete"));
		posjetaIzbornik();
	}
	private void posjetaUnos() {
		posjeta = unosPosjeta();
		usluge2 = new ArrayList<>();
		boolean izbor = true;
		int izb;
		while(izbor != false) {
			izb = Unos.unesiInt(scanner, "Želite li uslugu : \n1. Izabrati s liste \n2. Unijeti novu", 1, 2);
			if(izb == 1) {
				uslugaPregled();
				while(true) {
				try {
					usluga = usluge.get(Unos.unesiInt(scanner, "Unesite redni broj usluge koju želite izabrati"));
				} catch (Exception e) {
					System.out.println("Greška : " + e.getMessage());
					continue;
				}
				break;
				}
				posjete3 = new ArrayList<>();
				posjete3 = usluga.getPosjete();
				posjete3.add(posjeta);
				usluga.setPosjete(posjete3);
			}else {
				usluga = unosUsluga();
				usluge.add(usluga);
			}
			usluge2.add(usluga);
			izbor = Unos.unesiBoolean(scanner, "Želite li unijeti još jednu uslugu");
		}
		posjeta.setUsluge(usluge2);
		posjete.add(posjeta);
		posjetaIzbornik();
	}
	private Posjeta unosPosjeta() {
		posjeta = new Posjeta();
		posjeta.setSifra(Unos.unesiInt(scanner, "Unesite šifru posjete"));
		korisnikPregled();
		while(true) {
		try {
			posjeta.setKorisnik(
					korisnici.get(Unos.unesiInt(scanner, "Unesite redni broj korisnika kojega želite izabrati") - 1));
		} catch (Exception e) {
			System.out.println("Greška : " + e.getMessage());
			continue;
		}
			break;
		}
		posjeta.setDatumPrijave(new Date());
		posjeta.setDatumOdjave(new Date());
		posjeta.setBrojSoba(Unos.unesiInt(scanner, "Unesite broj soba"));
		posjeta.setBrojOdraslih(Unos.unesiInt(scanner, "Unesite broj odraslih"));
		posjeta.setBrojDjece(Unos.unesiInt(scanner, "Unesite broj djece"));
		return posjeta;
	}

	private void posjetaBrisanje() {
		posjetaPregled();
		posjete.remove(Unos.unesiInt(scanner, "Unesite redni broj posjete koju želite ukloniti") - 1);
		posjetaIzbornik();
	}

	private void uslugaIzbornik() {
		System.out.println("\n1. Pregled usluge");
		System.out.println("2. Unos nove usluge");
		System.out.println("3. Promjena usluge");
		System.out.println("4. Brisanje usluge");
		System.out.println("5. Povratak na glavni izbornik");
		switch (Unos.unesiInt(scanner, "Odaberi akciju", 1, 5)) {
		case 1 -> {
			uslugaPregled();
			uslugaIzbornik();
		}
		case 2 -> uslugaUnos();
		case 3 -> uslugaPromjena();
		case 4 -> uslugaBrisanje();
		case 5 -> glavniIzbornik();
		}
	}

	private void uslugaBrisanje() {
		uslugaPregled();
		usluge.remove(Unos.unesiInt(scanner, "Unesite redni broj usluge koju želite ukloniti"));
		uslugaIzbornik();
	}

	private void uslugaPromjena() {
		uslugaPregled();
		int a = Unos.unesiInt(scanner, "Unesite redni broj usluge koju želite mjenjati");
		usluga = usluge.get(a-1);
		usluga.setSifra(Unos.unesiInt(scanner, "Unesite novu šifru usluge"));
		usluga.setNaziv(Unos.unesiString(scanner, "Unesite novi naziv usluge"));
		usluga.setCijena(Unos.unesiBigDecimal(scanner, "Unesite novu cijenu usluge"));
		uslugaIzbornik();
	}
	
	private void uslugaUnos() {
		usluga = unosUsluga();
		posjete2 = new ArrayList<>();
		boolean izbor = true;
		int izb;
		int a;
		while(izbor != false) {
			izb = Unos.unesiInt(scanner, "Želite li posjetu : \n1. Izabrati sa liste \n2. Unijeti novu", 1, 2);
			if(izb == 1) {
				posjetaPregled();
				a = Unos.unesiInt(scanner, "Izaberite redni broj posjete koju želite izabrati");
				posjeta = posjete.get(a-1);
				usluge3 = new ArrayList<>();
				usluge3 = posjeta.getUsluge();
				usluge3.add(usluga);
				posjeta.setUsluge(usluge3);
			}else {
				posjeta = unosPosjeta();
				posjete.add(posjeta);
			}
			posjete2.add(posjeta);
			izbor = Unos.unesiBoolean(scanner, "Želite li unijeti još jednu posjetu");
		}
		usluga.setPosjete(posjete2);
		usluge.add(usluga);
		uslugaIzbornik();
	}
	private Usluga unosUsluga() {
		usluga = new Usluga();
		usluga.setSifra(Unos.unesiInt(scanner, "Unesite šifru usluge"));
		djelatnikPregled();
		while(true) {	
		try {
			usluga.setDjelatnik(djelatnici.get(Unos.unesiInt(scanner, "Unesite redni broj djelatnika kojega želite izabrati") - 1));
		} catch (Exception e) {
			System.out.println("Greška : " + e.getMessage());
			continue;
		}
		break;
	}
		usluga.setNaziv(Unos.unesiString(scanner, "Unesite naziv usluge"));
		usluga.setCijena(Unos.unesiBigDecimal(scanner, "Unesite cijenu usluge"));
		return usluga;
	}

	private void uslugaPregled() {
		int a = 1;
		for (Usluga u : usluge) {
			System.out.println(a++ + ". " + u);
		}

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
		djelatnici.remove(Unos.unesiInt(scanner, "Unesite redni broj djelatnika kojega želite izbristati") - 1);
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
