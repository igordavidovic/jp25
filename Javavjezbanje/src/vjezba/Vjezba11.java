package vjezba;

import java.util.Arrays;

import javax.swing.JOptionPane;

public class Vjezba11 {
	public static void main(String[] args) {
		//#1
		double fahrenheit = Double.parseDouble(JOptionPane.showInputDialog("Upiši temeperaturu u Fahrenheitu"));
		double celsius = fahrenheit;
		celsius -= 32;
		celsius *= 5;
		celsius /= 9;
		System.out.println(celsius);
		
		//#2
		double inch = Double.parseDouble(JOptionPane.showInputDialog("Upiši inče"));
		double metar = inch * 0.0254;
		System.out.println(inch + " inča je " + metar + " metara.");
		
		//#3
		int broj;
		int suma = 0;
		while(true) {
			broj = Integer.parseInt(JOptionPane.showInputDialog("Upiši broj između 0 i 1000"));
			if(broj < 0 || broj > 1000) {
				JOptionPane.showMessageDialog(null, "Broj koji si unio nije između 0 i 1000");
				continue;
			}
			int temp = broj;
			while(broj > 0) {
				suma += broj % 10;
				broj /= 10;
			}
			System.out.println("Suma znamenki broja " + temp + " je " + suma);
			break;
		}
		
		//#4
		int minute = Integer.parseInt(JOptionPane.showInputDialog("Upiši minute"));
		int dani = 0;
		int godine = 0;
		dani = minute / (60 * 24);
		godine = dani / 365;
		dani = dani % 365;
		System.out.println(minute + " minuta je jedanko " + godine + " godina i " + dani + " dana.");
		
		//#6
		double tezina = Double.parseDouble(JOptionPane.showInputDialog("Upiši težinu u kilogramima"));
		double visina = Double.parseDouble(JOptionPane.showInputDialog("Upiši visinu u centimetrima"));
		visina /= 100;
		double bmi = tezina / (visina * visina);
		System.out.println(bmi);
		
		//#7
		double duljina = Double.parseDouble(JOptionPane.showInputDialog("Upiši duljinu u metrima"));
		double sat = Double.parseDouble(JOptionPane.showInputDialog("Upiši sate"));
		double minut = Double.parseDouble(JOptionPane.showInputDialog("Upiši minute"));
		double sekund = Double.parseDouble(JOptionPane.showInputDialog("Upiši sekunde"));
		double ms = 0;
		double kmh = 0;
		double mh = 0;
		double sec = (sat * 3600) + (minut * 60) + sekund;
		kmh = (duljina * 3600) / (sec * 1000);
		ms = (duljina) / sec;
		mh = (duljina / sec) * (3600 / 1000) * (1 / 1.609);
		System.out.println("Brzina u km/h :" + kmh);
		System.out.println("Brzina u m/s :" + ms);
		System.out.println("Brzina u m/h :" + mh);
		
		//#8
		int broj1 = Integer.parseInt(JOptionPane.showInputDialog("Upiši broj"));
		int na2 = broj1 * broj1;
		int na3 = broj1 * broj1 * broj1;
		int na4 = broj1 * broj1 * broj1 * broj1;
		
		System.out.println(broj1 + " na 2. je " + na2);
		System.out.println(broj1 + " na 3. je " + na3);
		System.out.println(broj1 + " na 4. je " + na4);
		
		//#9
		int int1 = Integer.parseInt(JOptionPane.showInputDialog("Upiši prvi broj"));
		int int2 = Integer.parseInt(JOptionPane.showInputDialog("Upiši drugi broj"));
		double avg = (int1 + int2) / 2; 
		int distance = 0;
		int max = 0;
		int min = 0;
		if(int1 > int2) {
			distance += int1 - int2;
			max = int1;
			min = int2;
		}else {
			distance += int2 - int1;
			max = int2;
			min = int1;
		}
		System.out.println("Suma dva broja je : " + (int1 + int2) + "\n" + "Razlika dva broja je : " + (int1 - int2) + "\n" + "Produkt dva broja je : " + (int1 * int2) + "\n" + "Srednja vrijednost dva broja je : " + avg + "\n" + "Udaljina između dva broja je : " + distance + "\n" + "Veći broj je : " + max + "\n" + "Manji broj je :" + min);
	
		//#10
		int broj2;
		while(true) {
		broj2 = Integer.parseInt(JOptionPane.showInputDialog("Unesi šestero znamenkasti broj"));
		if(broj2 > 999999 || broj2 < 99999) {
			JOptionPane.showMessageDialog(null, "Broj nema šest znamenki");
			continue;
		}
		int[] niz = new int [6];
		for(int i = niz.length-1;i >= 0;i--) {
			niz[i] = broj2 % 10;
			broj2 /= 10;
		}
		for(int i = 0;i < niz.length;i++) {
			System.out.print(niz[i] + " ");
			}
		break;
		}
		
	}
}
