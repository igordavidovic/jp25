package edunova;

public class E02_DoWhilePetlja {
	
	public static void main(String[] args) {
		int i=10;
		for(;i>10;i++) {
			System.out.println(i);
		}
		
		while(i>10) {
			System.out.println("Osijek");
		}
		
		do {
			System.out.println("Edunova");
		}while(i>10);
		
		// continue, break, ugnježđivanje je jednako kao kod for, while
		
		
		//beskonačna petlja
		do {
			System.out.println("Olovka");
			break;
		}while(true);
	}

}
