package otherMiscellenous;

import java.sql.Date;



public class StringToSQLDate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str= "2027-10-27";
		Date Date= java.sql.Date.valueOf(str);
		System.out.println(Date);
		
		
		
	}

}
