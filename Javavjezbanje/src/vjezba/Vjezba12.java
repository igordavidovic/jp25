package vjezba;

import javax.swing.JOptionPane;

public class Vjezba12 {
	public static void main(String[] args) {
		//#1
		int broj = Integer.parseInt(JOptionPane.showInputDialog("Upiši broj"));
		if(broj < 0) {
			System.out.println(broj + " je negativan.");
		}else if(broj > 0) {
			System.out.println(broj + " je pozitivan.");
		}else {
			System.out.println(broj + " je nula.");
		}
		
		//#3
		int broj1 = Integer.parseInt(JOptionPane.showInputDialog("Upiši broj"));
		int broj2 = Integer.parseInt(JOptionPane.showInputDialog("Upiši broj"));
		int broj3 = Integer.parseInt(JOptionPane.showInputDialog("Upiši broj"));
		if(broj1 >= broj2 && broj1 >= broj3) {
			System.out.println(broj1);
		}else if(broj2 >= broj1 && broj2 >= broj3) {
			System.out.println(broj2);
		}else {
			System.out.println(broj3);
		}
		
		//#4
		float broj4 = Float.parseFloat(JOptionPane.showInputDialog("Upiši broj"));
		if(broj4 == 0) {
			System.out.println("Nula");
		}else if(broj4 < 0) {
			System.out.println("Negativan broj");		
		}else if(broj4 > 0) {
			System.out.println("Pozitivan broj");
		}
		if(broj4 > 0 && broj4 < 1) {
			System.out.println("Small");
		}else if(broj4 >= 1000000) {
			System.out.println("Large");
		}
		
		//#5
		int dan = Integer.parseInt(JOptionPane.showInputDialog("Upiši broj od 1 do 7"));
		
		switch (dan) {
		case 1:
			System.out.println("Ponedjeljak");
			break;
		case 2:
			System.out.println("Utorak");
			break;
		case 3:
			System.out.println("Srijeda");
			break;
		case 4:
			System.out.println("Četvrtak");
			break;
		case 5:
			System.out.println("Petak");
			break;
		case 6:
			System.out.println("Subota");
			break;
		case 7:
			System.out.println("Nedjelja");
			break;
		default:
			System.out.println("Broj koji ste unijeli nije između 1 i 7");
			break;
		}
		
		//#7
		int mjesec = Integer.parseInt(JOptionPane.showInputDialog("Upiši broj mjeseca"));
		int godina = Integer.parseInt(JOptionPane.showInputDialog("Upiši godinu"));
		
		switch (mjesec) {
		case 1:
			System.out.println("Siječanj " + godina + " ima 31 dan.");
			break;
		case 2:
			if(godina % 400 == 0 || (godina % 4 == 0 && godina % 100 != 0)) {
				System.out.println("Veljača " + godina + " ima 29 dana.");
			}else {
				System.out.println("Veljača " + godina + " ima 28 dana.");
			}
			break;
		case 3:
			System.out.println("Ožujak " + godina + " ima 31 dan.");
			break;
		case 4:
			System.out.println("Travanj " + godina + " ima 30 dana.");
			break;
		case 5:
			System.out.println("Svibanj " + godina + " ima 31 dan.");
			break;
		case 6:
			System.out.println("Lipanj " + godina + " ima 30 dana.");
			break;
		case 7:
			System.out.println("Srpanj " + godina + " ima 30 dana.");
			break;
		case 8:
			System.out.println("Kolovoz " + godina + " ima 31 dan.");
			break;
		case 9:
			System.out.println("Rujan " + godina + " ima 30 dana.");
			break;
		case 10:
			System.out.println("Listopad " + godina + " ima 31 dan.");
			break;
		case 11:
			System.out.println("Studeni " + godina + " ima 30 dana.");
			break;
		case 12:
			System.out.println("Prosinac " + godina + " ima 31 dan.");
			break;
		default:
			System.err.println("Broj koji ste unijeli ne pripada mjesecu");
			break;
		}
		
		//#9
		int godina1 = Integer.parseInt(JOptionPane.showInputDialog("Upiši godinu"));
		
		if(godina1 % 400 == 0 || (godina1 % 4 == 0 && godina1 % 100 != 0)) {
			System.out.println("Godina je prijestupna");
		}else {
			System.out.println("Godina nije prijestupna");
		}
			
		
		//#10
		for(int i = 1;i <= 10;i++) {
			System.out.println(i);
		}
		
		//#11
		int n = Integer.parseInt(JOptionPane.showInputDialog("Upiši pozitivan broj"));
		int suma = 0;
		for(int i = 1;i <= n;i++) {
			suma += i;
			System.out.println(i);
		}
		System.out.println(suma);
		
		//#12
		int[] niz = new int [5];
		int suma1 = 0;
		for(int i = 0;i < niz.length;i++) {
			niz[i] = Integer.parseInt(JOptionPane.showInputDialog("Upiši broj"));
			suma1 += niz[i];
		}
		double avg = suma1 / 5;
		for(int i = 0;i < niz.length;i++) {
			System.out.println(niz[i]);
		}
		System.out.println(suma1);
		System.out.println(avg);
		
		//#13
		int n1 = Integer.parseInt(JOptionPane.showInputDialog("Upiši broj"));
		for(int i = 1;i <= n1;i++) {
			System.out.println("Broj je : " + i + " a kuba od  " + i + " je : " + (i * i * i) );
		}
		
		//#14
		int n2 = Integer.parseInt(JOptionPane.showInputDialog("Upiši broj"));
		for(int i = 0;i <= n2;i++) {
			System.out.println(n2 + " * " + i + " = " + (n2 * i));
		}
		
		//#15
		int n3 = Integer.parseInt(JOptionPane.showInputDialog("Upiši broj"));
		int brojac = 0;
		int i1 = 1;
		int suma2 = 0;
		while(brojac < n3) {
			if(i1 % 2 != 0) {
				suma2 += i1;
				brojac++;
				System.out.println(i1);
			}
			i1++;
		}
		System.out.println(suma2);
	
		//#16
		int n4 = Integer.parseInt(JOptionPane.showInputDialog("Upiši broj"));
		for(int i = 1;i <= n4;i++) {
			for(int j = 1;j <= i;j++) {
				System.out.print(j + " ");
			}
			System.out.println();
		}
		
		//#17
		int n5 = Integer.parseInt(JOptionPane.showInputDialog("Upiši broj"));
		for(int i = 1;i <= n5;i++) {
			for(int j = 1;j <= i;j++) {
				System.out.print(i + " ");
			}
			System.out.println();
		}
		
		//#18
		int n6 = Integer.parseInt(JOptionPane.showInputDialog("Upiši broj"));
		int brojac1 = 1;
		for(int i = 1;i <= n6;i++) {
			for(int j = 1;j <= i;j++) {
				System.out.print(brojac1++ + " ");
			}
			System.out.println();
		}
		//#19
		int n7 = Integer.parseInt(JOptionPane.showInputDialog("Upiši broj"));
		int s = n7 + 4 -1;
		for(int i = 1;i <= n7;i++) {
			for(int t = s;t != 0;t--) {
			System.out.print(" ");
			}
			for(int j = 1;j <= i;j++) {
				System.out.print(i + " ");
			}
			System.out.println();
			s--;
		}
		
		//#20
		int n8 = Integer.parseInt(JOptionPane.showInputDialog("Upiši broj"));
		int brojac2 = 1;
		for(int i = 1;i <= n8;i++) {
			for(int j = 1;j <= i;j++) {
				System.out.print(brojac2++ + " ");
			}
			System.out.println();
		}
	}
}
