package cognamPragrams;

public class PalindromeString {

	public static void main(String[] args) {
		String str = "abaaba";
		String newStr = "";
		
		for (int i = str.length()-1; i >= 0; i--) {
			newStr += str.charAt(i);
		}
		
		if(str.equals(newStr)){
			System.out.println("Palindrome");
		}else{
			System.out.println("Not Palindrome");
		}
	}

}
