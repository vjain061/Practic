package exceptionConcept;

public class ControlFlowInNestedTryCatchFinally {

	public static void main(String[] args) {
		try {
			System.out.println("Statement 1");
			System.out.println("Statement 2");
			System.out.println("Statement 3");
			try {
				System.out.println("Statement 4");
				System.out.println("Statement 5");
				System.out.println("Statement 6");
			} catch (ArithmeticException e) {
				System.out.println("Statement 7");
			} finally {
				System.out.println("Statement 8");
			}
			System.out.println("Statement 9");
		} catch (/* ArithmeticException */ArrayIndexOutOfBoundsException e) {
			System.out.println("Statement 10");
		} finally {
			System.out.println("Statement 11");
		}
		System.out.println("Statement 12");
	}

}

/*
 * This is the perfect example for try, catch and finally block please practice 
 * with different different combinations. Thanks Vaibhav Jain.
 * 
 */
