package edunova;


public class Start03 {
	
	private Mobitel mobitel;

	public Start03() {
		mobitel = new Mobitel();
		mobitel.setNaziv("Galaxy 15");
		mobitel.setProizvodac("Samsung");
		
		System.out.println(mobitel.getNaziv());
		
		mobitel = new Mobitel("iPhone", "Apple");
		
		System.out.println(mobitel.getNaziv());
		
		
	}
	
	public static void main(String[] args) {
		new Start03();
	}
	
}
