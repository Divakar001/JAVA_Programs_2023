package arrayListLinkedListHashMap;

import java.util.Iterator;

public class ArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		java.util.ArrayList<String> list= new java.util.ArrayList<String>();

		list.add("Divakar");// adding Object in arrayList
		list.add("Kirthika");
		list.add("Diva");
		//Traversing list through Iterator
		Iterator itr=list.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());

		}

		
		
	}

}
