package edunova;

import java.math.BigDecimal;
import java.util.Date;

public class Racun extends Dokument {
	
	private String kupac;

	public Racun(int sifra, Date datum, BigDecimal iznos, String kupac) {
		super(sifra, datum, iznos);
		this.kupac = kupac;
	}
	
	

}
