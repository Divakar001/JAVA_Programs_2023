package easyProgrammes;

import java.util.Scanner;

public class Swap2WOUsing3rdVariables {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int x,y;
		
		System.out.println("Enter x and Y");
		Scanner In= new Scanner(System.in);
		
		x=In.nextInt();
		y=In.nextInt();
		System.out.println("Before Swapping \n x = "+x+"\n Y = "+y);
		
		x=x+y;
		y=x-y;
		x=x-y;
		
		System.out.println("After Swapping \n x = "+x+"\n Y = "+y);
		
		
		
	}

}
