package vjezba;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Vjezba1 {
	private Vjezba1() {
		spajanje();
	}
	
	private void spajanje() {
		Connection veza = null;
		
		try {
			Class.forName("org.mariadb.jdbc.Driver");
			veza = DriverManager.getConnection("jdbc:mariadb://127.0.0.1/recepcija", "edunova", "edunova");
			PreparedStatement izraz = veza.prepareStatement("select * from korisnik");
			ResultSet rs = izraz.executeQuery();
			while(rs.next()) {
				System.out.println(rs.getString("ime") + " " + rs.getString("prezime"));
			}
			rs.close();
			izraz.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}catch (ClassNotFoundException e) {
			e.printStackTrace();
		}finally {
			if(veza != null) {
				try {
					veza.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
		
	}

	public static void main(String[] args) {
		new Vjezba1();
	}
}
