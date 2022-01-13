package edunova;

public class E01_Metode {
	
	// public je način pristupa https://www.cis.upenn.edu/~bcpierce/courses/629/papers/Java-tutorial/java/javaOO/accesscontrol.html
	// static označava da metodu možemo pozvati bez instanciranja klase
	// void (mjesto) je oznaka tip podatka, void znači da ne vraća vrijednost
	// naziv metode (main)
	// u zagradi () lista parametara koje metoda prima
	public static void main(String[] args) {
		// rad s metodama podrazumjeva
		// 2. pozvati metodu
		pozdravi();
	}
	
	// rad s metodama podrazumjeva
	// 1. napisati metodu
	private static void pozdravi() {
		System.out.println("Hello world");
		System.out.println("-----------");
	}

}
