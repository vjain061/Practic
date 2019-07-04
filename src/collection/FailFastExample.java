package collection;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class FailFastExample {

	public static void main(String[] args) {
		List<String> stringList = new LinkedList<>();

		stringList.add("vaibhav");
		stringList.add("rahul");
		stringList.add("piyush");
		stringList.add("harshit");
		stringList.add("yogesh");
		
		
		Iterator<String> iterator = stringList.iterator();
		
		while(iterator.hasNext()) {
			String element = iterator.next();
			System.out.println(element);
			stringList.remove(element);
		}
		
		System.out.println("--------------------------");
		while(iterator.hasNext()) {
			String element = iterator.next();
			System.out.println(element);
		}
		

	}

}
