package recursion;

public class findPowerUsingRecursion {

	public static void main(String[] args) {
		System.out.println(findPower(5, 3));
	}

	private static int findPower(int base, int n) {
		if (n == 1)
			return base;
		else {
			base = base * findPower(base, n - 1);
		}
		return base;

	}

}
