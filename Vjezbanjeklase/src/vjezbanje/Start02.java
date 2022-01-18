package vjezbanje;

public class Start02 {
	public static void main(String[] args) {
		Popravak popravak = new Popravak();
		Urar urar = new Urar();
		Sat sat = new Sat();
		Vlasnik vlasnik = new Vlasnik();
		
		vlasnik.setIme("Pero");
		vlasnik.setPrezime("Perić");
		
		sat.setMarka("Tissot");
		sat.setVlasnik(vlasnik);
	
		urar.setIme("Petar");
		urar.setPrezime("Perković");
		urar.setSifra(3054);
		
		popravak.setCijena(150.00);
		popravak.setTrajanje(45);
		popravak.setSat(sat);
		popravak.setUrar(urar);
		
		System.out.println("Vlasnik sata : " + popravak.getSat().getVlasnik().getIme() + " " + popravak.getSat().getVlasnik().getPrezime() + "\nVrsta sata : " + popravak.getSat().getMarka());
		System.out.println("Urar : [" + popravak.getUrar().getSifra() + "] " + popravak.getUrar().getIme() + " " + popravak.getUrar().getPrezime());
		System.out.println("Cijena : " + popravak.getCijena());
		System.out.println("Trajanje : " + popravak.getTrajanje());
	}
}
