package edunova.viseoblicje;

public class Predavac extends Osoba {

	private String iban;

	public String getIban() {
		return iban;
	}

	public void setIban(String iban) {
		this.iban = iban;
	}

	@Override
	public String predstaviSe() {
		return "Ja sam predavač" + getIme() + " " + getPrezime() + ", " + iban;
	}
	
}
