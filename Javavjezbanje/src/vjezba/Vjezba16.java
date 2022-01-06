package vjezba;

import java.util.Arrays;

import javax.swing.JOptionPane;

public class Vjezba16 {
	public static void main(String[] args) {
		//#28
		int[] niz = {5, 7, 2, 4, 9,3,5,2,8};
		for(int i = 0;i < niz.length;i++) {
			for(int j = 0;j < niz.length;j++) {
				if(niz[i] < niz[j]) {
					int temp = niz[j];
					niz[j] = niz[i];
					niz[i] = temp;
				}
			}
		}
		System.out.println("Razlika između najvećeg i najmanjeg broja je : " + (niz[0] - niz[niz.length-1]));
		//#29
		int[] niz1 = {5, 7, 2, 4, 9, 2, 9, 3};
		for(int i = 0;i < niz1.length;i++) {
			for(int j = 0;j < niz1.length;j++) {
				if(niz1[i] < niz1[j]) {
					int temp = niz1[j];
					niz1[j] = niz1[i];
					niz1[i] = temp;
				}
			}
		}
		int br1 = 0;
		int br2 = niz1.length-1;
		while(niz1[br1] == niz1[br1 + 1]) {
			br1++;
		}
		while(niz1[br2] == niz1[br2 - 1]) {
			br2--;
		}
		int suma = 0;
		for(int i = br1 + 1;i < br2;i++) {
			suma += niz1[i];
		}
	System.out.println("Suma svih brojeva osim navjećeg i najmanjeg :" + suma);
		
		//#30
		int[] niz2 = {50, 77, 12, 54, -11};
		boolean prv = true;
		for(int i = 0;i < niz2.length;i++) {
			if(niz2[i] == 0 || niz2[i] == -1) {
				prv = false;
				break;
			}
		}
		System.out.println(prv);
		
		//#31
		int[] niz3 = {10, 77, 10, 54, -11, 10};
		int suma1 = 0;
		for(int i = 0;i< niz3.length;i++) {
			if(niz3[i] == 10) {
				suma1 += niz3[i];
			}
		}
		if(suma1 == 30) {
			System.out.println("True");
		}else {
			System.out.println("False");
		}
		
		//#32
		int[] niz4 = {77, 77, 65, 65, 65, 77};
		int rez = 0;
		for(int i = 0;i < niz4.length;i++) {
			if(niz4[i] == 77) {
				rez++;
				break;
			}
		}
		for(int i = 0;i < niz4.length;i++) {
			if(niz4[i] == 65) {
				rez++;
				break;
			}
		}
		if(rez == 2) {
			System.out.println("True");
		}else {
			System.out.println("False");
		}
		
		
		//#33
		int[] niz5 = {20, 20, 30, 40, 50, 50, 50};
		int gran = niz5.length;
		for(int i = 1;i < niz5.length;i++) {
			if(niz5[i - 1] == niz5[i]) {
				gran--;
			}
		}
		System.out.println("Duljina novog niza bez duplikata je : " + gran);
		
		//#35
		int[] niz6 = {1,2,4,5,6};
		int tv = 6;
		for(int i = 0; i < niz6.length;i++) {
			for(int j = i + 1;j < niz6.length;j++) {
				if(niz6[i] + niz6[j] == tv) {
					System.out.println("Index(1): " + i);
					System.out.println("Index(2): " + j);
				}
			}
		}
		
		//#38
		int[] niz7 = {1, 6, 6, 5, 7, 4, 1, 7, 7, 7, 7, 7, 7, 7, 2};
		int suma2 = 0;
		int tempo = 0;
		int n = niz7.length / 2;
		for(int i = 0;i < niz7.length;i++) {
			int brojac = 0;
			for(int j = 0;j < niz7.length;j++) {
				if(niz7[i] == niz7[j]) {
					brojac++;
				}
				if(brojac > suma2) {
					suma2 = brojac;
					tempo = niz7[i];
				}
			}
		}
		if(suma2 >= n) {
		System.out.println(tempo);
		}else {
			System.out.println("Nema takvog elementa");
		}
		
		//#39
		int[] niz8 = {10,9,14,23,15,0,9};
		int granica = niz8.length-1;
		for(int i = 0;i < niz8.length;i++) {
			int brojac1 = 0;
			for(int j = 1+i;j < niz8.length;j++) {
				if(niz8[i] > niz8[j]) {
					brojac1++;
				}
			}
			if(brojac1 == granica - i) {
				System.out.println(niz8[i]);
			}
		}
		
		//#41
		int[] niz9 = {5, 7, -8, 5, 14, 1};
		for(int i = 0;i < niz9.length;i++) {
			for(int j = 0;j < niz9.length;j++) {
				if(niz9[i] < niz9[j]) {
					int temp = niz9[j];
					niz9[j] = niz9[i];
					niz9[i] = temp;
				}
			}
		}
		int br3 = 1;
		while(niz9[1] == niz9[0]) {
			br3++;
		}
	System.out.println("Najmanji broj : " + niz9[0]);
	System.out.println("Drugi najmanji broj : " + niz9[br3]);
	
	//#42
	int[] niz10 = {0, 1, 0, 1, 1, 0, 1, 1, 0, 0, 1};
	for(int i = 0;i < niz10.length;i++) {
		for(int j = 0;j < niz10.length;j++) {
			if(niz10[i] == 0) {
				int temp = niz10[j];
				niz10[j] = niz10[i];
				niz10[i] = temp;
				}
			}
		}
		System.out.println(Arrays.toString(niz10));		
		
		//#43
		int[] niz11 = {10, 20, 30, 40, 1, 2};
		int gv = Integer.parseInt(JOptionPane.showInputDialog("Upiši broj koji će se tražiti"));
		for(int i = 0;i < niz11.length;i++) {
			for(int j = i+1 ; j < niz11.length;j++) {
				for(int k = j+1;k < niz11.length;k++) {
					for(int t = k+1;t < niz11.length;t++) {
						if(niz11[i] + niz11[j] + niz11[k] + niz11[t] == gv) {
							System.out.println(niz11[i] + " + " + niz11[j] + " + " + niz11[k] + " + " + niz11[t] + " = " + gv);
						}
					}
				}
			}
		}
		
		//#45
		int[] niz12 = {10, 20, 30, 40, 50, 60};
		int temp1 = niz12[0];
		niz12[0] = niz12[niz12.length-1];
		niz12[niz12.length-1] = temp1;
		System.out.println(Arrays.toString(niz12));
		
		//#47
		int[] niz13 = {35, 32, 30, 14, 18, 21, 27};
		int rotacija = 0;
		for(int i = 0; i < niz13.length;i++) {
			if(!(niz13[i] > niz13[niz13.length-1])) {
				System.out.println("Broj rotacija sortiranog niza : " + rotacija);
				break;
			}
			rotacija++;
		}
		
		//#48
		int[] niz14 = {-4, 8, 6, -5, 6, -2, 1, 2, 3, -11};
		for(int i = 0;i < niz14.length;i++) {
			for(int j = 0;j < niz14.length;j++) {
				if(niz14[i] < 0) {
					int temp = niz14[j];
					niz14[j] = niz14[i];
					niz14[i] = temp;
					}
				}
			}
		System.out.println(Arrays.toString(niz14));
		
		//#49
		int[]niz15 = {-4, 8, 6, -5, 6, -2, 1, 2, 3, -11};
		for(int i = 0;i < niz15.length;i++) {
			for(int j = 0;j < niz15.length;j++) {
				if(niz15[j] < 0) {
					int temp = niz15[i];
					niz15[i] = niz15[j];
					niz15[j] = temp;
					}
				}
			}
		System.out.println(Arrays.toString(niz15));
		
		//#50
		int[] niz16 = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};
		int[] niz17 = new int[10];
		int i1 = 0;
		int i2 = 0;
		for(int i = 0;i < niz16.length;i++) {
			if(i % 2 == 0) {
				niz17[i] = niz16[niz16.length-(1+i1)];
				i1++;
			}else {
				niz17[i] = niz16[i2];
				i2++;
			}
		}
		System.out.println(Arrays.toString(niz17)); 
		
