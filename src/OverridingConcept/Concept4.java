package OverridingConcept;

public class Concept4 {
	public static void main(String[] args) {
		Super1 superRef = new Sub();
		Sub subRef = new Sub();
		Super1 suRef = new Super1();

		superRef.tests();
		subRef.tests();
		suRef.tests();
	}
}

class Super1 {
	public static void tests() {
		System.out.println("Super static");
	}
}

class Sub extends Super1 {
	public static void tests() {
		System.out.println("Sub static");
	}
}
