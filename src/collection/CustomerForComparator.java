package collection;

import java.util.Comparator;

public class CustomerForComparator implements Comparator<CustomerForComparator> {
	private int customerId;
	private String customerName;
	private String customerCity;

	public CustomerForComparator(int customerId, String customerName, String customerCity) {
		super();
		this.customerId = customerId;
		this.customerName = customerName;
		this.customerCity = customerCity;
	}
	
	public CustomerForComparator() {
	}

	@Override
	public String toString() {
		return "Customer [customerId=" + customerId + ", customerName=" + customerName + ", customerCity="
				+ customerCity + "]";
	}

	public int getCustomerId() {
		return customerId;
	}

	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getCustomerCity() {
		return customerCity;
	}

	public void setCustomerCity(String customerCity) {
		this.customerCity = customerCity;
	}

	@Override
	public int compare(CustomerForComparator c1, CustomerForComparator c2) {
		return c1.getCustomerName().compareTo(c2.getCustomerName());
	}

}
