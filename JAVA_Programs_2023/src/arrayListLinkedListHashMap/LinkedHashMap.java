package arrayListLinkedListHashMap;


import java.util.Map;
import java.util.Map.Entry;

public class LinkedHashMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		java.util.TreeMap<Integer, String>map= new java.util.TreeMap<Integer, String>();
		map.put(100, "Divakar");
		map.put(200, "Dhana");
		map.put(300, "Arun");
		map.put(400, "Anto");

		for (Map.Entry m : map.entrySet()) {
			System.out.println(m.getKey()+" "+m.getValue());
		}

	}

}
