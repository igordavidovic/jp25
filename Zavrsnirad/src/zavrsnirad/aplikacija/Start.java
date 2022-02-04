package zavrsnirad.aplikacija;

import java.util.ArrayList;
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
		System.out.println("1. Rad s korisnicima");
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

	private void naslov() {
		System.out.println("***************************");
		System.out.println("****** Recepcija APP ******");
		System.out.println("***************************");
		System.out.println();
		
	}
}
