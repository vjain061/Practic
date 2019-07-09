package collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class FailFastExample1 {

	public static void main(String[] args) {
		
		Set<String> stringSet = new HashSet<String>();
		stringSet.add("1");
		stringSet.add("2");
		stringSet.add("3");
		stringSet.add("4");
		stringSet.add("5");
		
		Iterator<String> stringIterator = stringSet.iterator();
		while(stringIterator.hasNext()){
			String temp = stringIterator.next();
			System.out.println(temp);
			
			if(temp.equals("3"))
				stringIterator.remove();
			
		}
		System.out.println(stringSet);
	}

}
