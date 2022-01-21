package edunova;

import java.util.Objects;

public class Osoba extends Object { // Naučiti metode klase Object https://docs.oracle.com/javase/7/docs/api/java/lang/Object.html

	private String ime;
	private String prezime;
	
	public Osoba() {
		
	}

	public Osoba(String ime) {
		this.ime = ime;
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
	
	public String getImePrezime() {
		return new StringBuilder().append(ime).append(" ").append(prezime).toString();
	}
	
	@Override
		public String toString() {
			return getImePrezime();
		}

	@Override
	public int hashCode() {
		return Objects.hash(ime, prezime);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Osoba other = (Osoba) obj;
		return Objects.equals(ime, other.ime) && Objects.equals(prezime, other.prezime);
	}
	
	
	
	
}
