package easyProgrammes;

import java.util.Scanner;

public class CheckingWhetherOddorEven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int x;
		System.out.println("Enter the Value");
		Scanner in = new Scanner(System.in);
		
		x=in.nextInt();
		
		if (x%2==0)
		{
		System.out.println("Entered number is even number");	
			
		}
		else
		{
			System.out.println("Entered number is Odd number");
		}
	}

}
