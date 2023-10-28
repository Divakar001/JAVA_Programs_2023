package easyProgrammes;

import java.util.Scanner;

public class Swap2NoUsing3rdVariables {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int x, y, temp;
		System.out.println("Enter x and Y");
		Scanner in = new Scanner(System.in);
		
		x=in.nextInt();
		y=in.nextInt();
		
		System.out.println("Before swapping \n x = "+x+"\n Y = " +y );
		temp=x;
		x=y;
		y=temp;
		System.out.println("After swapping \n x = "+x+"\n Y = " +y );
		
		
		
		
	}

}
