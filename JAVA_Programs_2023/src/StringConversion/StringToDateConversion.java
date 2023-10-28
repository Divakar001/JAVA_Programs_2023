package StringConversion;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class StringToDateConversion {

	public static void main(String[] args) throws ParseException {
		// TODO Auto-generated method stub
		String sDate1="31/12/1998";
		String sDate2="31-Dec-1998";
		String sDate3="12 31, 1998";
		String sDate4="Thu, Dec 31 1998";
		String sDate5="Thu, Dec 31 1998 23:37:50";
		String sDate6="31-Dec-1998 23:37:50";

		SimpleDateFormat formatter1= new SimpleDateFormat("dd/MM/YYYY");
		SimpleDateFormat formatter2= new SimpleDateFormat("dd-MMM-yyyy");
		SimpleDateFormat formatter3= new SimpleDateFormat("MM dd, yyyy");
		SimpleDateFormat formatter4= new SimpleDateFormat("E, MMM dd yyyy");
		SimpleDateFormat formatter5= new SimpleDateFormat("E, MMM dd yyyy HH:mm:ss");
		SimpleDateFormat formatter6= new SimpleDateFormat("dd-MMM-yyy HH:mm:ss");		
	
		Date Date1=formatter1.parse(sDate1);
		Date Date2=formatter2.parse(sDate2);
		Date Date3=formatter3.parse(sDate3);
		Date Date4=formatter4.parse(sDate4);
		Date Date5=formatter5.parse(sDate5);
		Date Date6=formatter6.parse(sDate6);
		
		
		System.out.println("String To date Converter :");
		System.out.println(sDate1+"\t"+Date1);
		System.out.println(sDate2+"\t"+Date2);
		System.out.println(sDate3+"\t"+Date3);
		System.out.println(sDate4+"\t"+Date4);
		System.out.println(sDate5+"\t"+Date5);
		System.out.println(sDate6+"\t"+Date6);
	
	}
	}
