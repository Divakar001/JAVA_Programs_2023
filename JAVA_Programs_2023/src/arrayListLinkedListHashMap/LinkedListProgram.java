package arrayListLinkedListHashMap;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LinkedList<String> al=new LinkedList<String>();
		al.add("Divakar");
		al.add("Suresh");
		al.add("Palanai");
		al.add("Kumar");
		
		Iterator<String>ITR=al.iterator();
	while (ITR.hasNext()){
		
		System.out.println(ITR.next());
	}
	
	}

}
