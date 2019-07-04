package others;

import java.util.LinkedList;

public class HowToCreateImmutableCustomClass {

	public static void main(String[] args) {
		MutableClass mutableClass = new MutableClass(10);
		ImmutableClass immutableClass = new ImmutableClass("vaibhav",12345,mutableClass);
		System.out.println(immutableClass);
		mutableClass.setFirstVariable(200);
		System.out.println(immutableClass);
		
		LinkedList linkedList = new LinkedList<>();
	}

}

final class ImmutableClass {
	private final String stringVariable;
	private final int intVariable;
	private final MutableClass mutableClass;

	public ImmutableClass(String stringVariable, int intVariable, MutableClass mutableClass) {
		this.stringVariable = stringVariable;
		this.intVariable = intVariable;
		MutableClass mutableClassClone = new MutableClass(mutableClass.firstVariable);
		this.mutableClass = mutableClassClone;
	}

	public String getStringVariable() {
		return stringVariable;
	}

	public int getIntVariable() {
		return intVariable;
	}

	public MutableClass getMutableClass() {
		return mutableClass;
	}

	@Override
	public String toString() {
		return "ImmutableClass [stringVariable=" + stringVariable + ", intVariable=" + intVariable + ", mutableClass="
				+ mutableClass + "]";
	}
	
	

}

class MutableClass {
	public int firstVariable;

	public MutableClass(int firstVariable) {
		this.firstVariable = firstVariable;
	}

	public int getFirstVariable() {
		return firstVariable;
	}

	public void setFirstVariable(int firstVariable) {
		this.firstVariable = firstVariable;
	}

	@Override
	public String toString() {
		return "MutableClass [firstVariable=" + firstVariable + "]";
	}

	
}
