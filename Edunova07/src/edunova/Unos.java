package edunova;

import javax.swing.JOptionPane;

public class Unos {
	
	public static int unesiInt(String poruka) {
		int i=0;
		while(true) {
			i = Integer.parseInt(JOptionPane.showInputDialog(poruka));
			if(i<1) {
				JOptionPane.showMessageDialog(null, "Broj mora biti pozitivan");
				continue;
			}
			return i;
		}
	}
	
	public static double unesiDouble(String poruka) {
		double i=0;
		while(true) {
			i = Double.parseDouble(JOptionPane.showInputDialog(poruka));
			if(i<1) {
				JOptionPane.showMessageDialog(null, "Broj mora biti pozitivan");
				continue;
			}
			return i;
		}
	}
	
	
	public static String unesiString(String poruka) {
		String s="";
		while(true) {
			s = JOptionPane.showInputDialog(poruka);
			if(s.length()==0) {
				JOptionPane.showMessageDialog(null, "Obavezan unos");
				continue;
			}
			return s;
		}
	}

}
