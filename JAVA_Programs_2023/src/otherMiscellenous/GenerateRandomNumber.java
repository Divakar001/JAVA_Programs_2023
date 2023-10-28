package otherMiscellenous;

import java.util.Random;

public class GenerateRandomNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int c;
		
		Random t = new Random();
		//Random integers in [0,100]
		for ( c = 0; c <=10; c++) {
			System.out.println(+t.nextInt(100));
		}
		
		
		
	}

}
