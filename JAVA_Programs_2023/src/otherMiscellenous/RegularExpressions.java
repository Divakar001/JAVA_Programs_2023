package otherMiscellenous;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularExpressions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//1st Way
		Pattern p= Pattern.compile(".s");
		Matcher m=p.matcher("as");
		boolean B=m.matches();
		//2nd way
		Boolean B2=Pattern.compile(".s").matcher("as").matches();
		
		//3rd way
		
		Boolean B3=Pattern.matches(".t", "as");
		System.out.println(B+" "+B2+" "+B3);
		
		
	}

}
