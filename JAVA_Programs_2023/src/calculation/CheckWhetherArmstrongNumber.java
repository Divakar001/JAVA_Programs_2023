package calculation;

import java.util.Scanner;

public class CheckWhetherArmstrongNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//ex: 370 = (3*3*3)+(7*7*7)+(0*0*0)
		int number;
		System.out.println("Enter the Number to check armstrong ");
		Scanner in=new Scanner(System.in);
		number= in.nextInt();
		int original = number;
		int temp;
		int check =0;
		while(number>0) {
			temp=number%10;
			check=check+(temp*temp*temp);
			number=number/10;
			
				
		}
		if(original==check)
		
		System.out.println("Its a armstrong Number");
		else
			System.out.println("Its not an armstrong Number");
	}

}
