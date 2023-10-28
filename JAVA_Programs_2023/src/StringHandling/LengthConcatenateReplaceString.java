package StringHandling;

public class LengthConcatenateReplaceString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		String s= "Java programming ", t="", u = "";
		System.out.println(s);
		
		//Find Length of String
		n=s.length();
		System.out.println("Number of characters = " +n);
		
		//Replace Characters in String
		
		t= s.replace("Java", "C++");
		System.out.println(t);
		
		//Concatenating /Adding
		
		System.out.println(s.concat("is fun"));
		
		
		
	}

}
