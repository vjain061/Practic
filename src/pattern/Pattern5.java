package pattern;

import java.util.Scanner;

public class Pattern2 {

	public static void main(String[] args) {
		
		//Scanner scan = new Scanner(System.in);
		//System.out.println("Enter Number of row");
		int n = 9;
		
		for (int i = 0; i < n; i++) {
			
			for (int j = 0; j < (n-1)-i; j++) {
				System.out.print(" ");
			}
			for (int k = 0; k < i+1; k++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		
		for (int i = 0; i < 5; i++) {
			
			for (int j = 0; j < n - 1; j++) {
				System.out.print(" ");
			}
			System.out.println("*");
			
		}
	}

}
