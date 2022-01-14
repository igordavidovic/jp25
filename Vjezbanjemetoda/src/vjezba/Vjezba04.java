package vjezba;

public class Vjezba04 {
	private static int suma = 0;
	private static int brojac = 4;
	private static int broj = 1;
	
	private static void ispisPentBroja() {
		while(suma < 50) {
			System.out.print(broj + " ");
			suma++;
			broj += brojac;
			brojac += 3;
		}
	}
	
	public static void main(String[] args) {
		ispisPentBroja();
	}
}
