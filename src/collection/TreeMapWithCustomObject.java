package collection;

import java.util.TreeMap;

public class TreeMapWithCustomObject {

	public static void main(String[] args) {
		TreeMap<House,String> treeMapString = new TreeMap<>();
		
		treeMapString.put(new House(1, "vaibhav"), "firstStudent");
		treeMapString.put(new House(2, "rahul"), "secondStudent");
		treeMapString.put(new House(3, "prakash"), "thirdStudent");
		
		System.out.println(treeMapString);
	}

}
