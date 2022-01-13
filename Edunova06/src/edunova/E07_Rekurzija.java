package edunova;

public class E07_Rekurzija {

	public static void main(String[] args) {
		System.out.println(zbroj(5));
	}

	private static int zbroj(int i) {
		return i == 1 ? i : i + zbroj(i - 1);
		/*
		 * if(i==1) { 
		 * return i; 
		 * } 
		 * return i+zbroj(i-1);
		 */
	}

}
