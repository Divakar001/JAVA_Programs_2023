package easyProgrammes;

import java.util.Iterator;

public class CommandLineArgument {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Pls use For Each iterator
		//To Run and get the output:
		//Go to the Run configuration and select the Particular Programes
		//Click the arguments and Pass the values and click Run
		
		
		/* for each iterator
		for (String t : args) {
			System.out.println(t);
		}*/
		//For Loop
				
			for (int i = 0; i < args.length; i++) {
				System.out.println(args[i]);
			}
		}
		
	}


