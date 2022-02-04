package zavrsnirad.model;

import java.util.Date;

public class Korisnik {
	private int sifra;
	private String ime;
	private String prezime;
	private String email;
	private String oib;
	private Date datumRodenja;

	public Korisnik() {

	}

	public Korisnik(int sifra,String ime, String prezime, String email, String oib, Date datumRodenja) {
		this.sifra = sifra;
		this.ime = ime;
		this.prezime = prezime;
		this.email = email;
		this.oib = oib;
		this.datumRodenja = datumRodenja;
	}

	public String getIme() {
		return ime;
	}

	public void setIme(String ime) {
		this.ime = ime;
	}

	public String getPrezime() {
		return prezime;
	}

	public void setPrezime(String prezime) {
		this.prezime = prezime;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getOib() {
		return oib;
	}

	public void setOib(String oib) {
		this.oib = oib;
	}

	public Date getDatumRodenja() {
		return datumRodenja;
	}

	public void setDatumRodenja(Date datumRodenja) {
		this.datumRodenja = datumRodenja;
	}

	@Override
	public String toString() {
		return new StringBuilder().append(sifra).append("  ").append(ime).append(" ").append(prezime).append("  ").append(oib).append("  ").append(email).toString();
	}

	public int getSifra() {
		return sifra;
	}

	public void setSifra(int sifra) {
		this.sifra = sifra;
	}
	
}
