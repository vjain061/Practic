package OverridingConcept;

class Parent{
	private void method() {
		
	}
}

public class OverridingPrivateMethod extends Parent {
	
	public void method() {
		
	}

	public static void main(String[] args) {
		System.out.println("Main method");
		
		OverridingPrivateMethod s1 = new OverridingPrivateMethod();
		s1.method(); //line 7
		
		Parent s = new OverridingPrivateMethod();
//		s.method(); // line 10

	}

}
