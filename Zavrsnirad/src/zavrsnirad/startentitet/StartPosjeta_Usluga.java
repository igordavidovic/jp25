package zavrsnirad.startentitet;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import zavrsnirad.entiteti.Posjeta;
import zavrsnirad.entiteti.Posjeta_usluga;
import zavrsnirad.entiteti.Usluga;

public class StartPosjeta_Usluga {
	private List<Posjeta_usluga> posjete_usluge;
	private List<Posjeta> posjete;
	private List<Usluga> usluge;
	private Scanner scanner;

	public StartPosjeta_Usluga() {
		posjete_usluge = new ArrayList<>();
		posjete = new ArrayList<>();
		usluge = new ArrayList<>();
		scanner = new Scanner(System.in);
		program();
		scanner.close();
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
			break;
		case 2:
			break;
		case 3:
			break;
		case 4:
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
		System.out.println("***************************");
		System.out.println("**** Posjeta_usluga V1 ****");
		System.out.println("***************************");
	}
}
