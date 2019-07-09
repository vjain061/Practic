package others;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Java_2d_array_problem {

	private static final Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		int[][] arr = new int[6][6];

		for (int i = 0; i < 6; i++) {
			String[] arrRowItems = scanner.nextLine().split(" ");
			scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

			for (int j = 0; j < 6; j++) {
				int arrItem = Integer.parseInt(arrRowItems[j]);
				arr[i][j] = arrItem;
			}
		}

		int result_max = 0;
		for (int i = 0; i < 4; i++) {

			for (int j = 0; j < 4; j++) {
				int temp = 0;
				for (int p = i; p < i + 3; p++) {
					for (int q = i; q < i + 3; q++) {
						temp += arr[p][q];
					}
				}
				if (temp > result_max)
					result_max = temp;
			}
		}
		System.out.println(result_max);

		scanner.close();
	}
}
