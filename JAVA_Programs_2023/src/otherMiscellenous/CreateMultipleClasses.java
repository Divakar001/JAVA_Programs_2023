package otherMiscellenous;

public class CreateMultipleClasses {

	CreateMultipleClasses(){
		System.out.println("Executing First");

	}

	void Create_MultipleClasses() {

		System.out.println("Power Gone!! Shut down you PC Soon..");
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Creating two classes with Contructor
		CreateMultipleClasses first = new CreateMultipleClasses();
		secondMethod second = new secondMethod();
		first.Create_MultipleClasses();
		second.Executing_secondMethod();


	}

}

class secondMethod{
	secondMethod(){


		System.out.println("Executing Second");


	}

	void Executing_secondMethod(){
		System.out.println("Your Laptop required to be charge");

	}}
