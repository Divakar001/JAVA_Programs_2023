package calculation;

import java.util.Scanner;

public class CheckGivenNoPalidrome {

	public static void main(String[] args) {
		
		//Palindrome ex: madam =madam
		String original, reverse="";


		Scanner in=new Scanner(System.in);

		System.out.println("Enter the Values");
		original=in.nextLine();
		int lenght=original.length();
		for (int i = lenght-1; i>=0; i--) {
			
			reverse=reverse+ original.charAt(i);
			
		}
	if (original.equals(reverse)) {
		System.out.println("Given String is Palindrome");
	}
	else {
		
		System.out.println("Given String is not Palindrome");
	}
	
	
		
	
}
}