package stringPractice;

public class ReverceWordsInLine {

	public static void main(String[] args) {
		String line = "ym eman si vahbiav niaj";

		System.out.println(reverseWord(line));
	}

	private static String reverseWord(String line) {

		String resultLine = "";

		String lineArray[] = line.split(" ");

		for (int i = 0; i < lineArray.length; i++) {
			String reverseString = "";
			for (int j = lineArray[i].length() - 1; j >= 0; j--) {
				reverseString += lineArray[i].charAt(j);
			}
			resultLine += " " + reverseString;
		}

		return resultLine;
	}

}
