package easyProgrammes;

import java.util.Scanner;

public class GetInputfromUser_Scanner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

			int a;
			Float b;
			String s;
			
		//For getting the User inputs
		Scanner in= new Scanner (System.in);
		
		System.out.println("Enter the String ");
		s=in.nextLine();
		System.out.println("You entered String Value is "+s);
		
		System.out.println("Enter the Integer ");
		a=in.nextInt();
		System.out.println("You entered integer value is "+a);
		
		System.out.println("Enter the Float ");
		b=in.nextFloat();
		System.out.println("You Entered the Floating value "+b);
		
		
		
	}

}
