package otherMiscellenous;

import java.io.IOException;

public class OpenNotePad {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Runtime Rs=Runtime.getRuntime();
		try {
			Rs.exec("notepad");
		
		} 
		
		catch (IOException e) {
			System.out.println(e.getMessage());
		}
		
		
		
	}

}
