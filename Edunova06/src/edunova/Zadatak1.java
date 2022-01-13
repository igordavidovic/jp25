package edunova;

public class Zadatak1 {
	
	// Napišite metodu koja na primljenom nizu decimalnih brojeva
	// vraća prvi čiji decimalni dio je veći od 5
	// Primjer
	// 2,1
	// 289,49
	// 3,6
	// 23,3
	// 1,89
	// vraća 3,6

	
	private static float prvi(float[] niz) {
		for(float f: niz) {
			if(f-(int)f>0.5) {
				return f;
			}
		}
		return 0;
	}

	
	public static void main(String[] args) {
		float[] niz = {2.1F,289.49F,3.6F,23.3F,1.89F};
		System.out.println(prvi(niz));
	}
	
}
