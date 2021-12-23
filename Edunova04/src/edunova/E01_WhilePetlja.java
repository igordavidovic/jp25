package edunova;

public class E01_WhilePetlja {

	public static void main(String[] args) {
		
		int i=2;
		boolean uvjet=i<10;
		
		while(uvjet) { //rjeđe se viđa
			System.out.println(i);
			i++;
			uvjet = i<10;
		}
		
		//češće
		i=2;
		while(i<10) {
			System.out.println(i);
			i++;
		}
		
		// 3. način
		i=2;
		while(i<10) {
			System.out.println(i++);
		}

		
		// continue, break, ugnježđivanje je jednako kao kod for
		
		// beskonačna petlja
		while(true) {
			System.out.println("Osijek");
			break;
		}
	}
}
