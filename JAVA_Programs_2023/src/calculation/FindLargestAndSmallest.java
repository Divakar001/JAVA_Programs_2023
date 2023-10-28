package calculation;

public class FindLargestAndSmallest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int number[]= {-10, 20, 1500 ,-88, 987};
		int Largest= number[0];
		int Smalllest= number[0];
		
		
		for (int i = 1; i < number.length; i++) {
			
			if(number[i]>Largest) {
				
				Largest=number[i];
				
				
			}
			
			else if(number[i]<Smalllest){
				
				
				Smalllest=number[i];
				
			}
			
		}
		System.out.println("Largest of the number is "+Largest);
		System.out.println("Smallest of the number is "+Smalllest);
		
		
		
				
		
		
		
	}

}
