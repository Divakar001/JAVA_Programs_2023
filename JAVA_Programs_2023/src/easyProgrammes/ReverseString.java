package easyProgrammes;

import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String original, reverse="";
		int lenght1;
		System.out.println("Enter the String to Reverse");
		Scanner in=new Scanner(System.in);
		
		original=in.nextLine();
		lenght1=original.length();
		
		
for (int i = lenght1-1; i >=0; i--) {
	reverse=reverse + original.charAt(i);
		System.out.println(reverse);
	}	
}}
	/*
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the String to Reverse");
	String original=in.nextLine();
	
		StringBuffer a = new StringBuffer(original);
		System.out.println(a.reverse());
		*/
	

