package calculation;

import java.io.InputStream;
import java.util.Scanner;

public class FindLargestNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int x, y, z ;
		
		Scanner in=new Scanner(System.in);
		
		System.out.println("Enter Three numbers");
		
		x=in.nextInt();
		y=in.nextInt();
		z=in.nextInt();
		if(x>y && x>z)
		{
			System.out.println("First Number is Greater than 2nd and 3rd number");
		}
		else if(y>x && y>z)
		{
			System.out.println("Second Number is Greater than 1nd and 3rd number");
		}
		
		else if(z>x && z>y)
		{
			System.out.println("Third Number is Greater than 1nd and 2nd number");	
		}
		
		else
		
		{
			System.out.println("Entered numbers are not distinct");
			
		}
	
}}

