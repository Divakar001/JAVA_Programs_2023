package arrayListLinkedListHashMap;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class TreeSetProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet<String>al= new TreeSet<String>();

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