		//#51
		int[] niz18 = {20, 12, 23, 17, 7, 8, 10, 2, 1, 0};
		for(int i = 0;i < niz18.length;i++) {
			for(int j = 0;j < niz18.length;j++) {
				if(niz18[i] % 2 == 0) {
					int temp = niz18[i];
					niz18[i] = niz18[j];
					niz18[j] = temp;
					}
				}
			}
			System.out.println(Arrays.toString(niz18));		
		
		//#54
		int[] niz19 = { 1, 2, -2, 3, 4, 5, 6 };
		int[] niz20 =	{ 1, 2, 3, 4, 5, 6 };
		int[] niz21 = { 1, 2, -3, 4, 5, 6 };
		int suma19 = 0;
		int suma20 = 0;
		int suma21 = 0;
		boolean prv19 = false;
		boolean prv20 = false;
		boolean prv21 = false;
		vanjska:
		for(int i = 0;i < niz19.length;i++) {
			suma19 = 0;
			suma19 += niz19[i];
			for(int j = i+1;j < niz19.length;j++) {
				suma19 += niz19[j];
				if(suma19 == 0) {
					prv19 = true;
					break vanjska;
				}
			}
		}
		System.out.println(prv19);
		vanjska1:
			for(int i = 0;i < niz20.length;i++) {
				suma20 = 0;
				suma20 += niz20[i];
				for(int j = i+1;j < niz20.length;j++) {
					suma20 += niz20[j];
					if(suma20 == 0) {
						prv20 = true;
						break vanjska1;
					}
				}
			}
		System.out.println(prv20);
		vanjska2:
			for(int i = 0;i < niz21.length;i++) {
				suma21 = 0;
				suma21 += niz21[i];
				for(int j = i+1;j < niz21.length;j++) {
					suma21 += niz21[j];
					if(suma21 == 0) {
						prv21 = true;
						break vanjska2;
					}
				}
			}
		System.out.println(prv21);
	}
}