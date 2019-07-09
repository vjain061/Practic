package exceptionConcept;

public class ControlFlowInNestedTryCatchFinallyInCaseOfError {

	public static void main(String[] args) {
		try {
			badMethod();
			System.out.println("A");
		} catch (Throwable e) {
			System.out.println("B");
		}finally{
			System.out.println("C");
		}
		System.out.println("D");
	}

	private static String badMethod() {
		throw new Error();
		
	}

}
