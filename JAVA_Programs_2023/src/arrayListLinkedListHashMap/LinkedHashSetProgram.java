package arrayListLinkedListHashMap;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedHashSetProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedHashSet<String>al= new LinkedHashSet<String>();

		al.add("Divakar");
		al.add("Kirthika");
		al.add("Ramesh");
		al.add("Usha");
		Iterator<String> itr=al.iterator();
		while(itr.hasNext()) {

			System.out.println(itr.next());

		}

	}





		
		
	

}
