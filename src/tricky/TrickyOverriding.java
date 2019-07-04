package tricky;

public class TrickyOverriding {

	public static void main(String[] args) {

		Parent p = new Parent();
		Parent p1 = new Child();
		Child c = new Child();

		method(p);
		method(p1);
		method(c);

	}

	public static void method(Parent p) {
		p.m1();
	}

}

class Parent {
	static public void m1() {
		System.out.println("Parent");
	}
}

class Child extends Parent {
	static public void m1() {
		System.out.println("Child");
	}
}
