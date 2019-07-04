package collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class SortListElementUsingCollectionsSordMethod {

	public static void main(String[] args) {
		List<String> personList = new ArrayList<>();
		personList.add("vaibhav");
		personList.add("rahul");
		personList.add("piyush");
		personList.add("harshit");
		personList.add("yogesh");
		personList.add("kapil");
		
		System.out.println(personList);
		
		Collection<String> unModifiedPersonList = Collections.unmodifiableCollection(personList);
		
		System.out.println(unModifiedPersonList.add("lksdjfsdfjkl"));
		
		System.out.println(unModifiedPersonList);
		
	}

}
