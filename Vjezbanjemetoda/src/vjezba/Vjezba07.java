package vjezba;

import java.util.Arrays;

import javax.swing.JOptionPane;

public class Vjezba07 {
	private static int unesiBroj() {
		int a = 0;
		while(true) {
			a = Integer.parseInt(JOptionPane.showInputDialog("Unesi pozitivan broj"));
			if(a > 0) {
				break;
			}
		}
		return a;
	}
	
	private static int[][] ucitavanjeNiza(int n){
		int[][] niz = new int[n][n];
	
		return niz;
	}
	
	private static void ispisNiza(int[][] niz) {
		for(int i = 0;i < niz.length;i++) {
			System.out.println(Arrays.toString(niz[i]));
		}
	}
	public static void main(String[] args) {
		ispisNiza(ucitavanjeNiza(unesiBroj()));
	}
}
