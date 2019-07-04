package collectionPractic;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ConcurrentModificationException {

	public static void main(String[] args) {
		List<String> studentList = new ArrayList<>();
		studentList.add("vaibhav");
		studentList.add("prakash");
		studentList.add("rahul");
		studentList.add("piyush");
		
		System.out.println(studentList);
		
		Iterator<String> i = studentList.iterator();
		
		while(i.hasNext()){
			String name = i.next();
			if(name.equals("vaibhav")){
				//studentList.remove(name);
				//studentList.add("jain");
				i.remove();
			}
		}
		
		System.out.println(studentList);
	}

}
