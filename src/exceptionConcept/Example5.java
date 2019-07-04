package exceptionConcept;

public class Example5 {
	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder("vaibhav ");
		System.out.println(method1(sb));
		
	}

	private static StringBuilder method1(StringBuilder sb) {
		try {
			return sb.append("rahul ");
		} finally {
			return sb.append("yogesh ");
		}
	}
}


//what if method argument is final