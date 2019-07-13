package collection;

import java.util.ArrayList;
import java.util.List;

public class Example2 {

	public static void main(String[] args) {
		List list = new ArrayList<>();
		
		list.add("a");
		list.add("b");
		list.add("c");
		
		list.add(1,"d");
		
		list.add(1);
		
		System.out.println(list);
	}

}
