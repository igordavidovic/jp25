package edunova;

import javax.swing.JOptionPane;

public class E04_TipPodatkaBezParametara {

	public static void main(String[] args) {
		int i = ucitajBroj();
		int j = ucitajBroj();

		System.out.println(i + j);

	}

	public static int ucitajBroj() {
		int vrati = 0;

		while (true) {
			vrati = Integer.parseInt(JOptionPane.showInputDialog("Unesi broj veći od 0"));
			if (vrati > 0) {
				break;
			}
		}

		return vrati;
	}
	
	public static boolean slucajniBoolean() {
		
		int i = (int)(Math.random()*10);
		
		if(i>=5) {
			return false; // short curcuiting
		}
		
		return true;
	}
	
	public static int[] ucitajNiz() {
		int[] niz = new int[ucitajBroj()];

		for(int i=0;i<niz.length;i++) {
			niz[i]=ucitajBroj();
		}
		
		return niz;
	}

}
