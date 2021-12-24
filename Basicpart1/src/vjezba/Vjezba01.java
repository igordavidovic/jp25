package vjezba;

import javax.swing.JOptionPane;

public class Vjezba01 {
	public static void main(String[] args) {
		// #1
		System.out.println("Hello");

		System.out.println("Igor Davidović");

		// #2
		System.out.println(74 + 36);

		// #3
		System.out.println(50 / 3);

		// #4
		System.out.println(-5 + 8 * 6);
		System.out.println((55 + 9) % 9);
		System.out.println(20 + -3 * 5 / 8);
		System.out.println(5 + 15 / 3 * 2 - 8 % 3);

		// #5
		int x = Integer.parseInt(JOptionPane.showInputDialog("Unesi broj"));
		int y = Integer.parseInt(JOptionPane.showInputDialog("Unesi drugi broj"));

		System.out.println(x * y);

		// #6
		int j = Integer.parseInt(JOptionPane.showInputDialog("Unesi broj"));
		int k = Integer.parseInt(JOptionPane.showInputDialog("Unesi drugi broj"));

		System.out.println(j + k);
		System.out.println(j - k);
		System.out.println(j * k);
		System.out.println(j / k);
		System.out.println(j % k);

		// #7

		int t = Integer.parseInt(JOptionPane.showInputDialog("Unesi broj"));

		for (int i = 1; i <= 10; i++) {
			System.out.println(t + " * " + i + " = " + (t * i));
		}

		// #11

		double radius = 7.5;
		double area = 2 * 3.14 * radius;
		double perimeter = 3.14 * radius * radius;

		System.out.println("Area " + "je " + area);
		System.out.println("Perimeter " + "je " + perimeter);

		// #12

		int broj1 = Integer.parseInt(JOptionPane.showInputDialog("Upiši cijeli broj"));
		int broj2 = Integer.parseInt(JOptionPane.showInputDialog("Upiši cijeli broj"));
		int broj3 = Integer.parseInt(JOptionPane.showInputDialog("Upiši cijeli broj"));

		int zbroj = broj1 + broj2 + broj3;

		System.out.println(zbroj / 3);

		// #15

		int a = 10;
		int b = 15;
		int swap;

		System.out.println("a " + "je " + a + " b " + "je " + b);
		swap = a;
		a = b;
		b = swap;
		System.out.println("a " + "je " + a + " b " + "je " + b);

		// #32

		int broj4 = Integer.parseInt(JOptionPane.showInputDialog("Upiši broj"));
		int broj5 = Integer.parseInt(JOptionPane.showInputDialog("Upiši broj"));

		if (broj4 == broj5) {
			System.out.println(broj4 + " == " + broj5);
		}
		if (broj4 != broj5) {
			System.out.println(broj4 + " != " + broj5);
		}
		if (broj4 < broj5) {
			System.out.println(broj4 + " < " + broj5);
		}
		if (broj4 > broj5) {
			System.out.println(broj4 + " > " + broj5);
		}

		// #33
		int suma = 0;
		int broj6 = Integer.parseInt(JOptionPane.showInputDialog("Upiši broj"));

		while (broj6 != 0) {
			suma += broj6 % 10;
			broj6 /= 10;
		}
		System.out.println(suma);

		// #39
		int kolicina = 0;
		for (int i = 1; i <= 4; i++) {
			for (int z = 1; z <= 4; z++) {
				for (int u = 1; u <= 4; y++) {
					if (i != z && i != u && z != u) {
						System.out.println(i + "" + z + "" + u);
						kolicina++;
					}
				}
			}

		}
		System.out.println(kolicina);

		// #44
		int br = Integer.parseInt(JOptionPane.showInputDialog("Upiši broj"));

		System.out.println(br + " + " + br + "" + br + " + " + br + "" + br + "" + br);

		// #48
		for (int i = 1; i < 100; i++) {
			if (i % 2 == 0) {
				continue;
			}
			System.out.println(i);
		}

		// #49

		int parnepar = Integer.parseInt(JOptionPane.showInputDialog("Upiši broj"));

		if (parnepar % 2 == 0) {
			System.out.println("1");
		} else {
			System.out.println("0");
		}

		// #50
		System.out.println("Djeljivi sa 3 :");
		for (int i = 1; i < 100; i++) {
			if (i % 3 == 0) {
				System.out.print(i + " ");
			}
		}
		System.out.println();
		System.out.println("Djeljivi sa 5 :");
		for (int i = 1; i < 100; i++) {
			if (i % 5 == 0) {
				System.out.print(i + " ");
			}
		}
		System.out.println();
		System.out.println("Djeljivi sa 3 i 5:");
		for (int i = 1; i < 100; i++) {
			if (i % 3 == 0 && i % 5 == 0) {
				System.out.print(i + " ");
			}
		}
		
	}

}
