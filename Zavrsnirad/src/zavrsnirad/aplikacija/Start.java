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
	private List<Posjeta> posjete;
	private List<Posjeta> posjete2;
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
			posjetaPregled(posjete);
			posjetaIzbornik();
		}
		case 2 -> posjetaUnos();
		case 3 -> posjetaPromjena();
		case 4 -> posjetaBrisanje();
		case 5 -> glavniIzbornik();
		}
	}

	private void posjetaPregled(List<Posjeta> posjete) {
		int a = 1;
		for (Posjeta p : posjete) {
			System.out.println(a++ + ". " + p);
		}
	}

	private void posjetaPromjena() {
		posjetaPregled(posjete);
		posjeta = posjete
				.get(Unos.unesiInt(scanner, "Unesite redni broj posjete koju želite mijenjati", 1, posjete.size()) - 1);
		posjeta.setSifra(Unos.unesiInt(scanner, "Unesite novu šifru posjete"));
		posjeta.setDatumPrijave(new Date());
		posjeta.setDatumOdjave(new Date());
		posjeta.setBrojSoba(Unos.unesiInt(scanner, "Unesite novi broj soba posjete"));
		posjeta.setBrojOdraslih(Unos.unesiInt(scanner, "Unesite novi broj odraslih posjete"));
		posjeta.setBrojDjece(Unos.unesiInt(scanner, "Unesite novi broj djece posjete"));
		boolean izbor = true;
		int izb;
		while (izbor != false) {
			izb = Unos.unesiInt(scanner, "Želite li kod posjete uslugu \n1. Ukloniti \n2. Dodati", 1, 2);
			if (izb == 1) {
				uslugaPregled(posjeta.getUsluge());
				usluge2 = posjeta.getUsluge();
				if (usluge2.size() == 0) {
					System.out.println("Na posjeti se ne nalazi niti jedna usluga tako da nemate što ukloniti!");
					continue;
				}
				usluga = usluge2
						.get(Unos.unesiInt(scanner, "Unesite redni broj usluge koju želite ukloniti", 1, usluge2.size())
								- 1);
				usluge2.remove(usluga);
				posjete2 = usluga.getPosjete();
				posjete2.remove(posjeta);
			} else {
				izb = Unos.unesiInt(scanner, "Želite li uslugu : \n1. Izabrati s liste \n2. Unijeti novu", 1, 2);
				if (izb == 1) {
					if (usluge.size() == 0) {
						System.out
								.println("Na listi usluga se ne nalazi niti jedna ne možete koristit izabir sa liste!");
						continue;
					}
					uslugaPregled(usluge);
					usluga = usluge.get(
							Unos.unesiInt(scanner, "Unesite redni broj usluge koju želite izabrati", 1, usluge.size())
									- 1);
					usluge2 = posjeta.getUsluge();
					usluge2.add(usluga);
					posjete2 = usluga.getPosjete();
					posjete2.add(posjeta);
				} else {
					usluga = unosUsluga();
					usluge.add(usluga);
					usluge2 = posjeta.getUsluge();
					usluge2.add(usluga);
					posjete2 = new ArrayList<>();
					posjete2.add(posjeta);
					usluga.setPosjete(posjete2);
				}
			}
			usluga.setPosjete(posjete2);
			posjeta.setUsluge(usluge2);
			uslugaPregled(posjeta.getUsluge());
			izbor = Unos.unesiBoolean(scanner, "Želite li i dalje uređivati usluge?");
		}
		posjetaIzbornik();
	}

	private void posjetaUnos() {
		posjeta = unosPosjeta();
		usluge2 = new ArrayList<>();
		boolean izbor = true;
		int izb;
		while (izbor != false) {
			izb = Unos.unesiInt(scanner, "Želite li uslugu : \n1. Izabrati s liste \n2. Unijeti novu", 1, 2);
			if (izb == 1) {
				uslugaPregled(usluge);
				if (usluge.size() == 0) {
					System.out.println("Na listi usluga se ne nalazi niti jedna ne možete koristit izabir sa liste!");
					continue;
				}
				usluga = usluge.get(
						Unos.unesiInt(scanner, "Unesite redni broj usluge koju želite izabrati", 1, usluge.size()) - 1);
				posjete2 = new ArrayList<>();
				posjete2 = usluga.getPosjete();
				posjete2.add(posjeta);
				usluga.setPosjete(posjete2);
			} else {
				usluga = unosUsluga();
				usluge.add(usluga);
				posjete2 = new ArrayList<>();
				posjete2.add(posjeta);
				usluga.setPosjete(posjete2);
			}
			usluge2.add(usluga);
			izbor = Unos.unesiBoolean(scanner, "Želite li dodati još jednu uslugu");
		}
		posjeta.setUsluge(usluge2);
		posjete.add(posjeta);
		posjetaIzbornik();
	}

	private Posjeta unosPosjeta() {
		posjeta = new Posjeta();
		posjeta.setSifra(Unos.unesiInt(scanner, "Unesite šifru posjete"));
		korisnikPregled();
		if (korisnici.size() == 0) {
			System.out.println("Na listi korisnika se ne nalazi ni jedan ne možete koristiti izabir s liste!");
		} else {
			posjeta.setKorisnik(korisnici.get(
					Unos.unesiInt(scanner, "Unesite redni broj korisnika kojega želite izabrati", 1, korisnici.size())
							- 1));
		}
		posjeta.setDatumPrijave(new Date());
		posjeta.setDatumOdjave(new Date());
		posjeta.setBrojSoba(Unos.unesiInt(scanner, "Unesite broj soba"));
		posjeta.setBrojOdraslih(Unos.unesiInt(scanner, "Unesite broj odraslih"));
		posjeta.setBrojDjece(Unos.unesiInt(scanner, "Unesite broj djece"));
		return posjeta;
	}

	private void posjetaBrisanje() {
		if(posjete.size() == 0) {
			System.out.println("U listi posjeta se ne nalazi niti jedna te se nemože brisati");
		}
		posjetaPregled(posjete);
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
			uslugaPregled(usluge);
			uslugaIzbornik();
		}
		case 2 -> uslugaUnos();
		case 3 -> uslugaPromjena();
		case 4 -> uslugaBrisanje();
		case 5 -> glavniIzbornik();
		}
	}

	private void uslugaBrisanje() {
		if(usluge.size() == 0) {
			System.out.println("U listi usluga se ne nalazi niti jedna te se nemože brisati");
		}
		uslugaPregled(usluge);
		usluge.remove(Unos.unesiInt(scanner, "Unesite redni broj usluge koju želite ukloniti") - 1);
		uslugaIzbornik();
	}

	private void uslugaPromjena() {
		uslugaPregled(usluge);
		usluga = usluge.get(Unos.unesiInt(scanner, "Izaberite uslugu koju želite mjenjati", 1, usluge.size()) - 1);
		usluga.setSifra(Unos.unesiInt(scanner, "Unesite novu šifru usluge"));
		usluga.setNaziv(Unos.unesiString(scanner, "Unesite novi naziv usluge"));
		usluga.setCijena(Unos.unesiBigDecimal(scanner, "Unesite novu cijenu usluge"));
		boolean izbor = true;
		int izb;
		while (izbor != false) {
			izb = Unos.unesiInt(scanner, "Želite li kod usluge posjetu \n1. Ukloniti \n2. Dodati", 1, 2);
			if (izb == 1) {
				posjetaPregled(usluga.getPosjete());
				posjete2 = usluga.getPosjete();
				if (posjete2.size() == 0) {
					System.out.println("Na usluzi se ne nalazi niti jedna posjeta tako da nemate što ukloniti!");
					continue;
				}
				posjeta = posjete2.get(
						Unos.unesiInt(scanner, "Unesite redni broj usluge koju želite ukloniti", 1, posjete2.size())
								- 1);
				posjete2.remove(posjeta);
				usluge2 = posjeta.getUsluge();
				usluge2.remove(usluga);
			} else {
				izb = Unos.unesiInt(scanner, "Želite li posjetu : \n1. Izabrati s liste \n2. Unijeti novu", 1, 2);
				if (izb == 1) {
					posjetaPregled(posjete);
					if (posjete.size() == 0) {
						System.out.println("Na listi posjeta se ne nalazi ni jedna ne možete koristiti izabir s liste");
						continue;
					}
					posjeta = posjete.get(
							Unos.unesiInt(scanner, "Unesite redni broj usluge koju želite izabrati", 1, usluge.size())
									- 1);
					posjete2 = usluga.getPosjete();
					posjete2.add(posjeta);
					usluge2 = posjeta.getUsluge();
					usluge2.add(usluga);
				} else {
					posjeta = unosPosjeta();
					posjete.add(posjeta);
					posjete2 = usluga.getPosjete();
					posjete2.add(posjeta);
					usluge2 = new ArrayList<>();
					usluge2.add(usluga);
				}
			}
			usluga.setPosjete(posjete2);
			posjeta.setUsluge(usluge2);
			uslugaPregled(posjeta.getUsluge());
			izbor = Unos.unesiBoolean(scanner, "Želite li i dalje uređivati usluge?");
		}
		uslugaIzbornik();
	}

	private void uslugaUnos() {
		usluga = unosUsluga();
		posjete2 = new ArrayList<>();
		boolean izbor = true;
		int izb;
		while (izbor != false) {
			izb = Unos.unesiInt(scanner, "Želite li posjetu : \n1. Izabrati sa liste \n2. Unijeti novu", 1, 2);
			if (izb == 1) {
				posjetaPregled(posjete);
				if (posjete.size() == 0) {
					System.out.println("Na listi posjeta se ne nalazi ni jedna ne možete koristiti izabir s liste");
					continue;
				}
				posjeta = posjete.get(
						Unos.unesiInt(scanner, "Unesite redni broj posjete koju želite izabrati", 1, posjete.size())
								- 1);
				usluge2 = new ArrayList<>();
				usluge2 = posjeta.getUsluge();
				usluge2.add(usluga);
				posjeta.setUsluge(usluge2);
			} else {
				posjeta = unosPosjeta();
				posjete.add(posjeta);
				usluge2 = new ArrayList<>();
				usluge2.add(usluga);
				posjeta.setUsluge(usluge2);
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
		if (djelatnici.size() == 0) {
			System.out.println("Na listi djelatnika se ne nalazi niti jedan ne možete koristiti izabir s liste!");
		} else {
			usluga.setDjelatnik(djelatnici.get(
					Unos.unesiInt(scanner, "Unesite redni broj djelatnika kojega želite izabrati", 1, djelatnici.size())
							- 1));
		}
		usluga.setNaziv(Unos.unesiString(scanner, "Unesite naziv usluge"));
		usluga.setCijena(Unos.unesiBigDecimal(scanner, "Unesite cijenu usluge"));
		return usluga;
	}

	private void uslugaPregled(List<Usluga> usluge) {
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
		if(djelatnici.size() == 0) {
			System.out.println("U listi djelatnika se ne nalazi niti jedna te se nemože brisati");
		}
		djelatnikPregled();
		djelatnici.remove(Unos.unesiInt(scanner, "Unesite redni broj djelatnika kojega želite izbristati") - 1);
		djelatnikIzbornik();
	}

	private void djelatnikPromjena() {
		djelatnikIzbornik();
		if(djelatnici.size() == 0) {
			System.out.println("U listi djelatnika se ne nalazi niti jedna te se nemože mjenjati");
		}
		djelatnik = djelatnici
				.get(Unos.unesiInt(scanner, "Unesite redni broj djelatnika kojeg želite mjenjati", 1, djelatnici.size())
						- 1);
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
		if(korisnici.size() == 0) {
			System.out.println("U listi korisnika se ne nalazi niti jedna te se nemože brisati");
		}
		korisnikPregled();
		korisnici.remove(Unos.unesiInt(scanner, "Unesite redni broj korisnika kojega želite izbrisati") - 1);
		korisnikIzbornik();
	}

	private void korisnikPromjena() {
		korisnikPregled();
		if(korisnici.size() == 0) {
			System.out.println("U listi korisnika se ne nalazi niti jedna te se nemože mjenjati");
		}
		korisnik = korisnici.get(
				Unos.unesiInt(scanner, "Unesite redni broj korisnika kojeg želite mjenjati", 1, korisnici.size()) - 1);
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
