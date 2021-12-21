package edunova;

public class E04_ForPetlja {

	public static void main(String[] args) {
		
		// ispišite 10 puta Osijek jedno pokraj drugog
		System.out.print("Osijek, ");
		System.out.print("Osijek, ");
		System.out.print("Osijek, ");
		System.out.print("Osijek, ");
		System.out.print("Osijek, ");
		System.out.print("Osijek, ");
		System.out.print("Osijek, ");
		System.out.print("Osijek, ");
		System.out.print("Osijek, ");
		System.out.print("Osijek, ");
		
		// sintaksa for (od kuda; do kuda; uvećanje/umanjenje)
		System.out.println();
		for(int i=0;i<10;i=i+1) {
			System.out.print("Osijek, ");
		}
		
		// varijabla for petlje se tijekom izvođenja mijenja
		System.out.println();
		for(int i=0;i<10;i=i+1) {
			System.out.println(i);
		}
		
		System.out.println();
		//ispiši sve parne brojeve od 1 do 10
		for(int i=1;i<10;i++) {
			if(i%2==0) {
				System.out.println(i);
			}
		}
		
		//ugnježđena for petlja
		for(int i=1;i<=10;i++) {
			for(int j=1;j<=10;j++) {
				System.out.print(i*j + " ");
			}
			System.out.println();
		}
		// DZ lijepo formatirati ispis tablice množenja
		
		
		
		// petlju je moguće preskočiti - dobra praksa
		for(int i=1; i<10;i++) {
			if(i%2!=0) {
				continue; //short cuircuting
			}
			
			System.out.println(i);
		}
		
		//petlju je moguće nasilno prekinuti
		
		for(int i=0;i<10;i++) {
			
			if(i==2) {
				break;
			}
			
			System.out.println(i);
		}
		
		//prekidanje vanjske petlje
		vanjska:
		for(int i=1;i<=10;i++) {
			for(int j=1;j<=10;j++) {
				break vanjska;
			}
			
		}
		
		
		
		//beskonačna petlja
		for(;;) {
			System.out.println(Math.random());
			break;
		}
		
		//zbrojiti brojeve od 1 do 100
		int suma=0;
		for(int i=1;i<=100;i++) {
			suma+=i;
		}
		System.out.println(suma);
		
		int i=0;
		for(;i<10;i++,suma--) {
			
		}
		
		
	}
}
