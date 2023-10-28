package easyProgrammes;

import java.util.Scanner;

public class WhileLoopUsingBreakAndContinue {

	public static void main(String[] args) {
	

		int c;
		
		
		Scanner in= new Scanner(System.in);
		while (true) {
			
			System.out.println("enter the Values");
			c=in.nextInt();
			if(c!=0) {
				
				
				System.out.print("You entered "+c);	
				continue;
				
			}
			else {
				
				break;
				
			}
		}
		
		
		
		
	}}


