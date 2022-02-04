package zavrsnirad.model;

import java.math.BigDecimal;

public class Djelatnik {
	private int sifra;
	private String ime;
	private String prezime;
	private String uloga;
	private String email;
	private BigDecimal placa;

	public Djelatnik() {

	}

	public Djelatnik(int sifra,String ime, String prezime, String uloga, String email, BigDecimal placa) {
		this.sifra = sifra;
		this.ime = ime;
		this.prezime = prezime;
		this.uloga = uloga;
		this.email = email;
		this.placa = placa;
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

	public String getUloga() {
		return uloga;
	}

	public void setUloga(String uloga) {
		this.uloga = uloga;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public BigDecimal getPlaca() {
		return placa;
	}

	public void setPlaca(BigDecimal placa) {
		this.placa = placa;
	}

	@Override
	public String toString() {
		return new StringBuilder().append(sifra).append("  ").append(ime).append(" ").append(prezime).append("  ").append(uloga).append("  ").append(email).append("  ").append(placa).toString();
	}

	public int getSifra() {
		return sifra;
	}

	public void setSifra(int sifra) {
		this.sifra = sifra;
	}

}