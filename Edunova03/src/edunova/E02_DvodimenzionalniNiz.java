package edunova;

import java.util.Arrays;

//MATRICA
public class E02_DvodimenzionalniNiz {

	public static void main(String[] args) {
		
		int[][] tablica = new int[3][3];
		tablica[0][0] = 1;
		tablica[1][1] = 1;
		tablica[2][2] = 1;
		
		System.out.println(Arrays.toString(tablica[0]));
		System.out.println(Arrays.toString(tablica[1]));
		System.out.println(Arrays.toString(tablica[2]));
		
		
		int[][] dn = {
				{1,2,3},
				{1,2,3},
				{3,2,1}
		};
		
	}
}
