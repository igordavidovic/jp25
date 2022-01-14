package vjezba;

import java.security.DomainCombiner;
import java.util.Arrays;

public class Vjezba08 {
	private static int[] tempNiz = new int[2];
	
	private static boolean provjeraPrim(int a) {
		if (a < 2) {
			return false;
		}
		for(int i = 2; i < a;i++) {
			if(a % i == 0) {
				return false;
			}
		}
		return true;
	}
	
	public static void ispisPrima() {
		for(int i = 2; i < 100;i++) {
			if(provjeraPrim(i) == true && provjeraPrim(i + 2) == true) {
				tempNiz[0] = i;
				tempNiz[1] = i + 2;
				System.out.println(Arrays.toString(tempNiz));
			}
		}
		
	}
	public static void main(String[] args) {
		ispisPrima();
	}
}
