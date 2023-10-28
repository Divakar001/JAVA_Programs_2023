package arrayListLinkedListHashMap;


import java.util.Hashtable;
import java.util.Map;
import java.util.Map.Entry;

public class HastableProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Hashtable<Integer, String>map= new Hashtable<Integer, String>();
		map.put(100, "Divakar");
		map.put(200, "Dhana");
		map.put(300, "Arun");
		map.put(400, "Anto");

		for (Map.Entry m : map.entrySet()) {
			System.out.println(m.getKey()+" "+m.getValue());
		}

	}

}
