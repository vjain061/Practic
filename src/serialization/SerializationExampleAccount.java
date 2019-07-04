package serialization;

import java.io.Serializable;

public class SerializationExampleAccount implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String customerName;
	private int amount;
	transient private String accNo;

	public SerializationExampleAccount(String customerName, int amount, String accNo) {
		this.customerName = customerName;
		this.amount = amount;
		this.accNo = accNo;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}

	@Override
	public String toString() {
		return "SerializationExampleAccount [customerName=" + customerName + ", amount=" + amount + ", accNo=" + accNo
				+ "]";
	}

}
