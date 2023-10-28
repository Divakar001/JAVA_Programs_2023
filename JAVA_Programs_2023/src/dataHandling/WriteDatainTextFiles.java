package dataHandling;


import java.io.FileWriter;
import java.io.IOException;

public class WriteDatainTextFiles {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			
			FileWriter fw= new FileWriter("New123.txt"); 
			fw.write("Hi Divakar");
			System.out.println("Value wrote successfully");
			fw.close();
			
			/*
			FileOutputStream file=new FileOutputStream("C:\\Users\\Divakar\\OneDrive\\Documents\\New123.txt");
			file.write(123);
			file.close();
			System.out.println("wrote successfully");
			*/
		} catch (Exception e) {
			System.out.println("File not Found"+e.getMessage());
		}
		}
}
