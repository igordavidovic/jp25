package zadaca;

import java.util.Arrays;

import javax.swing.JOptionPane;

public class TablicaSMetodama {
	private static int ucitajBroj(){
		int a = 0;
		
		while(true) {
			a = Integer.parseInt(JOptionPane.showInputDialog("Upiši pozitivan broj"));
			if(a > 0) {
				break;
			}
		}
		return a;
	}
	
	private static int prozivod(int p1,int p2) {
		int pd = p1 * p2;
		
		return pd;
		
	}
	
	private static int[][] ucitanjeMatrice(int r,int s) {
		int[][] niz = new int[r][s];
		
		return niz;
	}
	
	private static int[][] ispisMatrice(int niz[][]) {
		for(int i = 0;i < niz.length;i++) {
			for(int j = 0;j < niz[0].length;j++) {
				System.out.print(niz[i][j] + " ");
			}
			System.out.println();
		}
		
		return niz;
	}
	public static void main(String[] args) {
		ispisMatrice(ucitanjeMatrice(ucitajBroj(), ucitajBroj()));
	}
}
