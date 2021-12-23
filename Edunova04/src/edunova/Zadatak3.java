package edunova;

import javax.swing.JOptionPane;

public class Zadatak3 {

	// Za uneseni cijeli broj program ispisuje da li je prim broj ili nije
	
	//prim broj je onaj broj koji je cjelobrojno djeljiv s brojem 1 i sam s sobom
	// s svim ostalim brojevima između 1 i unesenog broja nije cjelobrjono djeljiv
	
	public static void main(String[] args) {
		int broj = Integer.parseInt(JOptionPane.showInputDialog("Unesi broj"));
		boolean prim = true;
		
		for(int x = 2;x < broj;x++) {
			prim = true;
			if(broj%x==0) {
				prim = false;
				break;
			}
		}
		System.out.println(broj + " " + (prim ? "je ": "nije ") + "prim broj " );
		
		//podzadatak
		//Ispisati sve prim brojeve između 278 i 2455 
		
		for(int t=278; t<2455;t++) {
			prim=true;
			for(int i=2;i<t;i++) {
				if(t%i==0) {
					prim=false;
					break;
				}
			}
			if(prim) {
				System.out.println(t);
			}
		
		}
		
		
		
	}
}
