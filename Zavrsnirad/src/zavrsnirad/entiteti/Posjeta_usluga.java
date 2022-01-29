package zavrsnirad.entiteti;

public class Posjeta_usluga {
	private Usluga usluga;
	private Posjeta posjeta;

	public Posjeta_usluga() {

	}

	public Posjeta_usluga(Usluga usluga, Posjeta posjeta) {
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

}
