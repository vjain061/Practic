package collection;

import java.util.HashMap;
import java.util.Map;

public class WhatHappenIfWeOverrideOnlyEqualsMethod {
	public static void main(String[] args) {

		Map<House, String> houseMap = new HashMap<>();
		houseMap.put(new House(1, "vaibhav"), "1");
		houseMap.put(new House(2, "rahul"), "2");
		houseMap.put(new House(3, "piyush"), "3");
		houseMap.put(new House(1, "vaibhav"), "1");

		System.out.println(houseMap);
	}
}

class House {
	private int houseId;
	private String houseName;

	public House(int houseId, String houseName) {
		super();
		this.houseId = houseId;
		this.houseName = houseName;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + houseId;
		result = prime * result + ((houseName == null) ? 0 : houseName.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		House other = (House) obj;
		if (houseId != other.houseId)
			return false;
		if (houseName == null) {
			if (other.houseName != null)
				return false;
		} else if (!houseName.equals(other.houseName))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "House [houseId=" + houseId + ", houseName=" + houseName + "]";
	}

}
