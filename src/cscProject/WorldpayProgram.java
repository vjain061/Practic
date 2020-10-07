package cscProject;

public class WorldpayProgram {

	public static void main(String[] args) {
		char[] result = processString("ABCABGHY", 2);
		for (int i = 0; i < result.length; i++) {
			System.out.print(" "+result[i]);
		}
	}

	public static char[] processString(String str, int n) {

		char[] arrayStr = str.toCharArray();
		String resultStr = "";
		int count = 1;

		for (int i = 0; i < arrayStr.length; i++) {
			char temp = arrayStr[i];

			for (int j = i + 1; j < arrayStr.length; j++) {

				if (temp == arrayStr[j]) {
					count++;
					arrayStr[i] = '0';
					arrayStr[j] = '0';
				}
				
				

			}

		}

		return arrayStr;

	}
}
