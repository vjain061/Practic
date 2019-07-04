package collectionPractic;

import java.util.HashMap;
import java.util.Hashtable;

public class HashTablePractic {

	public static void main(String[] args) {
		
		Hashtable<String, String> stringHashTable = new Hashtable<>();
		
		stringHashTable.put("first", "vaibhav");
		stringHashTable.put("second", "piyush");
		stringHashTable.put("third", "rahul");
		stringHashTable.put("forth", "prakash");
		
		stringHashTable.put(null, "fifth");

		System.out.println(stringHashTable);
		
		HashMap<String,String> hashMapString = new HashMap<>();
		hashMapString.put("first", "vaibhav");
	}

}
