package naveenAutomationLabYoutube;

public class FindingDuplicateString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name[]= {"java", "JAvaScript", "Ruby", "Ruby", "C", "Python", "Python"};

		for (int i = 0; i < name.length; i++) {
			for (int j = i+1; j < name.length; j++) {
				if (name[i]== name[j]) {


					System.out.println("duplicate string is "+name[i]);
				}

			}
		}


	}

}
