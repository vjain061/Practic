package collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ComparableExample {
	public static void main(String[] args) {
		
		Customer c1 = new Customer(1, "vaibhav", "indore");
		Customer c2 = new Customer(2, "rahul", "delhi");
		Customer c3 = new Customer(3, "yogesh", "delhi");
		Customer c4 = new Customer(4, "piyush", "pune");
		Customer c5 = new Customer(5, "harshit", "sagar");
		
		List<Customer> customerList = new ArrayList<Customer>();
		customerList.add(c1);
		customerList.add(c2);
		customerList.add(c3);
		customerList.add(c4);
		customerList.add(c5);
		
		customerList.stream().forEach(System.out::println);
		System.out.println();
		
		Collections.sort(customerList);

		customerList.stream().forEach(System.out::println);
		
	}
}
