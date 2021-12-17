package vjezba_switch;

import javax.swing.JOptionPane;

public class Vjezba02 {
	public static void main(String[] args) {

		int unos = Integer.parseInt(
				JOptionPane.showInputDialog("Izaberi jedan od zadanih brojeva \n 1 \n 2 \n 3 \n 4 \n 5 \n 6"));

		switch (unos) {
		case 1:
			char a1 = 'A';
			System.out.println(a1);
			break;
		case 2:
			char a2 = 'B';
			System.out.println(a2);
			break;
		case 3:
			char a3 = 'C';
			System.out.println(a3);
			break;
		case 4:
			char a4 = 'Č';
			System.out.println(a4);
			break;
		case 5:
			char a5 = 'Ć';
			System.out.println(a5);
			break;
		case 6:
			char a6 = 'D';
			System.out.println(a6);
			break;
		default:
			System.out.println("Nisi izabrao jedan od ponuđenih brojeva");
			break;
		}
	}
}
