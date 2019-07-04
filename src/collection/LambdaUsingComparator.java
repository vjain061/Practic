package collection;

import java.util.ArrayList;
import java.util.List;

public class LambdaUsingComparator {

	public static void main(String[] args) {
		List<String> listString = new ArrayList<>();
		listString.add("vaibhav");
		listString.add("rahul");
		listString.add("piyush");
		listString.add("harshit");
		listString.add("yogesh");
		listString.add("prakash");
		listString.add("ankit");

		System.out.println(listString);
		
		/*
		 * Comparator<String> stringComparator = (String o1, String o2) -> { return
		 * o1.compareTo(o2); };
		 */

		//Collections.sort(listString, stringComparator);
		
		listString.sort((String o1, String o2) -> {
			return o1.compareTo(o2);
		});
		
		System.out.println(listString);
		
		listString.sort((String o1, String o2) -> {
			return o1.compareTo(o2);
		});

	}

}
