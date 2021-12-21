package edunova;

import java.util.Arrays;

public class E01_JednodimenzionalniNiz {

	public static void main(String[] args) {
		
		// ako želimo pohraniti temperatur u godini
		
		// ako je potrebno pohraniti više vrijednosti istog tipa podataka tada korisnimo niz
		
		int[] temperature = new int[12]; //glavna karakteristika niza je to što u startu moramo znati veličinu
		
		System.out.println(temperature.length);
		
		System.out.println(Arrays.toString(temperature));
		
		//drugi način inicijalizacija
		//int niz[] = new int[5];
		
		
		// vrijednosti se dodjeljuju pomoću indeksa koji kreće od broja 0
		temperature[0] = -1; //siječanj
		temperature[1] = -2;
		temperature[2] = 3;
		temperature[3] = 9;
		temperature[4] = 14;
		temperature[5] = 21;
		temperature[6] = 29;
		temperature[7] = 32;
		temperature[8] = 27;
		temperature[9] = 15;
		temperature[10] = 6;
		temperature[11] = 2; // prosinac
		
		//ispisati temperaturu u prosincu
		System.out.println(temperature[11]);

		
		System.out.println(Arrays.toString(temperature));
		
		// prva vrijednost
		System.out.println(temperature[0]);
		//zadnja vrijednost
		System.out.println(temperature[temperature.length-1]);
		
		
		int[] ocjene = {3,2,3,4,5,5,4,5,4,5,4,5,3,3,4};
		
		System.out.println(Arrays.toString(ocjene));
		
		//ispiši zadnju ocjenu
		System.out.println(ocjene[ocjene.length-1]);
		
		// na zadnji element niza ocjene postavite ocjenu 5
		
		ocjene[ocjene.length-1] = 5;
	}
}
