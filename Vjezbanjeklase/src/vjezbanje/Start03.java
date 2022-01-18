package vjezbanje;

public class Start03 {
	public static void main(String[] args) {
		Voznja voznja = new Voznja();
		Vozilo vozilo = new Vozilo();
		Vozac vozac = new Vozac();

		voznja.setCijena(Unos.unesiDouble("Unesi cijenu vožnje"));
		voznja.setRelacija("Vukovar - Osijek");
		voznja.setTrajanje(Unos.unesiInt("Unesi trajanje vožnje u minutama"));

		vozilo.setMarka(Unos.unesiString("Unesi marku vozila"));
		vozilo.setVrsta(Unos.unesiString("Unesi vrstu vozila"));
		
		vozac.setIme(Unos.unesiString("Unesi ime vozača"));
		vozac.setPrezime(Unos.unesiString("Unesi prezime vozača"));
		vozac.setBrojTelefona(Unos.unesiString("Unesi broj telefona"));

		vozilo.setVozac(vozac);

		voznja.setVozilo(vozilo);

		System.out.println("Vozač : " + voznja.getVozilo().getVozac().getIme() + " "
				+ voznja.getVozilo().getVozac().getPrezime() + " " + voznja.getVozilo().getVozac().getBrojTelefona());
		System.out.println("Vozilo : " + voznja.getVozilo().getMarka() + " " + voznja.getVozilo().getVrsta());
		System.out.println("Relacija : " + voznja.getRelacija());
		System.out.println("Cijena : " + voznja.getCijena());

		putnikUpit();

	}

	private static void putnikUpit() {
		int ukupnoPutnika = Unos.unesiInt("Unesi broj putnika u vožnji");

		Putnik[] putnici = new Putnik[ukupnoPutnika];
		Putnik putnik;
		for (int i = 0; i < ukupnoPutnika; i++) {
			putnik = new Putnik();
			putnik.setIme(Unos.unesiString("Unesi ime " + (i + 1) + ". putnika"));
			putnik.setPrezime(Unos.unesiString("Unesi prezime " + (i + 1) + ". putnika"));
			putnik.setBrojTelefona(Unos.unesiString("Unesi broj telefona " + (i + 1) + ". putnika"));
			putnici[i] = putnik;
		}
		int a = 1;
		for (Putnik p : putnici) {
			System.out.println("Putnik " + a++ + " : " + p.getIme() + " " + p.getPrezime() + " " + p.getBrojTelefona());
		}
	}
}
