package vjezba;

public class P14 {
	public static void main(String[] args) {
		int max = Integer.MIN_VALUE;
		int temp = 0;
		int n = 0;
		for(int i = 2;i <= 100000;i++) {
			int brojac = 1;
			n = i;
			//System.out.print(i + " -> ");
		while(n != 1) {
			if(n % 2 == 0) {
				n /= 2;
			}else if(n % 2 != 0){
				n *= 3;
				n += 1;
			}
			brojac++;
			
			/*if(n == 1) {
				System.out.print(n);
				break;
			}*/
			//System.out.print(n + " -> ");
			}
		if(brojac > max) {
			max = brojac;
			temp = i;
			}
			//System.out.println();
		}
		System.out.println("Broj sa najviše elemenata je : " + temp);
		System.out.println("Najveći broj elemenata je : " + max);
	}
}
