package recursion;

public class FectorialUsingRecursion {

	private static int result1 = 1;
	
	public static void main(String[] args) {
		System.out.println(factorial(5,result1));
	}

	private static int factorial(int i,int result11) {
		if(i == -1)
			return result1;
		else
			result1 = result1 * factorial(i-1,result11);
		return result1;
	}

}
