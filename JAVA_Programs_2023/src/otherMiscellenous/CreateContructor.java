package otherMiscellenous;

public class CreateContructor {
	CreateContructor(){
		
		System.out.println("Executing inside the constructor");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Executing inside the main Program");
		CreateContructor execute= new CreateContructor();
	}

}
