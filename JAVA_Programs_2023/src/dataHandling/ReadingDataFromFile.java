package dataHandling;


import java.io.FileReader;
import java.io.IOException;


public class ReadingDataFromFile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			FileReader fw = new FileReader("New123.txt");
			try {
				
			
			
			int i;
			
			while((i=fw.read())!=-1)
			{
				System.out.print((char)i);
				
			}
			}
			finally{
				
				
				
				fw.close();
			}
		} 
		 
		catch (IOException e) {
		System.out.println(e.getMessage());
		}
		
	}

}
