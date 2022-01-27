package edunova.viseoblicje;

// Apstraktna klasa je ona klasa koja nema implementaciju (nije moguće napraviti instancu)
// Kreira se kako bi sadržavala zajednička svojsta svim podklasama koje ju nasljede
public abstract class Osoba {

	private String ime;
	private String prezime;
	
	public abstract String predstaviSe();
	
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
	
	
}
