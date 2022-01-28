package zavrsnirad.startentitet;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import zavrsnirad.entiteti.Posjeta;

public class StartPosjeta {
	private List<Posjeta> posjete;
	private Posjeta posjeta;
	private Scanner scanner;

	public StartPosjeta() {
		posjete = new ArrayList<>();
		scanner = new Scanner(System.in);
		program();
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
			break;
		case 2:
			break;
		case 3:
			break;
		case 4:
			break;
		case 5:
			break;
		default:

		}
	}

	private void naslov() {
		System.out.println("********************");
		System.out.println("**** Posjeta V1 ****");
		System.out.println("********************");
	}

}
