package calculation;

import java.util.Scanner;

public class FahrenheitToCelsius {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int temperature;
		
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the Fahrenheit Value ");
		
		temperature=in.nextInt();
		temperature=((temperature-32)*5)/9;
	
		System.out.println("Temperature in Celsius "+temperature);
	}

}
