package edunova.viseoblicje;

public class Polaznik extends Osoba {

	private String brojUgovora;

	public String getBrojUgovora() {
		return brojUgovora;
	}

	public void setBrojUgovora(String brojUgovora) {
		this.brojUgovora = brojUgovora;
	}

	@Override
	public String predstaviSe() {
		return "Ja sam polaznik " + getIme() + " " + getPrezime() + ", " + brojUgovora;
	}
	
	
	
}
