package edunova;

public class E02_VoidBezParametara {
	
	public static void main(String[] args) {
		for(int i=0;i<10;i++) {
			ispisiSlucajniBroj();
			
		}
	}
	// ne vraća vrijednost, ne prima parametre
	static void ispisiSlucajniBroj() {
		int i = (int)(Math.random()*1000);
		System.out.println(i);
	}

}
