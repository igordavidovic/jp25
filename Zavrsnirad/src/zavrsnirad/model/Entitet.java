package zavrsnirad.model;

public abstract class Entitet {
	private int sifra;
	
	public Entitet() {
		
	}
	
	public Entitet(int sifra) {
		this.sifra = sifra;
	}
	
	public int getSifra() {
		return sifra;
	}

	public void setSifra(int sifra) {
		this.sifra = sifra;
	}
	
	
}
