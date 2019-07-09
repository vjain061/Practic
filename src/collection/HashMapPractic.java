package collection;

import java.util.HashMap;
import java.util.HashSet;

public class HashMapPractic {

	public static void main(String[] args) {
		HashMap<House, String> stringHashMap = new HashMap<>();
		House vaibhavStudent = new House(1,"vaibhav");
		stringHashMap.put(vaibhavStudent, "first");
		stringHashMap.put(new House(2,"rahul"), "second");
		stringHashMap.put(new House(3,"piyush"), "third");
		stringHashMap.put(new House(4,"harshit"), "forth");
		stringHashMap.put(new House(5,"yogesh"), "five");
		stringHashMap.put(new House(1,"vaibhav"), "first");
		
		//System.out.println(stringHashMap);
		//System.out.println(stringHashMap.size());
		//System.out.println(vaibhavStudent.hashCode());
		
		
		
		HashMap<String,String> h = new HashMap<>();
		System.out.println(h.put("first","first"));
		System.out.println(h.put("first","first"));
		h.put("second","first");
		h.put("third","first");
		h.put("forth","first");
		
		
		
	}

}
