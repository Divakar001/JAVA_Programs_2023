package naveenAutomationLabYoutube;

public class RemoveJunkInString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s= "'%%%%% lating STring 0123266566";

		String s1= "@$$$$$$@@@@@ testing $$$$@@@@@@@@@ selenium";
		//Regular expression:[^a-zA-Z0-9]","")

		System.out.println(s.replaceAll("[^a-zA-Z0-9]",""));

		System.out.println(s1.replaceAll("[^a-zA-Z0-9]",""));
		
	
		
	}

}
