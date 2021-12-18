package vjezba_switch;

import javax.swing.JOptionPane;

public class Vjezba03 {
	public static void main(String[] args) {

		char unos = JOptionPane.showInputDialog(
				"Izaberi jedno od ponuđenih slova \n A B C D E F \n G H I J K L M \n N O P Q R S \n T U V W X Y Z")
				.charAt(0);

		switch (unos) {
		case 'A':
			System.out.println("Appointment");
			break;
		case 'B':
			System.out.println("Bread");
			break;
		case 'C':
			System.out.println("Chorus");
			break;
		case 'D':
			System.out.println("Dream");
			break;
		case 'E':
			System.out.println("Exit");
			break;
		case 'F':
			System.out.println("Film");
			break;
		case 'G':
			System.out.println("Golf");
			break;
		case 'H':
			System.out.println("Hallway");
			break;
		case 'I':
			System.out.println("Issue");
			break;
		case 'J':
			System.out.println("Junior");
			break;
		case 'K':
			System.out.println("Kitchen");
			break;
		case 'L':
			System.out.println("Liberty");
			break;
		case 'M':
			System.out.println("Myth");
			break;
		case 'N':
			System.out.println("Night");
			break;
		case 'O':
			System.out.println("Outlet");
			break;
		case 'P':
			System.out.println("Poem");
			break;
		case 'Q':
			System.out.println("Quality");
			break;
		case 'R':
			System.out.println("Round");
			break;
		case 'S':
			System.out.println("State");
			break;
		case 'T':
			System.out.println("Theater");
			break;
		case 'U':
			System.out.println("Upset");
			break;
		case 'V':
			System.out.println("View");
			break;
		case 'W':
			System.out.println("Wood");
			break;
		case 'X':
			System.out.println("X-ray");
			break;
		case 'Y':
			System.out.println("Youth");
			break;
		case 'Z':
			System.out.println("Zone");
			break;
		default:
			System.out.println("Slovo mora biti veliko kada se unosi ili niste unjeli jedno od ponuđenih slova.");
			break;
		}

	}
}
