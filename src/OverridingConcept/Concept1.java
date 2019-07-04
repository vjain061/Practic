package OverridingConcept;

public class Concept1 {
	public static void main(String[] args) {
		Child c = new Child();
		Super1 s = new Child();
		c.method();
		//s.method();
	}
}

class Super{
	private void method() {
		System.out.println("method of super");
	}
}

class Child extends Super1{
	public void method() {
		System.out.println("method of child");
	}
}