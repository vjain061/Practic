package collectionPractic;

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
		
		Map<String,String> mapString = new HashMap<>();
		
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

	private static Map<String,String> sortMap(Map<String, String> mapString) {
		Map<String,String> mapStringSorted = new LinkedHashMap<>();
		
		Set<String> keySet = mapString.keySet();
		List<String> keyList = new ArrayList<>(keySet);
		
		Collections.sort(keyList, new Comparator<String>() {
			@Override
			public int compare(String o1, String o2) {
				return -o1.compareTo(o2);//For descending
			}
		});
		
		System.out.println(keyList);
		
		for(String key : keyList){
			mapStringSorted.put(key, mapString.get(key));
		}
		return mapStringSorted;
	}
	
	

}
