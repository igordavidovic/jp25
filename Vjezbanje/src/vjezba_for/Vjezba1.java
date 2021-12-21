package vjezba_for;

public class Vjezba1 {
	public static void main(String[] args) {
		for (int i = 1; i <= 20; i++) {
			for (int x = 1; x <= 20; x++) {
				System.out.print(String.format("%4d", i * x));
			}
			System.out.println();
		}
	}
}
