package program;

import java.util.ArrayList;
import java.util.List;

import model.Sastojak;
import model.Sendvic;
import subota.Zadaci;

public class Start {
	public static void main(String[] args) {
		//Zadaci zadaci = new Zadaci();	
		List<Sastojak> sastojci = new ArrayList<>();
		Sendvic sendvic = new Sendvic();
		sendvic.setNaziv("Indeks");
		Sastojak sastojak = new Sastojak();
		sastojak.setNaziv("Piletina");
		sastojak.setKolicina(200);
		sastojci.add(sastojak);
		sastojak = new Sastojak();
		sastojak.setNaziv("Urnebes");
		sastojak.setKolicina(50);
		sastojci.add(sastojak);
		sastojak = new Sastojak();
		sastojak.setNaziv("Ajvar");
		sastojak.setKolicina(35);
		sastojci.add(sastojak);
		sendvic.setSastojci(sastojci);
		System.out.println(sendvic.getNaziv() + " " + sendvic.getTezina());
		sendvic = new Sendvic();
		sastojci = new ArrayList<>();
		sendvic.setNaziv("Brkin");
		sastojak = new Sastojak("Majoneza",150);
		sastojci.add(sastojak);
		sastojak = new Sastojak("Kulen",253);
		sastojci.add(sastojak);
		sastojak = new Sastojak("Salata",105);
		sastojci.add(sastojak);
		sastojci.add(new Sastojak("Rajčica",70));
		sastojci.add(new Sastojak("Šunka",120));
		sendvic.setSastojci(sastojci);
		System.out.println(sendvic);
		System.out.println(sendvic.getProsjecnaTezina());
	}
}
