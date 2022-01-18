package edunova;

// primjer POJO

// Klasa je opisnik objekta.
public class Osoba {
	
	// OVAKO NEČEMO KORISTITI
	//int sifra;
	//String ime;
	//String prezime;
	// OVAKO NEČEMO KORISTITI
	
	// OOP princip učahurivanje - encapsulation
	// sakrivena (učahurena) svojstva
	private int sifra;
	private String ime;
	private String prezime;
	private double placa;
	
	
	// javno dostupne get i set metode
	public int getSifra() {
		return sifra;
	}
	public void setSifra(int sifra) {
		this.sifra = sifra;
	}
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
	public double getPlaca() {
		return placa;
	}
	public void setPlaca(double placa) {
		this.placa = placa;
	}
	
	
	

}
