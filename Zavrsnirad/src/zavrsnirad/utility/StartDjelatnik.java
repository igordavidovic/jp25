package zavrsnirad.utility;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import zavrsnirad.model.Djelatnik;

public class StartDjelatnik {
	private List<Djelatnik> djelatnici;
	private Scanner scanner;
	private Djelatnik djelatnik;
	
	
	private void PocetniPodaci() {
		for(int i = 0;i < 10;i++) {
			djelatnici.add(new Djelatnik(12+i,"A" + (i+1),"B" + (i+1),"R" + (i+1),"E"+(i+1)+"@.com",new BigDecimal(i*1000)));
		}
	}
	
	public StartDjelatnik() {
		djelatnici = new ArrayList<>();
		scanner = new Scanner(System.in);
		PocetniPodaci();
		program();
		scanner.close();
	}

	private void program() {
		naslov();
		izbornik();
	}

	private void izbornik() {
		System.out.println("\n1. Unos djelatnika");
		System.out.println("2. Promjena djelatnika");
		System.out.println("3. Brisanje djelatnika");
		System.out.println("4. Pregled djelatnika");
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
		for (Djelatnik d : djelatnici) {
			System.out.println(a++ + ". " + d);
		}

	}

	private void brisanje() {
		pregled();
		djelatnici.remove(Unos.unesiInt(scanner, "Unesite redni broj djelatnika koji će se ukloniti") - 1);
		izbornik();
	}

	private void promjena() {
		pregled();
		int a = Unos.unesiInt(scanner, "Unesite redni broj djelatnika koji želite mjenjati");
		djelatnik = djelatnici.get(a - 1);
		djelatnik.setSifra(Unos.unesiInt(scanner, "Unesite novu šifru"));
		djelatnik.setIme(Unos.unesiString(scanner, "Unesite novo ime"));
		djelatnik.setPrezime(Unos.unesiString(scanner, "Unesite novo prezime"));
		djelatnik.setUloga(Unos.unesiString(scanner, "Unesite novu ulogu"));
		djelatnik.setEmail(Unos.unesiString(scanner, "Unesite novi email"));
		djelatnik.setPlaca(Unos.unesiBigDecimal(scanner, "Unesite novu placu"));
		izbornik();
	}

	private void unos() {
		djelatnik = new Djelatnik();
		djelatnik.setSifra(Unos.unesiInt(scanner, "Unesite šifru djelatnika"));
		djelatnik.setIme(Unos.unesiString(scanner, "Unesite ime djelatnika"));
		djelatnik.setPrezime(Unos.unesiString(scanner, "Unesite prezime djelatnika"));
		djelatnik.setUloga(Unos.unesiString(scanner, "Unesite uloga koju djelatnik obavlja"));
		djelatnik.setEmail(Unos.unesiString(scanner, "Unesite email djelatnika"));
		djelatnik.setPlaca(Unos.unesiBigDecimal(scanner, "Unesite placu djelatnika"));
		djelatnici.add(djelatnik);
		izbornik();
	}

	private void naslov() {
		System.out.println("**********************");
		System.out.println("**** Djelatnik V1 ****");
		System.out.println("**********************");
	}

	/*public static void main(String[] args) {
		new StartDjelatnik();
	}*/
}
