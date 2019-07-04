package collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class SortMapByKey {

	public static void main(String[] args) {
		Map<String, String> mapString = new HashMap<>();

		mapString.put("f", "vaibhav");
		mapString.put("d", "rahul");
		mapString.put("a", "piyush");
		mapString.put("b", "harshit");
		mapString.put("c", "yogesh");

		sortMapUsingKey(mapString);

	}

	private static void sortMapUsingKey(Map<String, String> mapString) {
		
		Set<String> keySet = mapString.keySet();
		
		List<String> keyList = new ArrayList<>(keySet);
		
		Collections.sort(keyList, (String o1, String o2)-> -o1.compareTo(o2));
		
		HashMap<String,String> linkedHashMap = new LinkedHashMap<String,String>();
		
		for(String key : keyList) {
			linkedHashMap.put(key, mapString.get(key));
		}
		System.out.println(mapString);
		System.out.println(linkedHashMap);
		
		
	}

}
