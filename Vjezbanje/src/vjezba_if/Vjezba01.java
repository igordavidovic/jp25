package vjezba_if;

import javax.swing.JOptionPane;

public class Vjezba01 {
	public static void main(String[] args) {
		int broj = Integer.parseInt(JOptionPane.showInputDialog("Upiši cijeli broj"));
		
		if(broj > 0) {
			System.out.println("Pozitivan");
		}else if(broj < 0){
			System.out.println("Negativan");
		}else {
			System.out.println("Broj je nula");
		}
		
		System.out.println(broj > 0 ? "Pozitivan" : (broj < 0 ? "Negativan" : "Broj je nula"));
		
	}
}
