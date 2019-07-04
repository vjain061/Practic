package collection;

import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

public class ComparatorExample {

	public static void main(String[] args) {
		List<Student> studentLinkedList = new LinkedList<>();
		studentLinkedList.add(new Student(1, "Vaibhav", "Indore"));
		studentLinkedList.add(new Student(2, "Rahul", "Delhi"));
		studentLinkedList.add(new Student(3, "Piyush", "Pune"));
		studentLinkedList.add(new Student(4, "Harshit", "Sagar"));
		studentLinkedList.add(new Student(5, "Yogesh", "Delhi"));
		
		
		System.out.println(studentLinkedList);
		
		Collections.sort(studentLinkedList, new Comparator<Student>() {

			@Override
			public int compare(Student o1, Student o2) {
				return o1.getStudentName().compareTo(o2.getStudentName());
			}
			
		});
		
		System.out.println(studentLinkedList);
	}

}
