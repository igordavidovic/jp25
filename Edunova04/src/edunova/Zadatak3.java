package edunova;

import javax.swing.JOptionPane;

public class Zadatak3 {

	// Za uneseni cijeli broj program ispisuje da li je prim broj ili nije
	
	//prim broj je onaj broj koji je cjelobrojno djeljiv s brojem 1 i sam s sobom
	// s svim ostalim brojevima između 1 i unesenog broja nije cjelobrjono djeljiv
	
	public static void main(String[] args) {
		//int broj = Integer.parseInt(JOptionPane.showInputDialog("Unesi broj"));
		boolean prim=true;

		for(int t=278; t<2455;t++) {
			prim=true;
			for(int i=2;i<t;i++) {
				//System.out.println(broj + "%" + i + "=" +broj%i);
				if(t%i==0) {
					//System.out.println("Nije prim broj");
					prim=false;
					break;
				}
			}
			//System.out.println(t + " " + (prim ? "je ": "nije ") + "prim broj " );
			if(prim) {
				System.out.println(t);
			}
		
		}
		
		//podzadatak
		//Ispisati sve prim brojeve između 278 i 2455 
		
		
	}
}
