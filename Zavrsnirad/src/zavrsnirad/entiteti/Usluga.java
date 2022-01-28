package zavrsnirad.entiteti;

import java.math.BigDecimal;

public class Usluga {
	private Djelatnik djelatnik;
	private String naziv;
	private BigDecimal cijena;

	public Usluga() {

	}

	public Usluga(Djelatnik djelatnik, String naziv, BigDecimal cijena) {
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
		return new StringBuilder().append(djelatnik.getIme()).append(" ").append(djelatnik.getPrezime()).append("  ").append(naziv).append("  ").append(cijena).toString();
	}

}
