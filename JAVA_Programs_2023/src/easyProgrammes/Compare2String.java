package easyProgrammes;

import java.util.Scanner;

public class Compare2String {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		String s1, s2;
		Scanner in= new Scanner(System.in);
		System.out.println("Enter the first String");

		
		s1=in.nextLine();
		System.out.println("Enter the Second String");
		s2=in.nextLine();

		if(s1.compareTo(s2)>0 )
			System.out.println("First string is greater than second String");

		else if(s1.compareTo(s2)<0 )

			System.out.println("Second string is greater than first String");



		else {

			System.out.println("Both Values are equal");
		}
	}

}
