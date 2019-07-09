package stringPractice;

public class StringBuilderTricky {

	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer("My Name Is Vaibhav Jain");
		StringBuilder sb1 = new StringBuilder("My Name Is Vaibhav Jain");
		String s = new String("My Name Is Vaibhav Jain");
		System.out.println(sb.length());
		System.out.println(sb.capacity());
		
		System.out.println(sb1.length());
		System.out.println(sb1.capacity());
		
		System.out.println(s.length());
	}

}
