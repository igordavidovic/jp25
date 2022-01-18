package vjezbanje;

public class Start01 {
	
	public static void main(String[] args) {
		Usluga usluga = new Usluga();
		Djelatnica djelatnica = new Djelatnica();
		Korisnik korisnik = new Korisnik();
		
		usluga.setCijena(99.99);
		usluga.setNaziv("Muško šišanje");
		
		djelatnica.setIme("Mira");
		djelatnica.setPrezime("Mirković");
		djelatnica.setSifra(254);
		
		korisnik.setIme("Pero");
		korisnik.setPrezime("Perić");
		
		usluga.setDjelatnica(djelatnica);
		usluga.setKorisnik(korisnik);
	
		System.out.println(usluga.getDjelatnica().getSifra() + " " + usluga.getDjelatnica().getIme() + " " + usluga.getDjelatnica().getPrezime());
		System.out.println(usluga.getKorisnik().getIme() + " " + usluga.getKorisnik().getPrezime());
		System.out.println(usluga.getNaziv() + " " + usluga.getCijena());
	}
	
}
