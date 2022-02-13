package vjezba;

public class Vjezba18 {
	public static void main(String[] args) {
		primjer1();
		primjer2();
		primjer3();
		primjer4();
	}

	private static void primjer1() {
		int broj = 1;
		int temp;
		int suma;
		while (broj < 1001) {
			suma = 0;
			temp = broj;
			while (temp > 0) {
				suma += temp % 10;
				temp = temp / 10;
			}
			if (suma == 7) {
				System.out.println(broj);
			}
			broj++;
		}
	}

	private static void primjer2() {
		for (int i = 1; i < 6; i++) {
			for (int j = 0; j < i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	private static void primjer3() {
		for(int i = 3;i > 0;i--) {
			for(int j = 0;j < i;j++) {
				System.out.print(" ");
			}
			if(i == 3) {
				System.out.print("*");
			}else if(i == 2) {
				System.out.print("***");
			}else {
				System.out.print("*****");
			}
			System.out.println();
		}
	}
	private static void primjer4() {
		double random = Math.random() * 10;
		int[] niz = new int[10];
		for(int i = 0;i < 10;i++) {
			niz[i] = 10+i;
		}
		System.out.println(niz[(int)random]);
	}
}
