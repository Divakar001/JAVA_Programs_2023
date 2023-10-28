package dataBaseConnection;

import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class InsertImage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		try {
			Class.forName("oracle.jdbc.driver.oracleDriver");
			Connection con= DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "system", "oracle");
			PreparedStatement stmt=con.prepareStatement("Insert into Emp Values (? , ?)");
			stmt.setString(1, "Tecknology");
			FileInputStream fin= new FileInputStream("d:\\g.jpg");
			stmt.setBinaryStream(2, fin, fin.available());
			int i=stmt.executeUpdate();
			
			System.out.println(i+"Records affected");
			
			con.close();
		
		}		
		
		catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		
	}

}
