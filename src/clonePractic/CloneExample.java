package clonePractic;

public class CloneExample {
	public static void main(String[] args) throws CloneNotSupportedException {
		StudentForCloneExample studentForCloneExample = getStudentForCloneExample("vaibhav","indore",151);
		
		StudentForCloneExample studentForCloneExampleCloned = studentForCloneExample.clone();
		
		System.out.println(studentForCloneExample);
		System.out.println(studentForCloneExampleCloned);
		
		
	}
	
	private static StudentForCloneExample getStudentForCloneExample(String name,String city,int streetNo){
		StudentForCloneExample studentForCloneExample = new StudentForCloneExample();
		StudentAddressForCloneExample studentAddressForCloneExample = new StudentAddressForCloneExample();
		studentAddressForCloneExample.streetNumber = streetNo;
		studentForCloneExample.studentName = name;
		studentForCloneExample.studentCity = city;
		return studentForCloneExample;
	}
}
