package calculation;

import java.util.Arrays;

public class CheckingwhetherAnagram {
	//Anagram String is Mary, ARmy like wise
	public static void main(String[] args) {

		String Str1= "Mary";
		String Str2= "army";

		char[] arr1=Str1.toLowerCase().toCharArray();
		char[] arr2=Str2.toLowerCase().toCharArray();
		Arrays.sort(arr1);
		Arrays.sort(arr2);

		if (Arrays.equals(arr1, arr2)) {
			System.out.println("String is anagram ");

		}
		else{
			System.out.println("String is not a anagram ");
		}	

	}

}
