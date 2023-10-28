package hardProgrammes;

import java.util.Scanner;

public class PrintFloydsTriangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n, num=1, c,d;
		System.out.println("Enter the No of Rows for Floyd Triangles you want ");

		Scanner in= new Scanner(System.in);
		n=in.nextInt();
		for (c = 1; c <= n; c++) {
			for (d = 1; d <= c; d++) {
				System.out.print(num +" ");
				num++;

			}
			System.out.println();
		}





		
		
		
		
		
	}

}
