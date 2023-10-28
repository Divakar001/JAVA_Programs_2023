package easyProgrammes;

import java.util.Scanner;

public class IFElseSimpleProgramUsingConditions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int MarksObtained, PassingMarks;
		Scanner in=new Scanner(System.in);

		PassingMarks = 40;

		System.out.println("Enter the Mark scored by you");
		MarksObtained=in.nextInt();
		if(MarksObtained>=PassingMarks)

		{
			System.out.println("You have Passed the Exam");
		}
		else{

			System.out.println("You have not Passed the Exam");
		}
	}

}
