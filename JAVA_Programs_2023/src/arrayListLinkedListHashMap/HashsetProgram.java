package arrayListLinkedListHashMap;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

public class HashsetProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<String> set = new HashSet<String>();
		set.add("Divakar");
		set.add("Kirthika");
		set.add("Ramesh");
		set.add("Usha");
		Iterator<String> itr=set.iterator();
		while(itr.hasNext()) {

			System.out.println(itr.next());

		}

	}

}
