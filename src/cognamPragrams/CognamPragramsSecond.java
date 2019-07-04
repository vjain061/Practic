package cognamPragrams;

public class CognamPragramsSecond {

	public static void main(String[] args) {
		String firstString = "vaibhav";
		String secondString = "vaaihbv";

		firstString = sortString(firstString);
		secondString = sortString(secondString);

		System.out.println("firstString : " + firstString);
		System.out.println("secondString : " + secondString);

		System.out.println("Pragrams : " + ((firstString.equals(secondString)) ? "true" : "false"));
	}

	private static String sortString(String str) {
		char newstr[] = str.toCharArray();

		for (int i = 0; i < newstr.length; i++) {
			
			for (int j = i + 1; j < newstr.length; j++) {
				
				if (newstr[i] > newstr[j]) {
					char temp = newstr[i];
					newstr[i] = newstr[j];
					newstr[j] = temp;
				}
			}
		}

		return new String(newstr);
	}

}
