package vjezba;

import javax.swing.JOptionPane;

public class Vjezba13 {
	public static void main(String[] args) {
		//#23
	/*	int n = Integer.parseInt(JOptionPane.showInputDialog("Upiši broj rijedaka"));
		int n1 = n;
		for(int i = 1;i <= n;i++) {
			for(int j = 0;j < i;j++) {
				System.out.print(" ");
			}
			for(int k = n1;k > 0;k--) {
				System.out.print("*");
			}
			System.out.println();
			n1--;
		}
		*/
		
		//#24
	/*	int n2 = Integer.parseInt(JOptionPane.showInputDialog("Upiši broj rijedaka"));
		int n3 = n2;
		for(int i = 1;i <= n2;i++) {
			for(int j = n3-1;j > 0;j--) {
				System.out.print(" ");
			}
			for(int k = 1;k <= i;k++) {
				System.out.print("@");
			}
			System.out.println();
			n3--;
		}
		*/
		//#27
		/*int broj = Integer.parseInt(JOptionPane.showInputDialog("Upiši broj"));
		if(broj > 0) {
			System.out.println(broj + " je pozitivan.");
		}else if(broj < 0) {
			System.out.println(broj + " je negativan.");
		}else {
			System.out.println("Broj je nula.");
		}
		*/
		
		//#29
	/*	long broj1;
		int suma = 0;
		while(true) {
		broj1 = Long.parseLong(JOptionPane.showInputDialog("Upiši broj manji od 1000000000"));
		if(broj1 > 10000000000l) {
			JOptionPane.showMessageDialog(null, "Broj nije točan");
			continue;
			}
		while(broj1 > 0) {
			broj1 /= 10;
			suma++;
			}
		System.out.println(suma);
		break;
		}*/
		
		//#30
	/*	int broj2 = Integer.parseInt(JOptionPane.showInputDialog("Upiši broj"));
		int broj3 = Integer.parseInt(JOptionPane.showInputDialog("Upiši broj"));
		int broj4 = Integer.parseInt(JOptionPane.showInputDialog("Upiši broj"));
		if(broj2 == broj3 && broj2 == broj4 && broj3 == broj4) {
			System.out.println("Svi brojevi su jednaki");
		}else if(broj2 != broj3 && broj2 != broj4 && broj3 != broj4) {
			System.out.println("Svi brojevi su različiti");
		}else {
			System.out.println("Svi nisu niti jedanki niti ralizičiti");
		}
	*/
		//#31
		/*int broj5 = Integer.parseInt(JOptionPane.showInputDialog("Upiši broj"));
		int broj6 = Integer.parseInt(JOptionPane.showInputDialog("Upiši broj"));
		int broj7 = Integer.parseInt(JOptionPane.showInputDialog("Upiši broj"));
		if(broj5 > broj6 && broj6 > broj7) {
			System.out.println("Brojevi su u silazu");
		}else if(broj5 < broj6 && broj6 < broj7) {
			System.out.println("Brojevi su u usponu");
		}else {
			System.out.println("Brojevi nisu niti u upsonu ni u silazu");
		}
	}*/
}
