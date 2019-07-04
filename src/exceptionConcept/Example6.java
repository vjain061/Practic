package exceptionConcept;

public class Example6 {

	public static void main(String[] args) {
		boolean flag = true;
		try {
			try {
				int i = 10 / 0;
				System.out.println(i);
			} catch (Exception e) {
				System.out.println(e);
			}
			if(flag)
				throw new Exception();
			System.out.println("Statement 1");
		} catch (Exception e) {
			System.out.println("Statement 2");
		}
	}
}
