package collection;

import java.util.Comparator;
import java.util.TreeSet;

public class TreeSetWorking {

	public static void main(String[] args) {

		TreeSet<StudentForTreeSetWorking> treeSet = new TreeSet<StudentForTreeSetWorking>(new StudentForTreeSetWorking());

		treeSet.add(new StudentForTreeSetWorking("vaibhav"));
		treeSet.add(new StudentForTreeSetWorking("piyush"));
		treeSet.add(new StudentForTreeSetWorking("rahul"));
		treeSet.add(new StudentForTreeSetWorking("harshit"));
		treeSet.add(new StudentForTreeSetWorking("yogesh"));
		treeSet.add(new StudentForTreeSetWorking("ankit"));
		System.out.println(treeSet);
	}

}

class StudentForTreeSetWorking implements Comparator<StudentForTreeSetWorking>{
	private String studentName;
	
	public StudentForTreeSetWorking() {
	}
	
	public StudentForTreeSetWorking(String studentName) {
		this.studentName = studentName;
	}

	@Override
	public String toString() {
		return "StudentForTreeSetWorking [studentName=" + studentName + "]";
	}

	@Override
	public int compare(StudentForTreeSetWorking o1, StudentForTreeSetWorking o2) {
		return o1.studentName.compareTo(o2.studentName);
	}

	

}
