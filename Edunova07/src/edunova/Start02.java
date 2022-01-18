package edunova;

public class Start02 {

	public static void main(String[] args) {
		Racun racun = new Racun();
		
		Adresa adresa = new Adresa();
		adresa.setUlica("Ružina 12");
		
		//racun.getAdresa().setUlica("Ružina 12"); nullpointerexception
		racun.setAdresa(adresa);
		
		System.out.println(racun.getAdresa().getUlica());
		
		// na adresi postavite županiju Osječko baranjsku
		Zupanija zupanija = new Zupanija();
		zupanija.setNaziv("OBŽ");
		Mjesto mjesto = new Mjesto();
		mjesto.setZupanija(zupanija);
		adresa.setMjesto(mjesto);
		// i ispišite naziv županije krenuvši od objekta racun
		
		System.out.println(racun.getAdresa().getMjesto().getZupanija().getNaziv());
		
		
	}
}
