package pattern;

public class Pattern2 {

	public static void main(String[] args) {
   
		int n = 4;
		printPattern(n);
		
	}

	private static void printPattern(int n) {
		for (int i = 1; i <= n; i++) {
			for (int j = i; j <= 3; j++) {
				System.out.print(" ");
			}
			for (int k = i; k >= 1; k--) {
				System.out.print(k);
			}
			for (int l = 2; l <= i; l++) {
				System.out.print(l);
			}
			System.out.println();
		}
		
		for (int i = n-1; i >= 1; i--) {
			for (int j = n-1; j >= i; j--) {
				System.out.print(" ");
			}
			for (int k = i; k >= 1; k--) {
				System.out.print(k);
			}
			for (int l = 2; l <= i; l++) {
				System.out.print(l);
			}
			System.out.println();
		}
	}
}

/*
 *          1
 *         212
 *   	  32123
 *       4321234
 *        32123
 *         121
 *          1
 * 
 */
