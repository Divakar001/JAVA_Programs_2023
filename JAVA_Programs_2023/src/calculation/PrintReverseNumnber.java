package calculation;

import java.util.Scanner;

public class PrintReverseNumnber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n, Reverse=0;

		System.out.println("Enter the Number for Reverse ");
		Scanner in=new Scanner(System.in);
		n=in.nextInt();

		while(n!=0)
		{

			Reverse=Reverse * 10;
			Reverse=Reverse+n%10;
			n=n/10;
		}
		System.out.println("Reverse of Entered number is "+Reverse);


	}

}
