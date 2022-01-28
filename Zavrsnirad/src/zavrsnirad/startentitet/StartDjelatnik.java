package zavrsnirad.startentitet;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import zavrsnirad.entiteti.Djelatnik;

public class StartDjelatnik {
	private List<Djelatnik> djelatnici;
	private Scanner scanner;
	private Djelatnik djelatnik;

	public StartDjelatnik() {
		djelatnici = new ArrayList<>();
		scanner = new Scanner(System.in);
		program();
		scanner.close();
	}

	private void program() {
		naslov();
		izbornik();
	}

	private void izbornik() {
		System.out.println("\n1. Unos mobitela");
		System.out.println("2. Promjena mobitela");
		System.out.println("3. Brisanje mobitela");
		System.out.println("4. Pregled mobitela");
		System.out.println("5. Izlaz iz programa");
		switch (Unos.unesiInt(scanner, "Izaberi akciju")) {
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
			System.out.println("\nHvala Što ste koristili naš program, doviđenja!");
			break;
		default:
			System.out.println("Izabrana akcija nije moguća");
			izbornik();
		}
	}

	private void pregled() {
		int a = 1;
		for (Djelatnik d : djelatnici) {
			System.out.println(a++ + ". " + d);
		}

	}

	private void brisanje() {
		pregled();
		djelatnici.remove(Unos.unesiInt(scanner, "Unesi redni broj djelatnika koji će se ukloniti") - 1);

	}

	private void promjena() {
		pregled();
		int a = Unos.unesiInt(scanner, "Unesi redni broj djelatnika koji želite mjenjati");
		djelatnik = djelatnici.get(a - 1);
		djelatnik.setIme(Unos.unesiString(scanner, "Unesi novo ime"));
		djelatnik.setPrezime(Unos.unesiString(scanner, "Unesi novo prezime"));
		djelatnik.setUloga(Unos.unesiString(scanner, "Unesi novu ulogu"));
		djelatnik.setEmail(Unos.unesiString(scanner, "Unesi novi email"));
		djelatnik.setPlaca(Unos.unesiBigDecimal(scanner, "Unesi novu placu"));
		izbornik();
	}

	private void unos() {
		djelatnik = new Djelatnik();
		djelatnik.setIme(Unos.unesiString(scanner, "Unesi ime djelatnika"));
		djelatnik.setPrezime(Unos.unesiString(scanner, "Unesi prezime djelatnika"));
		djelatnik.setUloga(Unos.unesiString(scanner, "Unesi uloga koju djelatnik obavlja"));
		djelatnik.setEmail(Unos.unesiString(scanner, "Unesi email djelatnika"));
		djelatnik.setPlaca(Unos.unesiBigDecimal(scanner, "Unesi placu djelatnika"));
		djelatnici.add(djelatnik);
		izbornik();
	}

	private void naslov() {
		System.out.println("**********************");
		System.out.println("**** Djelatnik V1 ****");
		System.out.println("**********************");
	}

	public static void main(String[] args) {
		new StartDjelatnik();
	}
}
