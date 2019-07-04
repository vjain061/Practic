package collectionPractic;

import java.util.TreeMap;

public class TreeMapPractic {

	public static void main(String[] args) {
		TreeMap<String,String> stringTreeMap = new TreeMap<>();
		TreeMap<String,String> stringTreeMapNew = new TreeMap<>();
		stringTreeMap.put("1", "first");
		stringTreeMap.put("5", "five");
		stringTreeMap.put("4", "forth");
		stringTreeMap.put("2", "second");
		stringTreeMap.put("3", "third");
		
		stringTreeMapNew.put("a","1");
		stringTreeMapNew.put("e","5");
		stringTreeMapNew.put("d","4");
		stringTreeMapNew.put("b","2");
		stringTreeMapNew.put("c","3");
		
		System.out.println(stringTreeMap);
		System.out.println(stringTreeMapNew);
	}

}
