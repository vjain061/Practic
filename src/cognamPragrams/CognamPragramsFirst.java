package cognamPragrams;

public class CognamPragramsFirst {

	public static void main(String[] args) {
		
		String str = "CognamIsAGoodCompany";
		String result = "";
		for (int i = 0; i < str.length(); i++) {
			if(str.charAt(i) >= 65 && str.charAt(i) <= 90 && i != 0){
				result += " ";
			}
			result += str.charAt(i)+""; 
		}
		System.out.println(result);
		
	}

}
