package subota;

import java.util.Scanner;

public class Zadaci {
	public Zadaci() {
		char a = 't';
		// Ispisati sve brojeve od 1 do 100 i brojevi ciji brojevi znamenaka su 7
		int broj = 1;
		int desetica;
		int jedinica;
		/*while (broj < 100) {
			desetica = broj / 10;
			jedinica = broj % 10;
			if (desetica + jedinica == 7) {
				System.out.println(broj);
			}
			broj++;
		}*/
		//zadatak1();
		//System.out.println(zadatak2(7,"Osijek"));
		zadatak3();
		zadatak4();
	}

	private void zadatak1() {
		// Učitati tekst koji je minimalne dužine 5 znakova
		String b;
		Scanner scanner = new Scanner(System.in);
		while (true) {
			System.out.println("Upišite tekst");
			b = scanner.nextLine();
			if (b.length() < 5) {
				System.out.println("Tekst mora biti minimalno 5 znakova");
				continue;
			}
			scanner.close();
			break;
		}
	}
	private char zadatak2(int a,String s) {
		//Metoda vrača znak koji se nalazi na primljenom indexu
		char b = 'a';
		b = s.charAt(a-1);

		return b;
	}
	
	private void zadatak3() {
	//Ispiši sve neparne brojeve od 56 do 12 dowhile petlja
		int a = 56;
		do {
			if(a % 2 != 0) {
				System.out.println(a);
			}
			a--;
		}while(a >= 12);
	}
	private void zadatak4() {
		int i = 1, j = 2, k = 0;
		k = ++i + j--;//k = 4
		i = k - ++j;//i = 2
		System.out.println(i+j+k);
	}
	public static void main(String[] args) {
		new Zadaci();
		
	}

}
