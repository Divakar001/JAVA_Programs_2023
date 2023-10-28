package otherMiscellenous;

public class throwExceptionInJAVA {

	static void validate(int age) {
		if(age<18){
			
			throw new ArithmeticException("Not Valid");
			
			
		}
		else
			
			System.out.println("Enter the Vote Rights");
		
		
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		validate(10);
		
		System.out.println("Rest of the code");
	}

}
