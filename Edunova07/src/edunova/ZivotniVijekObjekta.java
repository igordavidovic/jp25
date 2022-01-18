package edunova;

public class ZivotniVijekObjekta {
	
	// 1. svojstvo je deklairano, vrijednost je null
	private ZivotniVijekObjekta zivotniVijekObjekta;
	
	// 2. konstruiranje
	public ZivotniVijekObjekta() {
		// izvodi se pri izvođenju linije koda s ključnom rječju new
		System.out.println("U konstruktoru");
	}

	public ZivotniVijekObjekta getZivotniVijekObjekta() {
		return zivotniVijekObjekta;
	}

	public void setZivotniVijekObjekta(ZivotniVijekObjekta zivotniVijekObjekta) {
		this.zivotniVijekObjekta = zivotniVijekObjekta;
	}
	
	
	
	
	public static void main(String[] args) {
		// poziv konstruktora
		System.out.println("Na početku izvođenja programa");
		ZivotniVijekObjekta zivotniVijekObjekta = new ZivotniVijekObjekta();
		
		// 3. korištenje
		zivotniVijekObjekta.setZivotniVijekObjekta(null);
		System.out.println("Korištenje objekta");
		// 4. UNIŠTENJE - radi GC Garbagge Collector
		// OVO NE MORAMO RADITI
		System.out.println("GC ga sam uništi");
	 
	}

}
