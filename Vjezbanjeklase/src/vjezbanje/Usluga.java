package vjezbanje;

public class Usluga {
	private String naziv;
	private double cijena;
	private Djelatnica djelatnica;
	private Korisnik korisnik;
	
	public String getNaziv() {
		return naziv;
	}
	public void setNaziv(String naziv) {
		this.naziv = naziv;
	}
	public double getCijena() {
		return cijena;
	}
	public void setCijena(double cijena) {
		this.cijena = cijena;
	}
	public Djelatnica getDjelatnica() {
		return djelatnica;
	}
	public void setDjelatnica(Djelatnica djelatnica) {
		this.djelatnica = djelatnica;
	}
	public Korisnik getKorisnik() {
		return korisnik;
	}
	public void setKorisnik(Korisnik korisnik) {
		this.korisnik = korisnik;
	}
	
	
}
