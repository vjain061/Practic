package collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class SortSetElementWithoutUsingSortMethod {

	public static void main(String[] args) {
		Set<String> personList = new HashSet<>();
		personList.add("vaibhav");
		personList.add("rahul");
		personList.add("piyush");
		personList.add("harshit");
		personList.add("yogesh");
		personList.add("kapil");
		
		System.out.println(personList);

		LinkedHashSet<String> sortedSet = new LinkedHashSet<>();
		
		Iterator<String> i_Iterator = personList.iterator();
		
		while(i_Iterator.hasNext()) {
			
			String element = i_Iterator.next();
			Iterator<String> j_Iterator = personList.iterator();
			
			while(j_Iterator.hasNext()) {
				
			}
			
		}
		
	}

}
