package edunova;

import javax.swing.JOptionPane;

public class E06_Program {
	
	// Program učitava broj i ispisuje sve parne brojeve od 1 do tog broja
	public static void main(String[] args) {
		ispisiBrojeve(parniBrojevi(ucitajBroj()));
	}
	
	private static int ucitajBroj() {
		int i;
		while(true) {
			i=Integer.parseInt(JOptionPane.showInputDialog("Unesi broj"));
			if(i>1) {
				return i;
			}
		}
	}
	
	private static int[] parniBrojevi(int broj){
		int[] niz = new int[broj/2];
		int brojac=0;
		for(int i=1;i<broj;i++) {
			if(i%2==0) {
				niz[brojac++]=i;
			}
		}
		return niz;
	}
	
	private static void ispisiBrojeve(int[] niz) {
		for(int i:niz) {
			if(i==0) {
				continue;
			}
			System.out.println(i);
		}
	}

}
