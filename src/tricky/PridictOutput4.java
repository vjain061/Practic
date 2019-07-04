package tricky;

public class PridictOutput4 {
	public static void main(String[] args) {
		method("123");
	}
	
	public static void method(String a) {
		System.out.println("String method");
	}
	
	public static void method(StringBuffer a) {
		System.out.println("StringBuffer method");
	}
}

class Parent{
	private void privateMethod() {
		
	}
}
class Child extends Parent {
	private void privateMethod() {
		
	}
}