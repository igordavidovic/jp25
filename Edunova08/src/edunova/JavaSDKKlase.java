package edunova;

import java.util.Scanner;

public class JavaSDKKlase {

	public JavaSDKKlase() {
		String string = new String("Pero");
		
		String ime = "Pero";
		
		Osoba osoba = new Osoba("Pero");
		
		System.out.println("Osoba");
		System.out.println(osoba.hashCode());
		osoba.setIme("Marko");
		System.out.println(osoba.hashCode());
		
		//Strnig je mutable class
		System.out.println("String");
		System.out.println(ime.hashCode());
		ime="Marko";
		System.out.println(ime.hashCode());
		
		StringBuilder sb = new StringBuilder();
		sb.append("Pero");
		System.out.println("StringBuilder");
		System.out.println(sb.hashCode());
		sb.replace(0, 4, "Marko");
		System.out.println(sb.hashCode());
		
		String grad = "Osijek";
		
		// DZ: upoznati se s metodama na String klasi
		// https://docs.oracle.com/javase/7/docs/api/java/lang/String.html
		//grad.su
		
		Scanner ulaz = new Scanner(System.in);
		System.out.print("Unesi ime osobe: ");
		osoba.setIme(ulaz.nextLine());
		System.out.print("Unesi prezime osobe: ");
		osoba.setPrezime(ulaz.nextLine());
		
		ulaz.close();
		
		//lošiji način
		System.out.println(osoba.getIme() + " " + osoba.getPrezime());
		
		
		// bolji način -> pogledaj klasu Osoba
		System.out.println(osoba.getImePrezime());
		
		// implementacija metode toString() u klasi Osoba
		System.out.println(osoba);
		
		
		Osoba o1 = new Osoba("Ana");
		Osoba o2 = new Osoba("Ana");
		
		System.out.println(o1.equals(o2));
		
		
		Polaznik polaznik = new Polaznik();
		
		
	}
	
	public static void main(String[] args) {
		new JavaSDKKlase();
	}
}
