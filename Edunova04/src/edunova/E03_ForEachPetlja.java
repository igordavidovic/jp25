package edunova;

public class E03_ForEachPetlja {

	public static void main(String[] args) {
		
		int[] niz = {1,2,2,3,4,3,3,2};
		
		for(int i=0;i<niz.length;i++) {
			System.out.println(niz[i]);
		}
		
		// jednostavnija sintaksa
		for(int i:niz) {
			System.out.println(i);
		}
		
		// continue, break, ugnježđivanje je jednako kao kod for, while
		
		// ne postoji posebna foreach beskonačna petlja
	}
}
