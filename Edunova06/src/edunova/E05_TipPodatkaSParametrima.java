package edunova;

public class E05_TipPodatkaSParametrima {

	public static void main(String[] args) {
		//System.out.println(zbroji(E04_TipPodatkaBezParametara.ucitajBroj(), E04_TipPodatkaBezParametara.ucitajBroj()));
		
		
		//System.out.println(sumaPrimBrojeva(3, 100));
		System.out.println(najmanji(E04_TipPodatkaBezParametara.ucitajNiz()));
	}

	private static int zbroji(int i, int j) {
		return i + j;
	}

	private static boolean prim(int n) {

		/*
		 * for(int i=2;i<n;i++) { if(n%i==0) { return false; } }
		 * 
		 * return true;
		 */
		// https://stackoverflow.com/questions/2385909/what-would-be-the-fastest-method-to-test-for-primality-in-java
		if (n < 2)
			return false;
		if (n == 2 || n == 3)
			return true;
		if (n % 2 == 0 || n % 3 == 0)
			return false;
		long sqrtN = (long) Math.sqrt(n) + 1;
		for (long i = 6L; i <= sqrtN; i += 6) {
			if (n % (i - 1) == 0 || n % (i + 1) == 0)
				return false;
		}
		return true;
	}

	private static int sumaPrimBrojeva(int min, int max) {
		int suma = 0;

		for (int i = min; i <= max; i++) {
			if (prim(i)) {
				suma += i;
			}
		}

		return suma;
	}
	
	// metoda koja u primljenom nizu cjelih brojeva pronalazi najmanji
	
	private static int najmanji(int[] niz) {
		int najmanji = Integer.MAX_VALUE;
		
		for(int i: niz) {
			if(i<najmanji) {
				najmanji=i;
			}
		}
		
		
		return najmanji;
	}
	
	
	
	
	
	
	

}
