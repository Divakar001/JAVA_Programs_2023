package calculation;

import java.util.Scanner;

public class FactorialNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Factorial , 5 = 5*4*3*2*1
		int x, c, fact=1;

		Scanner number=new Scanner(System.in);
		System.out.println("Enter the Value");
		x= number.nextInt();
		
	if (x <0 )
		System.out.println("Number should be non negative");
	else
	{
		
		for (c = 1; c <= x; c++) 
			
			fact=fact*c;
			System.out.println("Factorial of "+x+" is "+fact);
			
			
		}
	}
	
}




	

