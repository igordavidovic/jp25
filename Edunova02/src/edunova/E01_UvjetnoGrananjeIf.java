package edunova;

public class E01_UvjetnoGrananjeIf {

	public static void main(String[] args) {
		int i = 10;

		boolean uvjet = i < 7;

		// ovo nije uobičajna sintaka
		if (uvjet) {
			System.out.println("OK 1");
		}

		// uobičajna sintaksa
		if (i <= 7) {
			System.out.println("OK 2");
		}

		if (i < 7) {
			System.out.println("OK 3");
		} else {
			System.out.println("OK 4");
		}

		// ako if se primjenjuje samo na 1. red nakon ifa onda n etrebaju {}
		if (i == 7)
			System.out.println("OK 5");
		System.out.println("OK 6"); // ova linija se izvodi bez obzira na if

		// and

		int j = 0, k = 1;

		if (i > 10 & k == 1) {
			System.out.println("OK 7");
		}

		// & uvijek provjerava oba uvjet
		// && u slučaju ne zadovoljavanja prvog uvjeta drugi se ne provjerava

		if (i > 10 && k == 1) {
			System.out.println("OK 8");
		}

		// or

		if (i == 1 | i == 10) {
			System.out.println("OK 9");
		}

		// | uvjek provjerava oba uvjeta
		// || u slučaju zadovoljenja prvog uvjeta ne provjerava se drugi

		if (i == 1 || i == 10) {
			System.out.println("OK 10");
		}

		// not

		if (!(i < 7)) {
			System.out.println("OK 11");
		}

		// puna sintaksa if narebe

		if (i == 1) {
			System.out.println("Nedovoljan");
		} else if (i == 2) {
			System.out.println("Dovoljan");
		} else if (i == 3) {
			System.out.println("Dobar");
		} else {
			System.out.println("Ovo nitko neće imati");
		}

		// if naredbe se mogu ugnježđivati

		if (i < 7) {
			int t = 3;
			System.out.println("OK 12");

			if (t > 3) {
				System.out.println("OK 13");
			}
		}
		// System.out.println(t); - te nije vidljiv izvan svog if bloka u kojem je
		// deklariran

		// inline if, tercirarni operator ?

		int a = 12;

		if (a == 12) {
			System.out.println("DA");
		} else {
			System.out.println("NE");
		}

		System.out.println(a == 12 ? "DA" : "NE");
		
		//višestruki inlineif
		
		System.out.println(i==2 ? (j==3 ? "!" : ":") : "");

	}

}
