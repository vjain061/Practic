package collection;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class Example1 {

	public static void main(String[] args) {
		HashSet hashSet = new LinkedHashSet();
		hashSet.add("1");
		hashSet.add(1);
		hashSet.add(3);
		hashSet.add(2);
		
		System.out.println(hashSet);
	}

}
