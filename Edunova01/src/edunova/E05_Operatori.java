package edunova;

public class E05_Operatori {
	
	public static void main(String[] args) {
		
		//https://docs.oracle.com/javase/tutorial/java/nutsandbolts/operators.html
		
		// operator dodjeljivanja =
		int i = 0; //varijabli i je dodjeljena vrijednost 0
		
		// operator provjere jednakosti ==
		boolean tocno = i==5;
		
		System.out.println(tocno);
		
		// operator različito !=
		tocno = i!=5;
		
		int j,k;
		
		j=3; k=9;
		
		i = j+k;
		System.out.println(i);
		
		i=j-k;
		System.out.println(i);
		
		i=j*k;
		System.out.println(i);
		
		i=j/k;
		
		System.out.println(i);
		
		double d = j/k;
		
		System.out.println(d);
		
		d = (double)j/k; // (double) cast
		
		System.out.println(d);
		
		
		// ostatak nakon cjelobrojnog djeljenja - modulo
		j = 9; k =2;
		i=j%k;
		System.out.println(i);
		
		
		
		
	}

}
