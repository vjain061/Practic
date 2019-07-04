package clonePractic;

public class StudentForCloneExample implements Cloneable{
	public String studentName;
	public String studentCity;
	public StudentAddressForCloneExample studentAddressForCloneExample;
	
	
	@Override
	protected StudentForCloneExample clone() throws CloneNotSupportedException {
	    return (StudentForCloneExample) super.clone();
	}


	@Override
	public String toString() {
		return "StudentForCloneExample [studentName=" + studentName + ", studentCity=" + studentCity + "]";
	}


	
	
}

class StudentAddressForCloneExample{
	public int streetNumber;
	
}
