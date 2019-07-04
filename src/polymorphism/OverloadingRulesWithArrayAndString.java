package polymorphism;

public class OverloadingRulesWithArrayAndString {

	public static void main(String[] args) {
		new OverloadingRulesWithArrayAndString().method("a","b");
	}
	
	
	public void method(String a){
		System.out.println("Method with one argument");
	}

	public void method(String a,String b){
		System.out.println("Method with two argument");
	}
	
	public void method(String... c){
		System.out.println("Method with array argument");
	}
}
