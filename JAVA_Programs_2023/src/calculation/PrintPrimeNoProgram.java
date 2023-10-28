package calculation;

import java.util.Scanner;

public class PrintPrimeNoProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//Lowest Prime number = 2
		
		int n; boolean Prime=true;
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the Prime number u want");
		n=in.nextInt();
	
		for (int i = 2; i < n; i++) {
			if(n%i==0){

				Prime=false;
				break;

			}
		}
		if(Prime==true)

			System.out.println("Given number is Prime No");
		else
			System.out.println("Given number is not a Prime No");
	}

}
