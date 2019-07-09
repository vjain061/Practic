package exceptionConcept;

public class ExceptionTest3 {
	public static void main(String[] args) throws Exception {
		System.out.println(method1());
	}

	private static StringBuilder method1() throws Exception {
		
		StringBuilder sb = new StringBuilder("rahul ");
		
		try {
			
			return sb.append("sharma ");
		} finally {
			sb.append("bhopal ");
			boolean flag = true;
			if(flag)
				throw new Exception();
			return sb;
		}
	}
}
