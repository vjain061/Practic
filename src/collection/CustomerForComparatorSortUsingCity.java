package collection;

import java.util.Comparator;

public class CustomerForComparatorSortUsingCity implements Comparator<CustomerForComparator>{

	@Override
	public int compare(CustomerForComparator o1, CustomerForComparator o2) {
		return o1.getCustomerCity().compareTo(o2.getCustomerCity());
	}

}
