package easyProgrammes;

import java.util.Scanner;

public class NestedIfElseProgramUsingCondition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int MarksObtained, PassingMark;
		char grade;

		PassingMark=40;
		System.out.println("Enter the Mark scored by you");

		Scanner in = new Scanner (System.in);

		MarksObtained=in.nextInt();

		if(MarksObtained>=PassingMark)
		{
			if(MarksObtained>=90) {
				System.out.println("You have taken the A Grade");

			}
			else if(MarksObtained>=75) {
				System.out.println("You have taken the B Grade");

			}
			else if(MarksObtained>=60) {
				System.out.println("You have taken the C Grade");

			}
			else {
				System.out.println("You have taken the D Grade");
			}
		}

		else

			System.out.println("You have failed the exam");


	}

}
