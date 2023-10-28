package dataBaseConnection;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class ConnectDataBase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			//Step 1: Load the driver Class
			
			Class.forName("oracle.jdbc.driver.oracleDriver");
			//Step2: create the connection object
			Connection Con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "system", "oracle");
			//Step3: create the statement object
			Statement stmt=Con.createStatement();
			
			
			//Step4: execute Query
			ResultSet rs=stmt.executeQuery("Select * from emp");
			
			while (rs.next())
				System.out.println(rs.getInt(1)+""+rs.getString(2)+ ""+rs.getString(3));
			
			//Step5 close the connection object 
			Con.close();			
			
		}
		catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
	}

}
