package vjezba_if;

import javax.swing.JOptionPane;

public class Vjezba02 {
	public static void main(String[] args) {
		int a = Integer.parseInt(JOptionPane.showInputDialog("Upiši prvi cijeli broj"));
		
		int b = Integer.parseInt(JOptionPane.showInputDialog("Upiši drugi cijeli broj"));
		
		int c = Integer.parseInt(JOptionPane.showInputDialog("Upiši treći cijeli broj"));
		
		if(a >= b && a >=c) {
			System.out.println(a);
		}else if(b >= a && b >= c) {
			System.out.println(b);
		}else {
			System.out.println(c);
		}
		
		System.out.println(a >= b && a >= c ? a :(b >= a && b >=c ? b : c));
	}
}
