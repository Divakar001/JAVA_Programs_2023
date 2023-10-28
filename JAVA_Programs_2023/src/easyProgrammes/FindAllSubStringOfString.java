package easyProgrammes;

import java.util.Scanner;

public class FindAllSubStringOfString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String string, sub;
		
		Scanner in=new Scanner(System.in);
	int i, c, length;
	System.out.println("Enter the String");
	string=in.nextLine();
	
	length=string.length();
	
	System.out.println("SubString of "+string+" are:- ");
	
	for (c = 1; c < length; c++) {
		for (i = 1; i <=length-c; i++) {
			sub=string.substring(c, c+i);
			System.out.println(sub);
		}
	}
	
	
	
	}

}
