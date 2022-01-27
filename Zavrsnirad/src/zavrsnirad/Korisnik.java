package zavrsnirad;

import java.util.Date;

public class Korisnik {
	private String ime;
	private String prezime;
	private String email;
	private String oib;
	private Date datumRodenja;
	
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
	
	
}
