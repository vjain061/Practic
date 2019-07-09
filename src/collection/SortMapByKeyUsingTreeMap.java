package collection;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class SortMapByKeyUsingTreeMap {
	public static void main(String[] args) {

		Map<String, String> mapString = new HashMap<>();

		mapString.put("first", "vaibhav");
		mapString.put("second", "prakash");
		mapString.put("third", "rahul");
		mapString.put("forth", "piyush");
		mapString.put("fifth", "harshit");
		mapString.put("six", "yogesh");
		mapString.put("seven", "pushkar");

		System.out.println(mapString);
		System.out.println(sortMap(mapString));

	}

	private static TreeMap<String, String> sortMap(Map<String, String> mapString) {
		
		TreeMap<String, String> treeMap = new TreeMap<>(mapString);
		
		return treeMap;
	}
}
