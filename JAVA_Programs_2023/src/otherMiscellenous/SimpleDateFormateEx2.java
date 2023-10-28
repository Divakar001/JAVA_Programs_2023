package otherMiscellenous;

import java.text.SimpleDateFormat;
import java.util.Date;

public class SimpleDateFormateEx2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Date date=new Date();
		SimpleDateFormat formatter= new SimpleDateFormat("dd/MM/yyy");
		String StringDate=formatter.format(date);
		System.out.println("Date format with dd/MM/yyy "+StringDate);
		
		formatter= new SimpleDateFormat("dd-M-yyy hh:mm:ss");
		String StringDate2=formatter.format(date);
		System.out.println("Date format with dd-M-yyy hh:mm:ss is :"+StringDate2);
		
		formatter= new SimpleDateFormat("dd MMMM yyyy");
		String StringDate3=formatter.format(date);
		System.out.println("Date format with dd mmmm yyyy is :"+StringDate3);
		
		formatter= new SimpleDateFormat("dd MMMM yyyy zzzz");
		String StringDate4=formatter.format(date);
		System.out.println("Date format with dd mmmm yyyy zzzz is :"+StringDate4);
		
		
	}

}
