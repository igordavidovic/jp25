package model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class Sendvic {
	private String naziv;
	private List<Sastojak> sastojci = new ArrayList<>();
	public String getNaziv() {
		return naziv;
	}
	public void setNaziv(String naziv) {
		this.naziv = naziv;
	}
	public List<Sastojak> getSastojci() {
		return sastojci;
	}
	public void setSastojci(List<Sastojak> sastojci) {
		this.sastojci = sastojci;
	}
	
	public int getTezina() {
		int t = 0;
		for(Sastojak s : sastojci) {
			t += s.getKolicina();
		}
		
		return t;
	}
	public BigDecimal getProsjecnaTezina(){

		return new BigDecimal((float)getTezina() / sastojci.size());
	}
	@Override
	public String toString() {
		return getTezina() == 0 ? naziv : naziv + " " + getTezina();
	}
}
