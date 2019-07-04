package collectionPractic;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class SortMapByValue {
	public static void main(String[] args) {
		Map<String, String> mapString = new HashMap<>();

		mapString.put("1", "vaibhav");
		mapString.put("2", "prakash");
		mapString.put("3", "rahul");
		mapString.put("4", "piyush");
		mapString.put("5", "harshit");
		mapString.put("6", "yogesh");
		mapString.put("7", "pushkar");
		mapString.put("8", "ankit");

		System.out.println(mapString);
		sortByValue(mapString);
	}

	private static void sortByValue(Map<String, String> mapString) {
		
		Set<Entry<String,String>> entrySetOfMapString = mapString.entrySet();
		
		List<Entry<String,String>> entryListOfMapString = new ArrayList<Entry<String,String>>(entrySetOfMapString);
		
		Collections.sort(entryListOfMapString, new Comparator<Entry<String,String>>() {

			@Override
			public int compare(Entry<String, String> o1, Entry<String, String> o2) {
				return o1.getValue().compareTo(o2.getValue());
			}
		});
		
		System.out.println(entryListOfMapString);
		
	}
	
	
}
