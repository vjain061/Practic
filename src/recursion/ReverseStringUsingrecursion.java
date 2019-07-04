package recursion;

public class ReverseStringUsingrecursion {
	
	static String result = "";

	public static void main(String[] args) {
		String str = "vaibhav";
		System.out.println(reverseStr(str,str.length()-1));
	}

	private static String reverseStr(String str,int index) {
		result += str.charAt(index--)+"";
		if(index > -1)
			reverseStr(str, index);
		return result;
	}

}
