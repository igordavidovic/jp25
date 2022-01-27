package zavrsnirad;

import java.util.Date;

public class Posjeta {
	private Korisnik korisnik;
	private Date datumPrijave;
	private Date datumOdjave;
	private int brojSoba;
	private int brojOdraslih;
	private int brojDjece;
	
	public Korisnik getKorisnik() {
		return korisnik;
	}
	public void setKorisnik(Korisnik korisnik) {
		this.korisnik = korisnik;
	}
	public Date getDatumPrijave() {
		return datumPrijave;
	}
	public void setDatumPrijave(Date datumPrijave) {
		this.datumPrijave = datumPrijave;
	}
	public Date getDatumOdjave() {
		return datumOdjave;
	}
	public void setDatumOdjave(Date datumOdjave) {
		this.datumOdjave = datumOdjave;
	}
	public int getBrojSoba() {
		return brojSoba;
	}
	public void setBrojSoba(int brojSoba) {
		this.brojSoba = brojSoba;
	}
	public int getBrojOdraslih() {
		return brojOdraslih;
	}
	public void setBrojOdraslih(int brojOdraslih) {
		this.brojOdraslih = brojOdraslih;
	}
	public int getBrojDjece() {
		return brojDjece;
	}
	public void setBrojDjece(int brojDjece) {
		this.brojDjece = brojDjece;
	}
	
	
}
