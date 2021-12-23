package edunova;

public class Zadatak4 {
	
	// Koristeći do while petlju ispišite zbroj svih parnih brojeva od 98 do 27
	
	public static void main(String[] args) {
		int suma=0;
		int b=98;
		
		
		do {
			if(b%2==0) {
				suma+=b;
			}
		}while(b-->27);
		System.out.println(suma);
	}

}
