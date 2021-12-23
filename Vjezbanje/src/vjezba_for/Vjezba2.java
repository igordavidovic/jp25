package vjezba_for;

public class Vjezba2 {
	public static void main(String[] args) {

		for (int i = 0; i < 6; i++) {
			if (i == 0) {
				System.out.println("1*****");
			} else if (i == 1) {
				System.out.println("12****");
			} else if (i == 2) {
				System.out.println("123***");
			} else if (i == 3) {
				System.out.println("1234**");
			} else if (i == 4) {
				System.out.println("12345*");
			} else {
				System.out.println("123456");
			}
		}

		System.out.println();

		for (int x = 0; x < 6; x++) {
			if (x == 0) {
				System.out.println("12345&");
			} else if (x == 1) {
				System.out.println("1234&&");
			} else if (x == 2) {
				System.out.println("123&&&");
			} else if (x == 3) {
				System.out.println("12&&&&");
			} else if (x == 4) {
				System.out.println("1&&&&&");
			} else {
				System.out.println("&&&&&&");
			}
		}

		System.out.println();

		for (int y = 0; y <= 6; y++) {
			if (y == 0) {
				System.out.println("@");
			} else if (y == 1) {
				System.out.println("@ @");
			} else if (y == 2) {
				System.out.println("@  @");
			} else if (y == 3) {
				System.out.println("@   @");
			} else if (y == 4) {
				System.out.println("@    @");
			} else if(y == 5){
				System.out.println("@     @");
			}else {
				System.out.println("@ @ @ @ @ ");
			}
		}

		System.out.println();
		
		for (int i = 1; i <= 6; i++) {
			for (int x = 1; x <= i; x++) {
				System.out.print(x);
			}
			for (int k = 6; k > i; k--) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println();
		
		for (int i = 6; i >= 1; i--) {
			for (int j = 1; j < i; j++) {
				System.out.print(j);
			}
			for (int x = 6; x >= i; x--) {
				System.out.print("&");
			}
			System.out.println();
		}
		System.out.println();
		System.out.println("@");
		for (int i = 5; i >= 1; i--) {
			System.out.print("@");
			for (int j = 5; j >= i; j--) {
				System.out.print(" ");
			}
			System.out.println("@");
		}
		for (int k = 5; k > 0; k--) {
			System.out.print("@ ");
		}
	}

}
