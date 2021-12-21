package edunova;

public class E05_IncrementDecrement {
	
	public static void main(String[] args) {
		
		
		int i=1;
		System.out.println(i);
		//uvećati za 1
		i=i+1;
		System.out.println(i);
		i+=1; //uvećao za 1 
		System.out.println(i);
		i+=2; //uvećao za 2
		System.out.println(i);
		
		i++; //uvećao za 1
		System.out.println(i);
		
		System.out.println(++i); //prvo uveća pa koristi
		System.out.println(i++); //prvo koristi pa uveća
		System.out.println(i);
		
		
		System.out.println(--i); //prvo umanji pa koristi
		System.out.println(i--); //prvo koristi pa umanji
		System.out.println(i);
		
		
		int t=1, k=0;
		
		k = k - t++; // k = -1, t = 2
		
		t -= --k + ++t;// -2 + 3 = 1
		
		System.out.println(k-1);
 		
		
		
		
		
	}

}
