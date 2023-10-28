package dataBaseConnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;

public class InsertDataInTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
try {
	
	Class.forName("oracle.jdbc.driver.oracleDriver");
	Connection con= DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "system", "oracle");
	PreparedStatement stmt=con.prepareStatement("Insert into Emp Values (? , ?)");
	stmt.setInt(1, 101);//1 Specifies the first parameter in the query
	stmt.setString(2, "Ratan");
	int i=stmt.executeUpdate();
	System.out.println(i+ "Records inserted");
	
	con.close();
	
} catch (Exception e) {
	System.out.println(e.getMessage());
}
	}

}
