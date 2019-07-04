package recursionPractic;

public class FactorialUsingRecursion {

	
	public static void main(String[] args) {
		
		int n = 5;
		
		System.out.println(calculateFactorial(n));
		System.out.println(calculateFactorialUsingLoop(n));
		
	}

	private static int calculateFactorial(int n) {
		int result = 1;
		if(n == 1)
			return 1;
		else {
			result = n * calculateFactorial(n-1);
		}
		return result;
	}
	
	private static int calculateFactorialUsingLoop(int n) {
		int result = 1;
		while (n >= 1) {
			result = result * n--;
		}
		return result;
	}
	

}
