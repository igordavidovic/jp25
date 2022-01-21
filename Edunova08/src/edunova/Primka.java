package edunova;

import java.math.BigDecimal;
import java.util.Date;

public class Primka extends Dokument {

	private String dobavljac;
	private boolean placeno;
	
	

	public Primka(int sifra, Date datum, BigDecimal iznos, String dobavljac, boolean placeno) {
		super(sifra, datum, iznos);
		this.dobavljac = dobavljac;
		this.placeno = placeno;
	}


	public String getDobavljac() {
		return dobavljac;
	}


	public void setDobavljac(String dobavljac) {
		this.dobavljac = dobavljac;
	}


	public boolean isPlaceno() {
		return placeno;
	}


	public void setPlaceno(boolean placeno) {
		this.placeno = placeno;
	}
	
	
}
