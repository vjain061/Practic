package collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Employee implements Comparator<Employee> {
	String name;
	String age;

	@Override
	public String toString() {
		return "Employee [name=" + name + ", age=" + age + "]";
	}

	public Employee(String name, String age) {
		this.name = name;
		this.age = age;
	}

	public Employee() {

	}

	@Override
	public int compare(Employee o1, Employee o2) {
		return o1.name.compareTo(o2.name);
	}

}

public class ComparatorExample2 {

	public static void main(String[] args) {
		Employee e1 = new Employee("sam","4");
		Employee e2 = new Employee("amy","2");
		
		ArrayList<Employee> arrayList = new ArrayList<Employee>();
		arrayList.add(e1);
		arrayList.add(e2);
		
		Collections.sort(arrayList, new Employee());
		
		System.out.println(arrayList);
	}

}
