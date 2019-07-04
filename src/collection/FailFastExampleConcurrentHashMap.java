package collection;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

public class FailFastExampleConcurrentHashMap {
	public static void main(String[] args) {
		Map<String,String> stringMap = new ConcurrentHashMap<>();

		stringMap.put("1","vaibhav");
		stringMap.put("2","rahul");
		stringMap.put("3","piyush");
		stringMap.put("4","harshit");
		stringMap.put("5","yogesh");
		stringMap.put("6",null);

		Set<String> keySet = stringMap.keySet();
		Iterator<String> iterator  = keySet.iterator();
		
		while (iterator.hasNext()) {
			String element = iterator.next();
			System.out.println(stringMap.get(element));
			if(stringMap.get(element).equals("vaibhav"))
				stringMap.remove(element);
		}

		System.out.println("----------After Removing---------");
		iterator  = keySet.iterator();
		while (iterator.hasNext()) {
			String element = iterator.next();
			System.out.println(stringMap.get(element));
		}

	}
}
