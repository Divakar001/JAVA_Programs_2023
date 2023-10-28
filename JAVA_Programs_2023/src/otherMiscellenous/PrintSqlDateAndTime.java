package otherMiscellenous;

public class PrintSqlDateAndTime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Printing the system time thru SQL 
		long millisecs=System.currentTimeMillis();
		java.sql.Date date= new java.sql.Date(millisecs);
		System.out.println(date);


	}

}
