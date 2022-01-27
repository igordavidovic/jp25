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
	}

	private void program() {
		naslov();
		izbornik();
	}

	private void izbornik() {
		// TODO Auto-generated method stub
		
	}

	private void naslov() {
		System.out.println("**********************");
		System.out.println("**** Djelatnik V1 ****");
		System.out.println("**********************");
	}
	
	
}
