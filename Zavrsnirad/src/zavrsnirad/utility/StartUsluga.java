package zavrsnirad.utility;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import zavrsnirad.model.Djelatnik;
import zavrsnirad.model.Usluga;

public class StartUsluga {
	private List<Djelatnik> djelatnici;
	private Scanner scanner;
	private Djelatnik djelatnik;
	private List<Usluga> usluge;
	private Usluga usluga;

	public StartUsluga() {
		djelatnici = new ArrayList<>();
		usluge = new ArrayList<>();
		scanner = new Scanner(System.in);
		PocetniPodaci();
		program();
		scanner.close();
	}

	private void PocetniPodaci() {
		djelatnik = new Djelatnik();
		for (int i = 0; i < 10; i++) {
			djelatnici.add(new Djelatnik(12+i,"A" + (i + 1), "B" + (i + 1), "R" + (i + 1), "E" + (i + 1) + "@.com",
					new BigDecimal(i * 1000)));
			djelatnik = djelatnici.get(i);
			usluge.add(new Usluga(23+i,djelatnik, "U" + (i + 1), new BigDecimal(i * 100)));
		}
	}

	private void program() {
		naslov();
		izbornik();
	}

	private void izbornik() {
		System.out.println("\n1. Unos usluge");
		System.out.println("2. Promjena usluge");
		System.out.println("3. Brisanje usluge");
		System.out.println("4. Pregled usluge");
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
			//System.out.println("\nHvala što ste koristili naš program, doviđenja!");
			new StartProgram();
			break;
		default:
			System.out.println("Izabrana akcija nije moguća");
			izbornik();
		}
	}

	private void pregled() {
		int a = 1;
		for (Usluga u : usluge) {
			System.out.println(a++ + ". " + u);
		}
	}

	private void brisanje() {
		pregled();
		usluge.remove(Unos.unesiInt(scanner, "Unesite redni broj usluge koju želite ukloniti") - 1);
		izbornik();
	}

	private void promjena() {
		pregled();
		int a = Unos.unesiInt(scanner, "Unesite redni broj usluge koju želite promjeniti");
		usluga = usluge.get(a - 1);
		usluga.setSifra(Unos.unesiInt(scanner, "Unesite novu sifru"));
		pregledDjelatnik();
		int b = Unos.unesiInt(scanner, "Unesite redni broj djelatnika s kojima želite promjeniti staroga");
		usluga.setDjelatnik(djelatnici.get(b-1));
		usluga.setNaziv(Unos.unesiString(scanner, "Unesite novi naziv"));
		usluga.setCijena(Unos.unesiBigDecimal(scanner, "Unesite novu cijenu"));
		izbornik();
	}

	private void unos() {
		usluga = new Usluga();
		usluga.setSifra(Unos.unesiInt(scanner, "Unesite sifru usluge"));
		pregledDjelatnik();
		int a = Unos.unesiInt(scanner, "Izaberite redni broj djelatnika kojega želite");
		usluga.setDjelatnik(djelatnici.get(a-1));
		usluga.setNaziv(Unos.unesiString(scanner, "Unesite naziv usluge"));
		usluga.setCijena(Unos.unesiBigDecimal(scanner, "Unesite cijenu usluge"));
		usluge.add(usluga);
		izbornik();
	}

	private void naslov() {
		System.out.println("*******************");
		System.out.println("**** Usluga V1 ****");
		System.out.println("*******************");
	}

	private void pregledDjelatnik() {
		int a = 1;
		for (Djelatnik d : djelatnici) {
			System.out.println(a++ + ". " + d);
		}
	}

	/*public static void main(String[] args) {
		new StartUsluga();
	}*/
}
