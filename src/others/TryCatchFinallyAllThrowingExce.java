package others;

public class TryCatchFinallyAllThrowingExce {

	public static void main(String[] args) throws Exception {
		try {
			System.out.println("try block");
			throw new Exception();
		} catch (Exception e) {
			System.out.println("catch block");
			throw new Exception();
		}finally{
			System.out.println("finally block");
			throw new Exception();
		}
		
	}

}
