package calculation;

import java.util.Scanner;

public class FibonacciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Fibonacci series = 0 1 1 2 3 5 7 12
		int n;  
		int first=0;
		int second=1;
		int third=0;
		
		Scanner in= new Scanner(System.in);
		System.out.print("Enter the Values ");
		 n=in.nextInt();
		 
		 System.out.print(first+""+second);
		 for (int i = 2; i <n; i++) {
			
			 third = first +second;
			 System.out.print(""+third);
			 first=second;
			 second=third;
			 
			 
		}
		
		 
		
		
	}

}
