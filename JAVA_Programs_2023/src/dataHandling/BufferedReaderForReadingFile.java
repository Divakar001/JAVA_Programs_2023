package dataHandling;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class BufferedReaderForReadingFile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			BufferedReader reader = new BufferedReader(new FileReader("C:\\Users\\Divakar\\eclipse-workspace\\JAVA_Programs_2023\\New123.txt"));
			System.out.print(reader.readLine());
			reader.close();

		} 
		catch (IOException e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
		}
	}

}
