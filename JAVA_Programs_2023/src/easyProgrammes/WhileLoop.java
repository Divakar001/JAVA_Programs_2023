package easyProgrammes;

import java.util.Scanner;

public class WhileLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int c;
		
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the Input values ");
		
		while ((c=in.nextInt())!=0) {
			
			System.out.println("You Entered the value " +c);
		
		}
		System.out.println("Out of Loop");
	}

}
