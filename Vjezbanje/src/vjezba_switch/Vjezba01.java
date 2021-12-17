package vjezba_switch;

import javax.swing.JOptionPane;

public class Vjezba01 {
	public static void main(String[] args) {
		int unos = Integer.parseInt(JOptionPane.showInputDialog("Izaberi akciju \n 1 Zbrajanje \n 2 Oduzimanje \n 3 Množenje \n 4 Djeljenje"));
		
		switch (unos) {
		case 1:
			int a1 = 10;
			
			int b1 = 20;
			
			int c1 = a1 + b1;
			
			System.out.println(c1);
			break;
		case 2:
			int a2 = 10;
			
			int b2 = 20;
			
			int c2 = a2 - b2;
			
			System.out.println(c2);
			break;
		case 3:
			int a3 = 10;
			
			int b3 = 20;
			
			int c3 = a3 * b3;
			
			System.out.println(c3);
			break;
		case 4:
			double a4 = 10;
			
			double b4 = 20;
			
			double c4 = a4 / b4;
			
			System.out.println(c4);
			break;
		default:
			System.out.println("Nisi odabrao važeću opciju");
			break;
		}
		
	}
}
