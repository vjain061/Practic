package collectionPractic;

public class StudentObjectForSortListUsingLambdaExpressionClass implements Comparable<StudentObjectForSortListUsingLambdaExpressionClass> {
	private int studentId;
	private String studentName;

	public StudentObjectForSortListUsingLambdaExpressionClass(int studentId, String studentName) {
		this.studentId = studentId;
		this.studentName = studentName;

	}

	public int getStudentId() {
		return studentId;
	}

	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	@Override
	public int compareTo(StudentObjectForSortListUsingLambdaExpressionClass o) {
		return o.studentId - this.studentId;
	}

	@Override
	public String toString() {
		return "[studentId=" + studentId + ", studentName="
				+ studentName + "]";
	}
	
	

}
