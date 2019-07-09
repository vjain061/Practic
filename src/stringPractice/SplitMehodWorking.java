package stringPractice;

public class SplitMehodWorking {

	public static void main(String[] args) {

		String str = "vaibhav(jain";
		String strResult[] = str.split("(");
		
		System.out.println(strResult[0]);
		System.out.println(strResult[1]);
	}

}
