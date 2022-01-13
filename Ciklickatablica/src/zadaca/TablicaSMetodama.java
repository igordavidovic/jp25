package zadaca;

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
	
	private static int proizvod(int niz[][]) {
		int pd = niz.length * niz[0].length;
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
		proizvod(ispisMatrice(ucitanjeMatrice(ucitajBroj(), ucitajBroj())));
		
	}
}
