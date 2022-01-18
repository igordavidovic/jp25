package edunova;

public class Start01 {
	
	public static void main(String[] args) {
		// Osoba je tip podatka - klasa
		// osoba je instance variable - varijabla
		// new je konstruktor
		// Objekt je instanca klase
		Osoba osoba = new Osoba();
		
		// OVAKO NEČEMO KORISTITI
		//osoba.ime="Pero";
		//System.out.println(osoba.ime);
		// OVAKO NEČEMO KORISTITI
		
		osoba.setIme("Pero");
		
		System.out.println(osoba.getIme());
		program();
		
	}
	
	
	//Program prvo unosi koliko će se ukupno osoba unijeti
	//Za svaku osobu unosi se šifra, ime, prezime i plaća
	//Progra ispisuje imena i prezimena svih unesenih osoba kao i prosjek plaća
	private static void program() {
		
		int ukupnoOsoba = Unos.unesiInt("Unesite koliko osoba");
		Osoba[] osobe = new Osoba[ukupnoOsoba];
		
		//deklaracija instance klase Osoba s instance variable osoba
		Osoba osoba;
		
		for(int i=0;i<ukupnoOsoba;i++) {
			osoba = new Osoba();
			osoba.setSifra(Unos.unesiInt("Unesi šifru " + (i+1) + ". osobe"));
			osoba.setIme(Unos.unesiString("Unesi ime " + (i+1) + ". osobe"));
			osoba.setPrezime(Unos.unesiString("Unesi prezime " + (i+1) + ". osobe"));
			osoba.setPlaca(Unos.unesiDouble("Unesi plaću " + (i+1) + ". osobe"));
			osobe[i]=osoba;
		}
		
		for(Osoba o: osobe) {
			System.out.println(o.getIme() + " " + o.getPrezime());
		}
		System.out.println(prosjek(osobe));
		
		
		
	}
	
	// Napisati metodu tipa double naziva prosjek koja prima niz Osoba
	// i vraća prosjek svih osoba u nizu



	private static double prosjek(Osoba[] niz) {
		double prosjek = 0;
		double suma = 0;
		for(Osoba o: niz) {
			suma+=o.getPlaca();
		}
		prosjek = suma/niz.length;
		return prosjek;
	}

}
