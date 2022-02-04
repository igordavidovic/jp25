package zavrsnirad.model;

public class Posjeta_usluga {
	private int sifra;
	private Usluga usluga;
	private Posjeta posjeta;

	public Posjeta_usluga() {

	}

	public Posjeta_usluga(int sifra,Usluga usluga, Posjeta posjeta) {
		this.sifra = sifra;
		this.usluga = usluga;
		this.posjeta = posjeta;
	}

	public Usluga getUsluga() {
		return usluga;
	}

	public void setUsluga(Usluga usluga) {
		this.usluga = usluga;
	}

	public Posjeta getPosjeta() {
		return posjeta;
	}

	public void setPosjeta(Posjeta posjeta) {
		this.posjeta = posjeta;
	}

	public int getSifra() {
		return sifra;
	}

	public void setSifra(int sifra) {
		this.sifra = sifra;
	}

	@Override
	public String toString() {
		return new StringBuilder().append(sifra).append("  ").append(posjeta.getSifra()).append("  ").append(usluga.getSifra()).toString();
	}
	
}
