package vjezba;

import java.util.Arrays;

public class Vjezba17 {
	public static void main(String[] args) {
		//#56
	/*	int[] niz = { 0, 1, 1, 0, 1, 1, 0, 1, 0, 0 };
		for(int i = 0;i < niz.length;i++) {
			for(int j = 0;j < niz.length;j++) {
				if(niz[i] == 0) {
					int temp = niz[j];
					niz[j] = niz[i];
					niz[i] = temp;
				}
			}
		}
		System.out.println(Arrays.toString(niz));
	*/
		//#58
	/*	int[] A = { 1, 3, 5, 6, 7, 8, 10,12};
		int[] B = { 2, 4, 9 , 11 ,13,15};
		
		for(int i = 0;i < B.length;i++) {
			for(int j = i + 1;j < A.length;j++) {
				if(B[i] > A[j - 1] && B[i] < A[j]) {
					int temp = A[j];
					A[j] = B[i];
					B[i] = temp;
				}
			}
		}
		for(int i = 0;i < B.length;i++) {
			for(int j = 0;j < B.length;j++) {
				if(B[i] < B[j]) {
					int temp = B[j];
					B[j] = B[i];
					B[i] = temp;
				}
			}
		}
		System.out.println(Arrays.toString(A));
		System.out.println(Arrays.toString(B));*/
		
		//#59
		/*int[] niz1 = { 2, 3, 5, 7, 10, -7, 5, 8, -5 ,9 , 1};
		int proizvod = 0;
		for(int i = 0;i < niz1.length;i++) {
			for(int j = i + 1;j < niz1.length;j++) {
				int suma = 0;
				suma = niz1[i] * niz1[j];
				if(suma > proizvod) {
					proizvod = suma;
				}
			}
		}
		System.out.println(proizvod);*/
		
		//#63
	/*	int[] nums1 = { 1, 2, 3, 4, 5, 6, 7};
		int[] nums2 = {0, 1, 2, 3, 4, 5, 6, 7};
		
		int[] rez1 = new int[nums1.length];
		int[] rez2 = new int[nums2.length];
		
		for(int i = 0;i < nums1.length;i++) {
			int suma1 = 1;
			for(int j = 0;j < nums1.length;j++) {
				if(i == j) {
					continue;
				}
				suma1 *= nums1[j];
			}
			rez1[i] = suma1;
		}
		System.out.println(Arrays.toString(rez1));
		
		for(int i = 0;i < nums2.length;i++) {
			int suma1 = 1;
			for(int j = 0;j < nums2.length;j++) {
				if(i == j) {
					continue;
				}
				suma1 *= nums2[j];
			}
			rez2[i] = suma1;
		}
		System.out.println(Arrays.toString(rez2));*/
	
		//#65
		int[] niz2 = { 2, 3, 1, 7, 9, 5, 11, 3, 5 };
		int minimum = 0;
		for(int i = 0;i < niz2.length;i++) {
			int suma = 0;
			for(int j = i+1;j < niz2.length;j++) {
				suma = niz2[i] - niz2[j];
				if(suma < minimum) {
					minimum = suma;
				}
			}
		}
		System.out.println(minimum);
	}
}
