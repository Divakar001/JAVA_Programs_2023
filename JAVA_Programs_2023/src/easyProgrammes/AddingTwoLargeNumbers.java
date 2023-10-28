package easyProgrammes;

import java.math.BigInteger;
import java.util.Scanner;

public class AddingTwoLargeNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String Number1, number2;
		Scanner in= new Scanner(System.in);
		
		
		System.out.println("Enter the First large number");
		Number1=in.nextLine();
			
		System.out.println("Enter the Second large number");
		number2=in.nextLine();
		BigInteger First = new BigInteger(Number1);
		BigInteger Second = new BigInteger(number2);
		BigInteger Sum;
		
		Sum=First.add(Second);
		
		System.out.println("Sum of the two big integer values is "+Sum);
		
		
	}

}
