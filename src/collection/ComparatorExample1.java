package collectionPractic;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ComparatorExample {
	public static void main(String[] args) {
		CustomerForComparator c1 = new CustomerForComparator(1, "vaibhav", "indore");
		CustomerForComparator c2 = new CustomerForComparator(2, "rahul", "delhi");
		CustomerForComparator c3 = new CustomerForComparator(3, "yogesh", "delhi");
		CustomerForComparator c4 = new CustomerForComparator(4, "piyush", "pune");
		CustomerForComparator c5 = new CustomerForComparator(5, "harshit", "sagar");

		List<CustomerForComparator> customerForComparatorList = new ArrayList<CustomerForComparator>();
		customerForComparatorList.add(c1);
		customerForComparatorList.add(c2);
		customerForComparatorList.add(c3);
		customerForComparatorList.add(c4);
		customerForComparatorList.add(c5);

		Collections.sort(customerForComparatorList,new CustomerForComparator());

		customerForComparatorList.stream().forEach(System.out::println);
		
		System.out.println();
		Collections.sort(customerForComparatorList,new CustomerForComparatorSortUsingCity());

		customerForComparatorList.stream().forEach(System.out::println);
	}

}
