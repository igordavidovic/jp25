package zavrsnirad.model;

import java.math.BigDecimal;

public class Usluga {
	private int sifra;
	private Djelatnik djelatnik;
	private String naziv;
	private BigDecimal cijena;

	public Usluga() {

	}

	public Usluga(int sifra,Djelatnik djelatnik, String naziv, BigDecimal cijena) {
		this.sifra = sifra;
		this.djelatnik = djelatnik;
		this.naziv = naziv;
		this.cijena = cijena;
	}

	public Djelatnik getDjelatnik() {
		return djelatnik;
	}

	public void setDjelatnik(Djelatnik djelatnik) {
		this.djelatnik = djelatnik;
	}

	public String getNaziv() {
		return naziv;
	}

	public void setNaziv(String naziv) {
		this.naziv = naziv;
	}

	public BigDecimal getCijena() {
		return cijena;
	}

	public void setCijena(BigDecimal cijena) {
		this.cijena = cijena;
	}

	@Override
	public String toString() {
		return new StringBuilder().append(sifra).append("  ").append(djelatnik.getIme()).append(" ").append(djelatnik.getPrezime()).append("  ").append(naziv).append("  ").append(cijena).toString();
	}

	public int getSifra() {
		return sifra;
	}

	public void setSifra(int sifra) {
		this.sifra = sifra;
	}

}
