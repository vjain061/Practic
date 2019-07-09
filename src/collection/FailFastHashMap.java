package collection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class FailFastHashMap {

	public static void main(String[] args) {
		Map<String,String> stringMap = new HashMap<>();
		stringMap.put("1","1");
		stringMap.put("2","2");
		stringMap.put("3","3");
		stringMap.put("4","4");
		stringMap.put("5","5");
		
		
		Set<String> keySet = stringMap.keySet();
		
		
		Iterator<String> stringIterator = keySet.iterator();
		while(stringIterator.hasNext()){
			String temp = stringIterator.next();
			System.out.println(temp);
			
			if(temp.equals("3"))
				stringMap.remove("3");
			
		}
		System.out.println(stringMap);
	}

}
