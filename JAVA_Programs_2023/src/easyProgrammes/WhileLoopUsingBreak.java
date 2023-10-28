package easyProgrammes;

import java.util.Scanner;

public class WhileLoopUsingBreak {

	public static void main(String[] args) {
		
		
		int n;
		
		Scanner input= new Scanner(System.in);
		
		
		//While loop will perform until when user gives the Zero as value
		while(true) {
			
			System.out.println("Enter the Inputs");
			n=input.nextInt();
			if(n==0) {
				break;
				
				
			}
			System.out.println("You Entered "+n);
		}
		

	}

}
