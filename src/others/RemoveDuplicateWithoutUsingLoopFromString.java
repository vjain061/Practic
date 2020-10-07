package others;

import java.util.Arrays;

public class RemoveDuplicateWithoutUsingLoopFromString {

	public static void main(String[] args) {
		String str = "PRAKASH";
		char[] strArray = str.toCharArray();
		dupString(strArray, 0);
		System.out.println(Arrays.toString(strArray));
	}

	private static void dupString(char[] strArray, int count) {
		if (count == strArray.length - 1) {
			return;
		}
		int ch = strArray[count];
		count++;
		compareToOther(strArray, ch, count);
		dupString(strArray, count);
	}

	private static void compareToOther(char[] strArray, int ch, int count) {
		if (count == strArray.length - 1) {
			return;
		}
		if (ch == strArray[count]) {
			strArray[count] = '0';
		}
		count++;
		compareToOther(strArray, ch, count);
	}
}
