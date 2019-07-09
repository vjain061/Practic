package collection;

public class HowToFindLengthOfStringUsingCompareToMethod {

	public static void main(String[] args) {
		String str1 = "abc";
		String str2 = "abcd";
		
		System.out.println("Length of str1 : "+str1.compareTo(""));
		
		System.out.println("Length of str2 : "+str2.compareTo(""));
	}

}
