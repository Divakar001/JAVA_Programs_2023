package otherMiscellenous;

import java.util.Scanner;

public class ExeceptionHandlingTryCatchBlock {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//here we taken the Division of two number as the example
		
		int a,b , result;
		Scanner in = new Scanner(System.in);
		
		System.out.println("Enter the values for division");
		a=in.nextInt();
		b=in.nextInt();
		
		try {
			result=a/b;
			
			
			System.out.println("Division values of the two number are "+result);
			
			
		} 
		catch (ArithmeticException e) {
			System.out.println("Divide by zero will throw the error" +e.getMessage());
		}
		
		
	}
	
	

}
